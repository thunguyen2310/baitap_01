import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = hamNhap();                  // Nhập chuỗi
        String result = xoaKyTuLap(input);         // Xử lý
        hamXuat(result);                           // Xuất kết quả
    }

    // Hàm nhập chuỗi
    public static String hamNhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        return scanner.nextLine();
    }

    // Hàm xuất kết quả
    public static void hamXuat(String result) {
        System.out.println("Chuỗi sau khi xóa ký tự lặp: " + result);
    }

    // Hàm xóa ký tự lặp lại
    public static String xoaKyTuLap(String str) {
        StringBuilder result = new StringBuilder();
        boolean[] appeared = new boolean[256]; // Mảng đánh dấu ký tự ASCII đã xuất hiện

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!appeared[c]) {
                result.append(c);
                appeared[c] = true;
            }
        }

        return result.toString();
    }
}
