import java.util.Scanner;
public class Task04{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int [] a= new int[10];
    for(int i=0; i<a.length; i++){
      int x= sc.nextInt();
      boolean flag=true;
      for(int j=0; j<i; j++){
        if(a[j]==x){
          flag=false;
          System.out.println(a[j]+" is already in among the entered numbers. Please enter a new number.");
          i--;
        }
      }
      if(flag){
        a[i]=x;
      }
    }
    for(int i=0; i<a.length; i++){
      System.out.println(a[i]);
    }
  }
}