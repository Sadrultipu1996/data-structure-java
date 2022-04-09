import java.util.Scanner;
public class Task08{
  
  public static void sum(int [] a1, int [] a2){
    int [] sum= new int[a1.length];
    for(int i=0; i<sum.length; i++){
      sum[i]= (5*a1[i])-a2[i];
    }
    for(int i=0; i<sum.length; i++){
      System.out.print(sum[i]+" ");
    }
  }
  
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter size");
    int size= sc.nextInt();
    int [] a1= new int[size];
    int [] a2= new int[size];
    for(int i=0; i<a1.length; i++){
      a1[i]=sc.nextInt();
    }
    for(int i=0; i<a2.length; i++){
      a2[i]=sc.nextInt();
    }
    
    sum(a1,a2);
    
  }
}
