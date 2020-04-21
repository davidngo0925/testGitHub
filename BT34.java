import java.util.Scanner;

public class BT34
{
    public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Số lượng mảng A");
            int n = sc.nextInt();
            System.out.println("Hãy nhập các phần tử mảng: ");
            int[] a = new int[n];
            for (int i = 0 ; i<n ; i ++)
            {
                a[i]=sc.nextInt();
            }
        System.out.print("Mảng A vừa nhập : ");
        BT32.Xuatmang(a);
        Xoa(a,n);
    }

        static void xoaViTri(int a[], int n, int vitri)
        {
            for (int i = vitri + 1 ; i<n ; i++)
            {
                a[i-1] = a[i];
                n--;
            }
        }
        static  void Xoa(int a[], int n)
        {
            for( int i = 0 ; i < n - 1 ; i++ )
            {
                for( int j = i + 1 ; j < n ; j++ )
                {
                    if ( a[i] == a[j])
                    {
                        xoaViTri(a,n,j);
                        i--;
                    }
                }
            }

        }
}
