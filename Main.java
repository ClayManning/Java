
public class Main {
    public static void main(String[] args) {
      Date today = new Date(10,29,1998);
      Date tomorrow = new Date(10,29,2018);
      today.toString();
        System.out.println(today.toString());
      today.print();
      if(today.equals(tomorrow)){
          System.out.printf("They are equal%n");
      }
    }
    
}
