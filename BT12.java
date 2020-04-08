import java.util.Scanner;

public class BT12
{
    public static void main(String[] args){
        System.out.print("Nhập số a: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Nhập số b: ");
        int b = sc.nextInt();
        int Tong = 0;
        for(int i=1;i<=b;i++)
        {
           Tong += a;
        }
        System.out.print(Tong);
    }
}
