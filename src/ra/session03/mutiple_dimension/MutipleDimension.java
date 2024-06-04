package ra.session03.mutiple_dimension;

import java.util.Scanner;

public class MutipleDimension {
    public static void main(String[] args) {
        //Khai báo mảng số nguyên gồm 3 dòng và 4 cột
        int[][] numbers = new int[3][4];
        //Khai báo và khởi tạo mảng số nguyên
        int[][] arrInt = {{1, 2, 3}, {4, 5, 6}};//row=2, col=3
        //1. Nhập giá trị các phần tử của mảng numbers
        Scanner scanner = new Scanner(System.in);
        //Duyệt theo dòng
//        System.out.println("Số dòng: " + numbers.length);
//        System.out.println("Số cột: " + numbers[0].length);
        for (int i = 0; i < numbers.length; i++) {
            //Duyệt theo cột
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("numbers[%d][%d]=", i, j);
                numbers[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        //2. In ra các phần tử của mảng theo ma trận
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("%5d", numbers[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
