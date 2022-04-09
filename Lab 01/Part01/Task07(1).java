import java.util.Scanner;
public class Task07{
  
  public static int enterArray(int [] a){
    Scanner sc= new Scanner(System.in);
    for(int i=0; i<a.length; i++){
      a[i]= sc.nextInt();
    }
    System.out.println("Enter a number from 0-9");
    int input= sc.nextInt();
    return a[input];
  }
  
  public static void starPrinter(int num){
    for(int c=1; c<=num; c++){
      System.out.print("*");
    }
  }
  
  public static void main(String[]args){
    int [] a= new int [10];
    int num= enterArray(a);
    starPrinter(num);
  }
}