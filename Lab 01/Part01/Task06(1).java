import java.util.Scanner;
public class Task06{
  
  public static void palindromeChecker(int [] a){
    boolean flag= true;
    for(int i=0,j=a.length-1; i<j; i++,j--){
      if(a[i]!=a[j]){
        flag=false;
        break;
      }
    }
    if(flag){
      System.out.println("Palindrome");
    }else{
      System.out.println("Not Palindrome");
    }
  } 
  
  public static void main(String[]args){
   System.out.println("please enter the length of array");
    Scanner sc= new Scanner(System.in);
    int i=sc.nextInt();
    int arr[] = new int[i];
    System.out.println("please enter the numbers in the array");
    for(int p=0;p<i;p++){
         arr[p]=sc.nextInt();
    }
    palindromeChecker(arr);
  }
}