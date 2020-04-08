import java.util.Scanner;

public class BT10 {
    public static void main(String[] args)
    {
        System.out.print("Nhập số hệ nhị phân: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0,i=0;

        while(n!=0)
        {
            a += (( n%10 )*Math.pow(2,i));
            n = n/10;
            i++;
        }
        System.out.println("Decimal number is: " +a);
    }
}
