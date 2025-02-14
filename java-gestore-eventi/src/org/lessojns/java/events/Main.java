package org.lessojns.java.events;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        // Variables Declaration

        String userTitle;
        String concertTitle;
        String userDate;
        String concertDate;
        String concertTime;
        int userTotalSeats;
        int concertTotalSeats;
        int userReservedSeats;
        int userCancelledReservations;
        double concertPrice;
        Boolean userChoiceFirst;
        Boolean userChoiceSecond;

        //
    

        // User Input (Event)

        Scanner Input = new Scanner(System.in);

        System.out.println("Type the event's title...");
        userTitle = Input.nextLine();

        System.out.println("Type the event's date (dd/mm/yyyy)...");
        userDate = Input.nextLine();

        System.out.println("Type the event's total seats...");
        userTotalSeats = Input.nextInt();

        //


        // Event Instance

        Event TestEvent = new Event(userTitle, userDate, userTotalSeats);

        //


        // Event Call to Methods

        System.out.println("Do you want to reserve any seats? (True/False)");
        userChoiceFirst = Input.nextBoolean();

        if (userChoiceFirst) {
            
            System.out.println("How many seats do you want to reserve?");
            userReservedSeats = Input.nextInt();

                TestEvent.reserveSeat(userReservedSeats);

            System.out.println(TestEvent.getReservedSeats());
            System.out.println(TestEvent.getAvailableSeats());

        }

        System.out.println("Do you want to cancel any reservation? (True/False)");
        userChoiceSecond = Input.nextBoolean();

        if (userChoiceSecond) {
            
            System.out.println("How many reservations do you want to cancel?");
            userCancelledReservations = Input.nextInt();

                TestEvent.cancelReservation(userCancelledReservations);

            System.out.println(TestEvent.getReservedSeats());
            System.out.println(TestEvent.getAvailableSeats());

        }

        System.out.println(" ---  ---  ---  ---  --- "); // Line Break

        System.out.println(TestEvent.getTitle());
        System.out.println(TestEvent.getDate());
        System.out.println(TestEvent.getTotalSeats());
        System.out.println(TestEvent.getReservedSeats());
        System.out.println(TestEvent.getAvailableSeats());
        System.out.println(TestEvent.toString());

        //


        System.out.println(" ---  ---  ---  ---  --- "); // Line Break


        // User Input (Concert)

        Input.nextLine(); // Consumes the \n character

        System.out.println("Type the event's title...");
        concertTitle = Input.nextLine();

        System.out.println("Type the event's date (dd/mm/yyyy)...");
        concertDate = Input.nextLine();

        System.out.println("Type the event's time (hh:mm)...");
        concertTime = Input.nextLine();

        System.out.println("Type the event's total seats...");
        concertTotalSeats = Input.nextInt();

        System.out.println("Type the event's price...");
        concertPrice = Input.nextDouble();

        Input.close();

        //


        // Concert Instance

        Concert TestConcert = new Concert(concertTitle, concertDate, concertTime, concertTotalSeats, concertPrice);

        //


        // Concert Call to Methods

        System.out.println(TestConcert.getTitle());
        System.out.println(TestConcert.getDate());
        System.out.println(TestConcert.getTime());
        System.out.println(TestConcert.getTotalSeats());
        System.out.println(TestConcert.getReservedSeats());
        System.out.println(TestConcert.getAvailableSeats());
        System.out.println(TestConcert.getPrice());
        System.out.println(TestConcert.toString());

        //


}


}
