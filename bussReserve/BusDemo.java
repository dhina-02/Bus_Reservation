package bussReserve;
import java.util.Scanner;
import java.util.ArrayList;
public class BusDemo {
    public static void main(String[] args) {

     ArrayList<Bus> buses = new ArrayList<Bus>();
     ArrayList<Booking> bookings = new ArrayList<Booking>();

     buses.add(new Bus(1,true,2));
     buses.add(new Bus(2,false,50));
     buses.add(new Bus(3,true,48));

     int userOpt = 1;
     Scanner obj = new Scanner(System.in);
     for (Bus b : buses){
         b.displayBusInfo();
     }



     while(userOpt==1){
         System.out.println("Enter 1 to book and 2 to exit");
         userOpt = obj.nextInt();
         if (userOpt==1){
             Booking booking = new Booking();
             if (booking.isAvailable(bookings,buses)){
                 bookings.add(booking);
                 System.out.println("Your booking confirmed");
             }else {
                 System.out.println("Booking is full");
             }
         }
         else{
             System.out.println("Booking cancelled");
         }
     }
    }
}
