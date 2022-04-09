import java.util.Scanner;
public class Task05{
 
  public static int[] scan(){
    Scanner sc= new Scanner(System.in);
    int [] a= new int[15];
    for(int i=0; i<a.length; i++){
      a[i]= sc.nextInt();
    }
    return a;
  }
  
  public static void counter(int [] a){
    int [] a2= new int [10];
    for(int i=0; i<a.length; i++){
      a2[a[i]]++;
    }
    for(int i=0; i<a2.length; i++){
      System.out.println(i+" was found "+ a2[i] +" times");
    }
  }
  
  public static void main(String[] args){
    int [] a= scan();
    counter(a); 
  }
}