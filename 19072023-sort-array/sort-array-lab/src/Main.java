import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Random rnd = new Random();


    public static void main(String[] args) {

        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            int randomNumber = getRandomNumber();
            while (isInArray(nums, randomNumber)) {
                randomNumber = getRandomNumber();
            }
            nums[i] = randomNumber;
        }
        System.out.println("Dizideki sayılar: " + Arrays.toString(nums));

        Scanner scanner = new Scanner(System.in);
        while (!isSorted(nums)) {
            System.out.println("Hangi iki sayıyı birbiri ile  " +
                    "değiştirmek istiyorsunuz");
            int firstNumber = scanner.nextInt();
            int secondNumber = scanner.nextInt();
            int firstIndex = getIndex(nums, firstNumber);
            int secondIndex = getIndex(nums, secondNumber);
            if(firstIndex == -1 || secondIndex == -1){
                continue;
            }
            swap(nums, firstIndex, secondIndex);
            System.out.println(Arrays.toString(nums));
        }

        System.out.println("Tebrikler diziyi sıraladınız.");
        System.out.println("Sıralı dizi: " + Arrays.toString(nums));
    }

    private static int getIndex(int[] nums, int number) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == number) {
                return i;
            }
        }
        return -1;
    }

    private static int getRandomNumber() {
        return rnd.nextInt(10) + 1;
    }

    private static boolean isInArray(int[] nums, int randomNumber) {
        for (int num : nums) {
            if (num == randomNumber) {
                return true;
            }
        }
        return false;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

// 5 7 1 5 9
// 1 7 5 5 9
// 1 5 5 7 9
