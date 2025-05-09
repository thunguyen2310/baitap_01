//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Nhập input
        String input = hamNhap();
        // Gọi hàm xử lý và in kết quả
        String result = removeVowels(input);
        // Xuất kết quả
        hamXuat(result);
    }
    public static String hamNhap() {
        Scanner scanner = new Scanner(System.in);
        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();
        //scanner.close();
        return input;
    }
    public static void  hamXuat(String result) {
        System.out.println("Chuỗi sau khi xóa nguyên âm: " + result);
    }
    // Hàm kiểm tra ký tự có phải nguyên âm không
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c); // chuyển về chữ thường để kiểm tra
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    // Hàm xóa nguyên âm khỏi chuỗi
    public static String removeVowels(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!isVowel(currentChar)) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}