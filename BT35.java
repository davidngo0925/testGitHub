import java.util.Scanner;

public class BT35
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Số lượng mảng A");
        int n = sc.nextInt();
        System.out.println("Hãy nhập các phần tử mảng: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Mảng A vừa nhập : ");
        BT32.Xuatmang(a);
        System.out.println(" Trung bình cộng các số lẻ ở vị trí chẵn: ");
        Mot(a,n);
        System.out.println(" Số lớn nhất trong mảng vừa nhập: ");
        Hai(a);
        System.out.println(" Số lớn nhỏ trong mảng vừa nhập: ");
        Ba(a,n);
        System.out.println("Số lượng số chính phương có trong mảng : ");
        Bon(a,n);
        System.out.println(" Các số nguyên tố trong mảng là : ");
        Nam(a);
        System.out.println("Chuỗi sau khi thay đổi : ");
        Sau(a);
        System.out.println("Chuỗi sau khi xóa : ");
        Bay(a);
        System.out.println("Mảng sau khi sắp xếp giảm dần: ");
        Tam(a);
    }
    public static void Mot(int a[], int n)
    {
        int tong = 0;
        for (int i = 0; i < a.length; i += 2)
        {
            if(a[i] % 2 != 0)
            {
                tong += a[i];
            }
        }
        System.out.print(tong);
    }
    public static void Hai(int a[])
    {
        int max = a[0];
        for (int i = 1; i< a.length ; i++)
        {
            if ( a[i] > max )
            {
                max = a[i] ;
            }
        }
       System.out.print(max);
    }
    public static void Ba(int a[], int n)
    {
        int tmp = 0;
        for (int i = 0; i < n; i++)
        {
            for(int j = i+1; j < n; j ++)
            {
                if(a[i] > a[j])
                {
                    a[i] = tmp;
                    a[j] = a[i];
                    tmp = a[j];
                }
            }
        }
        System.out.print(a[0]);
    }
    public static void Bon(int a[], int n)
    {
        int dem = 0;
        for( int i=0; i<a.length ; i++)
        {
            if(a[i]>0)
            {
                int kt = (int)Math.sqrt(a[i]);
                if(kt*kt==a[i])
                {
                    dem++;
                }
            }
        }
        System.out.println(dem);
    }
        public static boolean KTSNT(int n)
        {
            if(n<2) {
                return false;
            }else {
                int k = (int)Math.sqrt(n);
                for(int i=2; i<=k; i++)
                {
                    if( n % i ==0 )
                    {
                        return false;
                    }
                }
            }
            return true;
        }
        public static void Nam(int a[])
        {
            String string = "";
            for (int i = 0; i < a.length ; i++)
            {
                if(KTSNT(a[i])==true)
                {
                    string += a[i]+", ";
                }
            }
            System.out.print(string);
        }
        public static void Sau(int a[]){
            String string = "";
            for (int i = 0; i < a.length ; i++)
            {
                if( a[i] < 0 )
                {
                    string += 0 + ", ";
                }
                else
                {
                    string += a[i] +", " ;
                }
            }
            System.out.println(string);
        }
           public static void Bay(int a[])
           {
            String string = "";
            for (int i = 0; i < a.length ; i++)
            {
                if( a[i] < 0 )
                {
                    string += "" ;
                }
                else
                {
                    string += a[i] + ", ";
                }
            }
            System.out.println(string);
        }
        public static void Tam(int a[])
        {
            int tmp = 0;
            for (int i = 0 ; i < a.length ; i ++)
            {
                for (int j = i+1 ; j < a.length ; j ++)
                {
                    if( a[i] < a[j] )
                    {
                        tmp = a[i];
                        a[i] = a[j];
                        a[j] = tmp;
                    }
                }
            }
            for(int  i = 0 ; i < a.length ; i++)
            {
                System.out.print( a[i] + " " );
            }
        }
}
