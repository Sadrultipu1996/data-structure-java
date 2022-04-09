import java.util.Scanner;
public class Task09{
  
  public static double calcRoot(int a, int b, int c){
    double root= (-b+(Math.sqrt((b*b)-(4*a*c))))/(2*a);
    return root;
  }
  
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter coeffecients");
    int a= sc.nextInt();
    int b= sc.nextInt();
    int c= sc.nextInt();
    
    String s1,s2,s3;
    
    if(a==1){
      s1= "x2";
    }else if(a== -1){
      s1="-x2";
    }else if(a==0){
      s1="";
    }else{
      s1= a+"x2";
    }
    
    if(b==1){
      s2="x";
    }else if(b== -1){
      s2="-x";
    }
    else if(b==0){
      s2="";
    }else{
      s2= b+"x";
    }
    
    if(a!=0 && b>0){
      s2="+"+s2;
    }
    
    if((a!=0 || b!=0)&&c>0){
      s3="+"+c;
    }else if(c==0 && a!=0 && b!=0){
      s3= "";
    }else if(c==0 && (a!=0 || b!=0)){
      s3= "0";
    }else{
      s3=c+"";
    }
    
    System.out.println(s1+s2+s3);
    double root= calcRoot(a,b,c);
    System.out.println(root);
  }
}