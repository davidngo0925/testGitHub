import java.util.Scanner;

public class BT9
{
    public static void main(String[] args)
    {
        System.out.println("Nhập n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        testDoWhile(n);
        testFor(n);
        testWhile(n);

    }

    private static void testDoWhile(int n){
        int i = 1;
        int tong = 0;
        do
        {
            tong += i ;
            i++;
        }
        while (i <= n);
        System.out.println("Tổng của dãy số là : " + tong);
        System.out.println("Trung bình là : " + (float) tong/n);
    }
    private static void testFor(int n){
        int i = 1;
        int tong = 0;
        for( i=1 ; i<=n ; i++)
        {
            tong += i ;
        }
        System.out.println("Tổng của dãy số là : " + tong);
        System.out.println("Trung bình là : " + (float) tong/n);
    }
    private static void testWhile(int n){
        int i = 1;
        int tong = 0;
        while (i <= n)
        {
            tong += i ;
            i++;
        }
        System.out.println("Tổng của dãy số là : " + tong);
        System.out.println("Trung bình là : " + (float) tong/n);
    }
}

