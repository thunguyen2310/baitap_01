import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = hamNhap(); // Nhập chuỗi từ bàn phím
        String result = layChuCaiDau(input); // Xử lý lấy chữ cái đầu
        hamXuat(result); // In kết quả
    }

    // Hàm nhập chuỗi
    public static String hamNhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        return scanner.nextLine();
    }

    // Hàm xuất kết quả
    public static void hamXuat(String result) {
        System.out.println("Chữ cái đầu của mỗi từ là: " + result);
    }

    // Hàm lấy chữ cái đầu của mỗi từ
    public static String layChuCaiDau(String str) {
        str = str.trim(); // Loại bỏ khoảng trắng đầu/cuối
        if (str.isEmpty()) return "";

        String[] words = str.split(" "); // Tách theo khoảng trắng
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            // Thêm ký tự đầu viết hoa
            result.append(Character.toUpperCase(word.charAt(0))).append(" ");
        }

        return result.toString().trim(); // Bỏ khoảng trắng cuối cùng
    }
}
