import java.util.Scanner;
class LeapYear {
   public static void main(String[] args){
      int year;
      System.out.println(" ");
      Scanner sc = new Scanner(System.in);
      year = sc.nextInt();

      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         System.out.println("yes");
      else
         System.out.println("no");
   }
}
