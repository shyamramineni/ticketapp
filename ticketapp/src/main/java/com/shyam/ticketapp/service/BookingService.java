package com.shyam.ticketapp.service;

import com.shyam.ticketapp.entity.Booking;

import java.util.Date;

public class BookingService {

    private static final String CITY = "Hyderabad";
    private static final double THIRD_TICKET_DISCOUNT = 0.5d;
    private static final double AFTERNOON_DISCOUNT = 0.2d;
    public BookingService() {
    }

    public Booking applyRules(Booking booking) {

        booking.setCost(booking.getDiscount() * booking.getShow().getPrice());
        double discount = 0;
        if(booking.getShow().getVenue().getCity().contains(CITY)) {
            if(booking.getSeats() > 2) {
                discount += booking.getShow().getPrice() * THIRD_TICKET_DISCOUNT;
            } if (isAfterNoon(booking.getShow().getShowtime())) {
                discount += booking.getCost() * AFTERNOON_DISCOUNT;
            }
        }
        return booking;
    }

    private boolean isAfterNoon(Date dt) {

        int hours = dt.getHours();
        int min = dt.getMinutes();

        if(hours>=1 || hours<=12){
            return true;
        } else {
            return false;
        }
    }
}
