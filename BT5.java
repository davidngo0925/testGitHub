import java.util.Scanner;

public class BT5 {
    public static void main(String[] args){
        System.out.print("Vui lòng nhập chiều cao của tam giác: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n - i + 1; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int k = i - 1; k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
