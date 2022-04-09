import java.util.Scanner;
public class Task02{ 
  public static void printInfo(int [] arr){
    for(int i=0; i<arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  
  public static int[] swap(int [] arr){
    int max=arr[0];
    int maxLoc=0;
    int min=arr[0];
    int minLoc=0;
    for(int i=0; i<arr.length; i++){
      if(arr[i]>max){
        max=arr[i];
        maxLoc=i;
      }
      if(arr[i]<min){
        min=arr[i];
        minLoc=i;
      }
    }
    int temp= arr[maxLoc];
    arr[maxLoc]= arr[minLoc];
    arr[minLoc]=temp;
    return arr;
  }
  
  public static void main(String [] args){
    Scanner sc= new Scanner(System.in);  
    int [] arr= new int[10];
    for(int i=0; i<arr.length; i++){
      arr[i]= sc.nextInt();
    }
    int [] arr2= swap(arr);
    printInfo(arr2);
  }
}