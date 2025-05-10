import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = hamNhap();  // Nhập mảng
        int target = hamNhapTarget();  // Nhập target
        int[] result = twoSum(numbers, target);  // Tìm chỉ số
        hamXuat(result);  // Xuất kết quả
    }

    // Hàm nhập mảng
    public static int[] hamNhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mảng số nguyên (các phần tử cách nhau bởi dấu cách): ");
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        return numbers;
    }

    // Hàm nhập target
    public static int hamNhapTarget() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập target: ");
        return scanner.nextInt();
    }

    // Hàm xuất kết quả
    public static void hamXuat(int[] result) {
        System.out.println("Chỉ số của hai số có tổng bằng target là: [" + result[0] + ", " + result[1] + "]");
    }

    // Hàm tìm hai chỉ số
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[] { left + 1, right + 1 };  // Trả về chỉ số bắt đầu từ 1
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        // Nếu không tìm thấy
        return new int[] {-1, -1};  // Chỉ trả về [-1, -1] khi không tìm thấy kết quả
    }
}
