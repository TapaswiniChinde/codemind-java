import java.util.*;
public class Sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        int d=a-b;
        int e=a*b;
        int f=a/b;
        int g=a%b;
        System.out.println("Sum:"+c);
        System.out.println("Difference:"+d);
        System.out.println("Product:"+e);
        System.out.println("Quotient:"+f);
        System.out.println("Remainder:"+g);
    }
}