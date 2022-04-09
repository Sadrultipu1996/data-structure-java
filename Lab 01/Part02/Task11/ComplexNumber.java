public class ComplexNumber extends RealNumber{
  private double imaginaryValue;
  
  public ComplexNumber(){
    super(1.0);
    imaginaryValue= 1.0;
  }
  public ComplexNumber(int a, int b){
    super(a);
    imaginaryValue= b;
  }
  public double getImaginaryValue(){
    return imaginaryValue;
  }
  public String toString(){
    System.out.println(super.toString());
    return "ImaginaryPart: "+getImaginaryValue();
  }
  public void check(){
    System.out.println("I'm in ComplexNumber class");
    super.ping();
    System.out.println("Checking ended.");
  }
}