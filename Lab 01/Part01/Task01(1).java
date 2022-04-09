import java.util.Scanner;
public class Task01{
  public static boolean firstLast6(int [] arr){
    boolean b= false;
    if(arr[0]==6||arr[arr.length-1]==6){
      b=true;
    }
    return b;
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
    boolean b= firstLast6(arr);
    System.out.println(b);
  }
}