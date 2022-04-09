import java.util.Scanner;
public class Task03{
  public static void print(int []a){
    for(int i=0; i<a.length; i++){
      System.out.println(a[i]);
    }
    for(int i=0; i<a.length; i++){
      if(a[i]%2==0){
        System.out.println(a[i]);
      }
    }
  }
  
  public static int[] input(){
    Scanner sc= new Scanner(System.in);
    int [] a= new int[5];
    for(int i=0; i<a.length; i++){
      a[i]= sc.nextInt();
    }
    return a;
  }
  
  public static int[] sort(int [] a){
    for(int i=0; i<a.length; i++){
      for(int j=0; j<i; j++){
        if(a[i]>a[j]){
          int temp= a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
    }
    return a;
  }

  public static void main(String[]args){
    int [] a= input();
    int [] a2= sort(a);
    print(a2);
  }
}