import java.util.*;
public class Profit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            double x=sc.nextInt();
            double y=sc.nextInt();
            double z=(((y-x)/x)*100);
            System.out.printf("%.2f",z);
        
    }
}