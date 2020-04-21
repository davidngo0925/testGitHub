import javax.swing.*;
import java.util.Scanner;

public class BT31
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Số lượng mảng A" );
        int n = sc.nextInt();
        System.out.println("Hãy nhập các phần tử mảng: " );
        int[] a = new int[n];
        int dem= 1;
        int SL = 0;
        int index = 0;
        for (int i = 0 ; i<n ; i ++)
        {
            a[i]=sc.nextInt();
        }
        for (int i = 1  ; i < n ; i ++)
        {
            if (a[i] - a[i-1] == 1)
            {
                dem++;
                if(SL<dem)
                {
                    SL = dem;
                    index = i;
                }
            }
            else
            {
                dem = 1;
            }
        }
        System.out.println("Độ dài nhất liên tiếp là : " + SL);
        System.out.print("Dãy liên tiếp là:  ");
        for (int i = index - SL + 1 ; i <= index ; i++ )
        {
            System.out.print(a[i]);
        }
    }
}
