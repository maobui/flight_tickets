package com.me.bui.flighttickets.network;

import com.me.bui.flighttickets.network.model.Price;
import com.me.bui.flighttickets.network.model.Ticket;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by mao.bui on 6/26/2018.
 */
public interface ApiService {
    @GET("airline-tickets.php")
    Single<List<Ticket>> searchTickets(@Query("from") String from, @Query("to") String to);

    @GET("airline-tickets-price.php")
    Single<Price> getPrice(@Query("flight_number") String flightNumber, @Query("from") String from, @Query("to") String to);
}
