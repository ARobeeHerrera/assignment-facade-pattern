import FacadeClass.FrontDesk;

import java.util.Scanner;

public class HotelApp {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       FrontDesk frontDesk = new FrontDesk();
       Boolean toRun = true;

       while(toRun) {
           System.out.println("Welcome to Hotel App");
           System.out.println("[1] Vehicle valet parking");
           System.out.println("[2] Luggage cart request");
           System.out.println("[3] Room Cleaning");
           System.out.println("[4] Exit");
           System.out.print("Select a service: ");
           int option = sc.nextInt();
           switch(option) {
               case 1:
                   System.out.print("Enter your plate number: ");
                   String plateNumber = sc.next();
                   frontDesk.valet.setPlateNumber(plateNumber);
                   frontDesk.valet.getService();
                   break;
               case 2:
                   System.out.print("How many cart do you need: ");
                   Integer numberOfCart = sc.nextInt();
                   frontDesk.cart.setNumberOfCarts(numberOfCart);
                   frontDesk.cart.getService();
                   break;
               case 3:
                   System.out.print("Room number: ");
                   String roomNumber = sc.next();
                   frontDesk.houseKeeping.setRoomNumber(roomNumber);
                   frontDesk.houseKeeping.getService();
                   break;
               case 4:
                   System.out.println("Thank you for using the Hotel App");
                   toRun = false;
                   break;
               default:
                   System.out.println("Invalid option");
                   break;
           }
           System.out.println();
       }
    }
}
