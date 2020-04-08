import java.util.Scanner;

public class BT11 {
    public static void main(String[] args)
    {
        System.out.print("Nhập số hệ nhị phân: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        String hexa="";
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(n>0)
        {
            i = n % 16;
            hexa += hex[i];
            n = n/16;
        }
        System.out.print("Hexadecimal number is: " + hexa);
    }
}
