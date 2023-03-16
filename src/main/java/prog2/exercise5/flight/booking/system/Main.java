package prog2.exercise5.flight.booking.system;

/**
 * Hello world!
 *
 */
import java.util.Scanner;

import java.time.LocalDate;

public class Main 
{
    public static void main( String[] args )
    {
    String DepartingDate="2023-03-12";
    LocalDate depart = LocalDate.parse(DepartingDate);
    String sreturn = "2023-03-14";
    LocalDate returnDate = LocalDate.parse(sreturn);
    Scanner input=new Scanner(System.in);
    System.out.println("Please enter your name");
    String k = input.nextLine();
    System.out.println("Please enter the number of child passengers");
    int b = input.nextInt();
    System.out.println("Please enter the number of adult passengers");
    int a = input.nextInt();
    System.out.println("Please pick your choice of class: 1.First 2.Business 3.Economy");
    int u = input.nextInt();
    System.out.println("Please choose your trip type: 1.One way 2.Return");
    int d = input.nextInt();
    System.out.println("Please choose your trip source: 1.Nanjing 2.Beijing 3.Oulu 4.Helsinki");
    int j = input.nextInt();
    System.out.println("Please choose your trip destination:1.Nanjing 2. Beijing 3.Oulu 4.Helsinki");
    int q = input.nextInt();


 
 
  
     
   
 
    
}

    }


     

