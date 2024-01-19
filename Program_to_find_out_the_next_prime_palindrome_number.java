import java.util.*;
public class Sol{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t,r=0,d,i;
        //reverse the number
        while(true){
            n++;
            t=n;
            while(t>0){
                r=r*10;
                r=r+t%10;
                t=t/10;
            }
            //check that number is palindrome
            if(r==n){
                d=(int)Math.sqrt(n);
                for(i=2;i<=d;i++){
                    if(n%i==0)
                    break;
                }
                if(i==d+1)
                break;
            }
            r=0;
        }
        System.out.println(n);
    }
}