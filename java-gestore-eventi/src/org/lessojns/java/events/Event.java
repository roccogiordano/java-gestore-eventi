package org.lessojns.java.events;

import java.text.SimpleDateFormat;
import java.util.Date;


// Event Class Definition

public class Event {


    // Instance Variables Declaration

    protected String eventTitle;
    protected Date eventDate;
    private int totalSeats;
    private int reservedSeats;

    //


    // Event Methods

    public Event (String eventTitle, String eventDateString, int totalSeats) {


        // String to Date Parsing

        try {
            this.eventDate = new SimpleDateFormat("dd/MM/yyyy").parse(eventDateString);
        } catch (java.text.ParseException e) {
            throw new IllegalArgumentException("Enter a valid date");
        }

        //

        if (totalSeats > 0 && eventDate.after(new Date())) {
            this.eventTitle = eventTitle;
            this.totalSeats = totalSeats;
            this.reservedSeats = 0;
        } else if (eventDate.before(new Date())) {
            throw new IllegalArgumentException("The event's date can't be in the past");
        } else if (totalSeats <= 0) {
            throw new IllegalArgumentException("The event's total seats must be greater than 0");
        }
    }


        // Getters and Setters

        public String getTitle() {
            return("The event's title is: " + this.eventTitle);
        }

        public void setTitle(String eventTitle) {
            this.eventTitle = eventTitle;
        }

        public String getDate() {
            return("The event's date is: " + new SimpleDateFormat("dd/MM/yyyy").format(this.eventDate));
        }

        public void setDate(String eventDate) {
            try {
                this.eventDate = new SimpleDateFormat("dd/MM/yyyy").parse(eventDate);
            } catch (java.text.ParseException e) {
                this.eventDate = new Date();
            };
        }

        public String getTotalSeats() {
            return("The event's total seats are: " + this.totalSeats);
        }

        public String getReservedSeats() {
            return("The event's reserved seats are: " + this.reservedSeats);
        }

        public String getAvailableSeats() {
            return("The event's available seats are: " + (this.totalSeats - this.reservedSeats));
        }

        //


    public void reserveSeat(int a) {
        if ((this.reservedSeats + a) <= totalSeats) {
            this.reservedSeats += a;
            System.out.println("Added " + a + " reservation(s) successfully");
        } else if ((this.totalSeats - this.reservedSeats) == 0) {
            System.out.println("Unfortunately, there are no available seats");
        } else {
            System.out.println("Added " + (this.totalSeats - this.reservedSeats) + " reservation(s), no other available seats were present");
            this.reservedSeats = this.totalSeats;
        }
    }

    public void cancelReservation(int a) {
        if ((this.reservedSeats - a) >= 0) {
            this.reservedSeats -= a;
            System.out.println("Cancelled " + a + " reservation(s) successfully");
        } else if (reservedSeats == 0) {
            System.out.println("There are no reservations that can be cancelled");
        } else {
            System.out.println("Cancelled " + this.reservedSeats + " reservation(s), no other reservations were present");
            this.reservedSeats = 0;
        }
    }

    @Override public String toString() {
        return(this.eventTitle + " - " + new SimpleDateFormat("dd/MM/yyyy").format(this.eventDate));
    }

    //


}

//
