import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double thuNhap = hamNhap();              // Nhập thu nhập
        double thuePhaiTra = tinhThue(thuNhap);  // Tính thuế
        hamXuat(thuePhaiTra);                    // Xuất kết quả
    }

    // Hàm nhập thu nhập hàng năm
    public static double hamNhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập thu nhập hàng năm (triệu đồng): ");
        return scanner.nextDouble();
    }

    // Hàm xuất thuế phải trả
    public static void hamXuat(double tax) {
        System.out.printf("Số thuế phải trả là: %.2f triệu đồng\n", tax);
    }

    // Hàm tính thuế thu nhập theo từng mức
    public static double tinhThue(double income) {
        double tax = 0;

        if (income <= 5) {
            tax = income * 0.05;
        } else if (income <= 10) {
            tax = 5 * 0.05 + (income - 5) * 0.10;
        } else if (income <= 18) {
            tax = 5 * 0.05 + 5 * 0.10 + (income - 10) * 0.15;
        } else if (income <= 32) {
            tax = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + (income - 18) * 0.20;
        } else if (income <= 52) {
            tax = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + 14 * 0.20 + (income - 32) * 0.25;
        } else if (income <= 80) {
            tax = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + 14 * 0.20 + 20 * 0.25 + (income - 52) * 0.30;
        } else {
            tax = 5 * 0.05 + 5 * 0.10 + 8 * 0.15 + 14 * 0.20 + 20 * 0.25 + 28 * 0.30 + (income - 80) * 0.35;
        }

        return tax;
    }
}
