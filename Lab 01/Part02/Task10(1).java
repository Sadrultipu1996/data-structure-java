import java.util.Scanner;
public class Task10{
  
  public static int[] leftShift(int [] a, int pos){
    int temp;
    int [] aNew= new int[a.length];
    for(int i=0; i<a.length; i++){
      aNew[i]=a[i];
    }
    for(int i=1; i<=pos; i++){
      temp=aNew[0];
      for(int j=1; j<aNew.length; j++){
        aNew[j-1]=aNew[j];
      }
      aNew[aNew.length-1]=temp;
    }
    return aNew;
  }
  
  public static int[] rightShift(int [] a, int pos){
    int temp;
    int [] aNew= new int[a.length];
    for(int i=0; i<a.length; i++){
      aNew[i]=a[i];
    }
    for(int i=1; i<=pos; i++){
      temp=aNew[aNew.length-1];
      for(int j=aNew.length-1; j>=1; j--){
        aNew[j]=aNew[j-1];
      }
      aNew[0]=temp;
    }
    return aNew;
  }
  
  public static void print(int [] a){
    for(int i=0; i<a.length; i++){
      System.out.print(a[i]+" "); 
    }
    System.out.println();
  }
  
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int [] a= {1,4,8,16,25,36,49,64,81,100};
    int pos= sc.nextInt();
    int [] aLeft= leftShift(a, pos);
    int [] aRight= rightShift(a, pos);
    print(aLeft);
    print(aRight);
  }
}