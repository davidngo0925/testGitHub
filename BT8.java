import java.util.Scanner;

public class BT8
{
    public static void main(String[] args)
    {
        System.out.print("Nhập số lượng dãy fibo bạn muốn : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        String Fi = "";
        if( n == 0 )
        {
            Fi = "0";
        }
        else if( n == 1 )
            {
                Fi = "1";
            } else
                {
                    Fi = first + "," + second;
                    for( int i = 3 ; i <= n ; i ++)
                    {
                        int a = first + second;
                        Fi = Fi + "," + a;
                        first = second;
                        second = a;
                    }
                    System.out.print(Fi);
                }
    }
}

