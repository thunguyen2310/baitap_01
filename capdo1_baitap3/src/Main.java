import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = hamNhap(); // Nhập số nguyên dương
        int sum = tinhTongSoChan(n); // Tính tổng số chẵn từ 0 đến n
        hamXuat(sum); // Xuất kết quả
    }

    // Hàm nhập số nguyên dương từ bàn phím
    public static int hamNhap() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập số nguyên dương n: ");
            n = scanner.nextInt();
        } while (n < 0); // Đảm bảo n không âm
        return n;
    }

    // Hàm xuất kết quả ra màn hình
    public static void hamXuat(int result) {
        System.out.println("Tổng các số chẵn từ 0 đến n là: " + result);
    }

    // Hàm tính tổng các số chẵn từ 0 đến n
    public static int tinhTongSoChan(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
