import java.util.*;
public class Loss{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        double o=(((x-y)/x)*100);
        System.out.printf("%.2f",o);
    }
    
}