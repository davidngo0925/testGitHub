import java.util.Scanner;

public class BT32
{
    public static void main(String[] args)
    {
        System.out.println("Mảng A" );
        int[] a = Nhapmang();

        System.out.println("Mảng B" );
        int[] b = Nhapmang();
        System.out.print("Mảng A vừa nhập : ");
        Xuatmang(a);
        System.out.print("Mảng B vừa nhập : ");
        Xuatmang(b);
        System.out.println("Ghép mảng A và B ta được: ");
        int[] c = Ghepmang(a,b);
        Xuatmang(c);
    }
    public static int[] Nhapmang()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập số phần tử: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhập giá trị phần tử: ");
        for (int i = 0 ; i < a.length ; i++)
        {
            System.out.print( "a["+i+"]=" );
            a[i] = sc.nextInt();
        }

        return a;
    }
    public static void Xuatmang( int a[] )
    {
        for( int i =0 ; i < a.length ; i++)
        {
            System.out.print( a[i]+" " );
        }
    }
    public static int[] Ghepmang( int []a , int []b )
    {
        int i = 0;
        int j = 0;
        int [] c = new int[ a.length + b.length ];
        for( int k = 0 ; k <= c.length; k++ )
        {
            if( i < a.length && j < b.length )
            {
                if( a[i] <= b[j] )
                {
                    c[k] = a [i];
                    i++;
                }
                else
                {
                    c[k] = b[j];
                    j++;
                }
            }
            else
                if( i < a.length )
                {
                    c[k]= a[i];
                    i++;
                }
                else
                    if ( j < b.length )
                {
                    c[k]= b[j];
                    j++;
                }
        }

        return c;
    }


}
