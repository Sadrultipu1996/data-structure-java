public class Task04{
  public static void bin(int x){
    if(x==0){
      return;
    }
    else{
      bin(x/2);
      System.out.print(x%2);
    }
  }
  
  public static void main(String args[]){
    bin(6);
  }
}