import java.util.Scanner;
public class Task12{
  
  public static boolean compare(int month1, int day1, int month2, int day2){
    if(month1<month2){
      return true;
    }else if(month1==month2){
      if(day1<day2){
        return true;
      }else{
        return false;
      }
    }else{
      return false;
    }
  }
  
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter 1st month");
    int month1= sc.nextInt();
    System.out.println("Enter 1st day");
    int day1= sc.nextInt();
    System.out.println("Enter 2nd month");
    int month2= sc.nextInt();
    System.out.println("Enter 2nd day");
    int day2= sc.nextInt();
    boolean b= compare(month1, day1, month2, day2);
    System.out.println(b);
  }
}