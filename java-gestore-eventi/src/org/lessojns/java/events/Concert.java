package org.lessojns.java.events;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.time.LocalTime;


// Concert Class Definition

public class Concert extends Event {


    // Instance Variables Declaration

    private LocalTime eventTime;
    private BigDecimal eventPrice;

    //


    // Concert Methods
    
    public Concert (String eventTitle, String eventDate, String eventTime, int totalSeats, double eventPrice) {

        super(eventTitle, eventDate, totalSeats);

        this.eventTime = LocalTime.parse(eventTime);
        this.eventPrice = new BigDecimal(eventPrice).setScale(2, RoundingMode.HALF_EVEN);

    }


        // Getters and Setters

        public String getTime() {
            return("The event's time is: " + eventTime);
        }

        public void setTime(String eventTime) {
            this.eventTime = LocalTime.parse(eventTime);
        }

        public String getPrice() {
            return("The event's price is: " + eventPrice);
        }

        public void setPrice(float eventPrice) {
            this.eventPrice = new BigDecimal(eventPrice).setScale(2, RoundingMode.HALF_EVEN);
        }

        @Override public String toString() {
            return(this.eventTitle + " - " + new SimpleDateFormat("dd/MM/yyyy").format(this.eventDate) + " | " + this.eventPrice + "$");
        }

        //

    
    //


}

//