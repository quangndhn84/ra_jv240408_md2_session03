package ra.excercise;

import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("*******MENU************");
            System.out.println("1. Nhập số nguyên");
            System.out.println("2. Kiểm tra tính chẵn lẻ của một số:");
            System.out.println("3. Kiểm tra số nguyên tố");
            System.out.println("4. Kiểm tra 1 số có chia hết cho 3 không");
            System.out.println("5. Thoát");
            System.out.println("Lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập vào một số nguyên:");
                    number = Integer.parseInt(scanner.nextLine());
                    break;
                case 2:
                    if (number % 2 == 0) {
                        System.out.printf("%d là số chẵn\n", number);
                    } else {
                        System.out.printf("%d là số lẻ\n", number);
                    }
                    break;
                case 3:
                    boolean isPrime = true;
                    if (number < 2) {
                        isPrime = false;
                    } else {
                        for (int i = 2; i <= Math.sqrt(number); i++) {
                            if (number % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }
                    if (isPrime) {
                        System.out.printf("%d là số nguyên tố\n", number);
                    } else {
                        System.out.printf("%d không phải là số nguyên tố\n", number);
                    }
                    break;
                case 4:
                    if (number % 3 == 0) {
                        System.out.printf("%d chia hết cho 3\n", number);
                    } else {
                        System.out.printf("%d không chia hết cho 3\n", number);
                    }
                    break;
                case 5:
                    System.exit(0);
            }
        } while (true);
    }
}
