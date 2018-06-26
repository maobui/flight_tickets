package com.me.bui.flighttickets.network.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by mao.bui on 6/26/2018.
 */
public class Price {
    float price;
    String seats;
    String currency;

    @SerializedName("flight_number")
    String flightNumber;

    String from;
    String to;

    public float getPrice() {
        return price;
    }

    public String getSeats() {
        return seats;
    }

    public String getCurrency() {
        return currency;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }
}
