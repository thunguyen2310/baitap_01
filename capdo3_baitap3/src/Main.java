import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s = hamNhap("Nhập chuỗi s: ");
        String t = hamNhap("Nhập chuỗi t: ");
        String result = timChuoiConNhoNhat(s, t);
        hamXuat(result);
    }

    public static String hamNhap(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }

    public static void hamXuat(String result) {
        if (result.isEmpty()) {
            System.out.println("Không tìm thấy chuỗi con phù hợp.");
        } else {
            System.out.println("Chuỗi con nhỏ nhất chứa tất cả ký tự của t là: " + result);
        }
    }


    public static String timChuoiConNhoNhat(String s, String t) {
        int minLength = Integer.MAX_VALUE;
        String minSubstring = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (chuaTatCaKyTu(sub, t)) {
                    if (sub.length() < minLength) {
                        minLength = sub.length();
                        minSubstring = sub;
                    }
                }
            }
        }

        return minSubstring;
    }

    // Kiểm tra chuỗi con có chứa tất cả ký tự của chuỗi t không
    public static boolean chuaTatCaKyTu(String sub, String t) {
        int[] count = new int[256];
        for (char c : sub.toCharArray()) {
            count[c]++;
        }

        for (char c : t.toCharArray()) {
            if (count[c] == 0) {
                return false;
            }
            count[c]--;
        }

        return true;
    }
}
