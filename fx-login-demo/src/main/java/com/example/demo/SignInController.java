package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SignInController implements Initializable {

    @FXML
    private Button button_login;

    @FXML
    private Button button_sign_up;

    @FXML
    private TextField tf_username;

    @FXML
    private TextField tf_password;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        button_sign_up
                .setOnAction(event ->
                        DBUtils.changeScene(event,
                                "sign-up.fxml",
                                "Sign Up!",
                                null)
                );

        button_login.setOnAction(event ->
                DBUtils.logInUser(event, tf_username.getText(), tf_password.getText()));
    }
}
