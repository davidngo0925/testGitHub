import java.util.Scanner;

public class BT7
{
    public static void main(String[] args)
    {
        System.out.print("Bạn muốn kiểm tra từ 0 đến : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Divided by 3: ");
        for(int i = 1 ; i < n; i++ )
        {
            if( i % 3 == 0)
            {
                System.out.print(i+",");
            }
        }
        System.out.println("");
        System.out.println("Divided by 5: ");
        for(int i = 1 ; i < n; i++ )
        {
            if( i % 5 == 0)
            {
                System.out.print(i+",");
            }
        }
        System.out.println("");
        System.out.println("Divided by 3 & 5: ");
        for(int i = 1 ; i < n; i++ )
        {
            if( i % 3 == 0 && i % 5 == 0)
            {
                System.out.print(i+",");
            }
        }
    }
}

