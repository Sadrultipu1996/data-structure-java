import java.util.Scanner;
public class Task10{
  
  public static String season(int month, int day){
    if((month==12 && day>=16)||(month>=1 && month<=2)||(month==3 && day<=15)){
      return "Winter";
    }else if((month==3 && day>=16)||(month>=4 && month<=5)||(month==6 && day<=15)){
      return "Spring";
    }else if((month==6 && day>=16)||(month>=7 && month<=8)||(month==9 && day<=15)){
      return "Summer";
    }
    else{
      return "Fall";
    }
  }
  
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter month");
    int month= sc.nextInt();
    System.out.println("Enter day");
    int day= sc.nextInt();
    String season= season(month,day);
    System.out.println(season);
  }
}