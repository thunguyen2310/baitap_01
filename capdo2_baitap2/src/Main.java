import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = hamNhap(); // Nhập chuỗi
        boolean isPalindrome = kiemTraDoiXung(input); // Kiểm tra đối xứng
        hamXuat(isPalindrome); // Xuất kết quả
    }

    // Hàm nhập chuỗi
    public static String hamNhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        return scanner.nextLine();
    }

    // Hàm xuất kết quả
    public static void hamXuat(boolean result) {
        if (result) {
            System.out.println("Chuỗi là chuỗi đối xứng.");
        } else {
            System.out.println("Chuỗi không phải là chuỗi đối xứng.");
        }
    }

    // Hàm kiểm tra chuỗi đối xứng
    public static boolean kiemTraDoiXung(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
