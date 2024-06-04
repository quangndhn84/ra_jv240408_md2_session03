package ra.session03.single_dimension;

import java.util.Scanner;

public class SingleDemension_Demo {
    public static void main(String[] args) {
        //Syntax: Datatype[] arrName = new Datatype[size]
        //1. Khai báo mảng 1 chiều số nguyên gồm 5 phần tử
        int[] numbers = new int[5];//chỉ số cao nhất là 4 (bắt từ 0)
        //2. Khai báo và khởi tạo mảng 1 chiều gồm 5 phần tử với các giá trị: 3.4, 6.8, -2.1, 5, 4
        float[] arrFloat = {3.4F, 6.8F, -2.1F, 5, 4};
        //3. Truy cập vào phần tử của mảng: tên mảng + chỉ số phần tử.
        //Khởi tạo giá trị các phần tử của mảng numbers
        numbers[0] = 10;
        numbers[1] = 5;
        numbers[2] = 8;
        numbers[3] = 4;
        numbers[4] = 1;
        //4. Khai báo mảng kiểu chuỗi chứa tên các sinh viên gồm 3 phần tử
        String[] studentNames = new String[3];
        //5. Nhập giá trị các phần tử của mảng từ bàn phím
        //i chạy theo chỉ số của phần tử
        Scanner scanner = new Scanner(System.in);
        System.out.println("NHẬP THÔNG TIN TÊN CÁC SINH VIÊN");
        for (int i = 0; i < studentNames.length; i++) {
            System.out.printf("studentNames[%d]=",i);
            studentNames[i] = scanner.nextLine();
        }
        //6. In giá trị các phần tử của mảng
        System.out.println("TÊN CÁC SINH VIÊN:");
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println(studentNames[i]);
        }


    }
}
