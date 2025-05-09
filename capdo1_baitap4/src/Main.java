import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = hamNhap(); // Nhập chuỗi từ bàn phím
        int wordCount = demSoTu(input); // Đếm số từ
        hamXuat(wordCount); // Xuất kết quả
    }

    // Hàm nhập chuỗi từ bàn phím
    public static String hamNhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();
        return input;
    }

    // Hàm xuất kết quả ra màn hình
    public static void hamXuat(int count) {
        System.out.println("Số từ trong chuỗi là: " + count);
    }

    // Hàm đếm số từ trong chuỗi
    public static int demSoTu(String str) {
        str = str.trim(); // Bỏ khoảng trắng đầu và cuối chuỗi
        if (str.isEmpty()) return 0; // Chuỗi rỗng thì không có từ nào
        String[] words = str.split(" "); // Tách chuỗi theo khoảng trắng (1 hoặc nhiều)
        return words.length;
    }
}
