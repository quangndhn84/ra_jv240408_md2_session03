package ra.session03.single_dimension;

import java.util.Scanner;

public class UD {
    public static void main(String[] args) {
        /*
         * 1. Nhập vào số phần tử của mảng (size)
         * 2. Khởi tạo mảng số nguyên gồm size phần tử
         * 3. In menu và thực hiện các chức năng theo menu sau:
         *   ****************MENU**************************
         *   1. Nhập giá trị các phần tử của mảng
         *   2. Hiển thị giá trị các phần tử của mảng
         *   3. In ra giá trị các phần tử là số chẵn
         *   4. In ra giá trị các phần tử có chỉ số là lẻ
         *   5. Tính tổng các phần tử trong mảng
         *   6. In giá trị nhỏ nhất và lớn nhất trong mảng
         *   7. Thoát
         *
         * */
        //1. Nhập số phần tử của mảng và khai báo mảng
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[size];
//        int sum;
        do {
//            int sum = 0;
            System.out.println("***************MENU****************");
            System.out.println("1. Nhập giá trị các phần tử");
            System.out.println("2. In giá trị các phần tử");
            System.out.println("3. In giá trị các phần tử chẵn");
            System.out.println("4. In giá trị các phần tử chỉ số lẻ");
            System.out.println("5. Tính tổng các phần tử trong mảng");
            System.out.println("6. In giá trị nhỏ nhất và lớn nhất");
            System.out.println("7. Thoát");
            System.out.print("Lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    //Duyệt từng phần tử trong mảng
                    for (int i = 0; i < numbers.length; i++) {
                        //Thông báo nhập
                        System.out.printf("numbers[%d]=");
                        //Lưu giá trị nhập vào phần tử có chỉ số i của mảng
                        numbers[i] = Integer.parseInt(scanner.nextLine());
                    }
                    break;
                case 2:
                    System.out.println("Các phần tử trong mảng là:");
//                    for (int i = 0; i < numbers.length; i++) {
//                        System.out.printf("%d\t", numbers[i]);
//                    }
                    for (int element : numbers) {
                        System.out.printf("%d\t", element);
                    }
                    System.out.printf("\n");
                    break;
                case 3:
                    System.out.println("Các phần tử có giá trị chẵn là:");
                    for (int element : numbers) {
                        if (element % 2 == 0) {
                            System.out.printf("%d\t", element);
                        }
                    }
                    System.out.printf("\n");
                    break;
                case 4:
                    System.out.println("Các phần tử có chỉ số lẻ là:");
                    for (int i = 0; i < numbers.length; i++) {
                        if (i % 2 != 0) {
                            System.out.printf("%d\t", numbers[i]);
                        }
                    }
                    System.out.println();
                    break;
                case 5:
                    int sum = 0;
                    for (int element : numbers) {
                        sum += element;
                    }
                    System.out.println("Tổng các phần tử trong mảng là: " + sum);
                    break;
                case 6:
                    int min = numbers[0];
                    int max = numbers[0];
                    for (int i = 1; i < numbers.length; i++) {
                        if (min > numbers[i]) {
                            min = numbers[i];
                        }
                        if (max < numbers[i]) {
                            max = numbers[i];
                        }
                    }
                    System.out.printf("Giá trị nhỏ nhất: %d - Lớn nhất: %d\n", min, max);
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng nhập 1-7");
            }
        } while (true);
    }
}
