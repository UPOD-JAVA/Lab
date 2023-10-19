package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtils {
    // StringUtils  CollectionUtils
    public static void changeScene(ActionEvent event,
                                   String fxmlFile,
                                   String title,
                                   String username) {
        Parent root = null;

        try {
            if (username != null) {
                FXMLLoader loader = new FXMLLoader(DBUtils.class.getResource(fxmlFile));
                root = loader.load();

                LoggedInController loggedInController = loader.getController();
                loggedInController.setUserInformation(username);

            } else {
                root = FXMLLoader.load(DBUtils.class.getResource(fxmlFile));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle(title);
        stage.setScene(new Scene(root, 600, 400));
        stage.show();
    }

    public static void signUpUser(ActionEvent event, String username, String password) {
        Connection connection = null;
        PreparedStatement psInsert = null;
        PreparedStatement psCheckUserExist = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:53000/login-demo",
                            "root", "mypassword");
            psCheckUserExist = connection.prepareStatement("SELECT * FROm users WHERE username = ?");
            psCheckUserExist.setString(1, username);
            resultSet = psCheckUserExist.executeQuery();

            if (resultSet.isBeforeFirst()) {
                System.out.println("User already exist!");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("You can not use this username");
                alert.show();
            } else {
                psInsert = connection.prepareStatement("INSERT INTO users (username,password) VALUES (?,?)");
                psInsert.setString(1, username);
                psInsert.setString(2, password);
                psInsert.executeUpdate();

                var title = "Welcome " + username;

                changeScene(event, "logged-in.fxml", title, username);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }

                if (psCheckUserExist != null) {
                    psCheckUserExist.close();
                }

                if (psInsert != null) {
                    psInsert.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void logInUser(ActionEvent event, String username, String password) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:53000/login-demo",
                            "root", "mypassword");
            preparedStatement = connection.prepareStatement("SELECT password FROM users WHERE username = ? ");
            preparedStatement.setString(1, username);
            resultSet = preparedStatement.executeQuery();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Provided credentials are incorrect");
            if (!resultSet.isBeforeFirst()) {
                System.out.println("User not found in the database");
                alert.show();
            } else {
                while (resultSet.next()) {
                    String retrievedPassword = resultSet.getString("password");

                    if (retrievedPassword.equals(password)) {
                        var title = "Welcome " + username;
                        changeScene(event, "logged-in.fxml", title, username);
                    } else {
                        System.out.println("Password did not match");
                        alert.show();
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
