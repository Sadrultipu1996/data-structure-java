import java.util.Scanner;
public class Task11{
    public static boolean allDigitOdd(int x){
        boolean odd=true;
        for(int i=x;i!=0;i=i/10){
            int remainder=i%10;
            if(remainder%2==0){
                odd=false;
            }
        }
        return odd;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter an integer");
        int x=sc.nextInt();
        System.out.println(allDigitOdd(x));
    }
}