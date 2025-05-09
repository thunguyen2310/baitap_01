//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = hamNhap(); // Nhập mảng số nguyên từ bàn phím
        int secondLargest = findSecondLargest(numbers); // Tìm số lớn thứ hai
        hamXuat(secondLargest); // Xuất kết quả
    }

    // Nhập mảng số nguyên từ bàn phím
    public static int[] hamNhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập các số nguyên, cách nhau bằng dấu cách: ");
        String input = scanner.nextLine();

        String[] parts = input.trim().split("\\s+");
        int[] result = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            result[i] = Integer.parseInt(parts[i]);
        }

        return result;
    }

    // Xuất kết quả ra màn hình
    public static void hamXuat(int result) {

            System.out.println( result);

    }

    // Hàm tìm giá trị lớn thứ hai trong mảng
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) return Integer.MIN_VALUE;

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }


        return secondMax;
    }
}

