package ra.session03.single_dimension;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 7, 4};
        //sắp xếp mảng tăng dần
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("Mảng sau khi sắp xếp:");
        for (int element : numbers) {
            System.out.printf("%d\t", element);
        }
        System.out.println();
    }
}
