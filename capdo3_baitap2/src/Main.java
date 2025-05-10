import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Nhập chuỗi từ bàn phím
        String input = hamNhap();

        // Tìm chuỗi con đối xứng dài nhất
        String result = chuoiDoiXungDaiNhat(input);

        // Xuất kết quả
        hamXuat(result);
    }

    // Hàm nhập chuỗi từ bàn phím
    public static String hamNhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        return scanner.nextLine();
    }

    // Hàm xuất chuỗi kết quả
    public static void hamXuat(String result) {
        System.out.println("Chuỗi con đối xứng dài nhất là: " + result);
    }

    // Hàm kiểm tra xem một chuỗi có phải là chuỗi đối xứng hay không // Bài tập 2 - Cấp độ 2
    public static boolean kiemTraDoiXung(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Hàm tìm chuỗi con đối xứng dài nhất
    public static String chuoiDoiXungDaiNhat(String s) {
        String longest = "";  // Biến lưu chuỗi con đối xứng dài nhất

        // Duyệt qua tất cả các chuỗi con của chuỗi ban đầu
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String subString = s.substring(i, j);  // Lấy chuỗi con từ i đến j

                // Nếu chuỗi con là chuỗi đối xứng và dài hơn chuỗi con hiện tại, lưu lại
                if (kiemTraDoiXung(subString) && subString.length() > longest.length()) {
                    longest = subString;
                }
            }
        }
        return longest;  // Trả về chuỗi con đối xứng dài nhất
    }
}
