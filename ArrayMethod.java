import java.util.Scanner;

public class ArrayMethod
{
    public static void main(String[] args)
    {
        int a[]=new int[]{12,43,3,6,8};
        display(a);
        System.out.println(" ");
        int z[]=new int[5];
        z=getvalues();
        display(z);
    }
    public static void display(int b[])
    {
        for(int i=0;i<b.length;i++)
            System.out.println("Value are "+b[i]);
    }
    public static int[] getvalues()
    {  int t[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter values");
           for(int i=0;i<t.length;i++)
               t[i]=sc.nextInt();
           return t;
    }
}
