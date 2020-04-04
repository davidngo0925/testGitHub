import java.util.Scanner;

public class BT6
{
    public static void main(String[] args){
        System.out.print("Nhập số muốn Convert: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String b = "";
        while (n>0)
        {
            int a = n % 2;
            b = a + b;
            n = n/2;
        }
        System.out.print("Binary : " + b);
    }
}
