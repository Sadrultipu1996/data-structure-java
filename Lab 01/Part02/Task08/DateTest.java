public class DateTest{
  public static void main(String[]args){
    Date d = new Date(7,8,1999);
    System.out.println("Month: "+d.getMonth()+", Day: "+d.getDay()+", Year: "+d.getYear());
    d.setMonth(10);
    d.setDay(20);
    d.setYear(1996);
    
    d.displayDate();
    
  }
}