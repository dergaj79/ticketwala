package com.ticketwala.service.api;

import java.util.List;

import com.ticketwala.command.api.Result;
import com.ticketwala.model.MovieShow;
import com.ticketwala.model.Seat;

public interface TicketWalaService {
	//user actions
	
	
	List<MovieShow> getAllMovieShow();
	
	MovieShow getMovieShow(String movieShowId);
	
	
	Result createNewOrder(String movieShowId);
	
	
	Result addSeatTicket(String orderId , Seat s);
	Result submitOrder(String orderId);
	
	//Admin Actions
	
	Result createMovieShow(MovieShow movieShow);
	Result updateMovieShow(String movieShowId);
	Result deleteOneMovieShow(String movieShowId);
	Result delateAllMovieShow();
	
}
