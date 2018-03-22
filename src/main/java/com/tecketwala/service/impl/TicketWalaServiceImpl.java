package com.tecketwala.service.impl;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.ticketwala.command.api.Result;
import com.ticketwala.dao.api.DataAccessService;
import com.ticketwala.model.MovieShow;
import com.ticketwala.model.Order;
import com.ticketwala.model.Seat;
import com.ticketwala.service.api.TicketWalaService;

public  class TicketWalaServiceImpl implements TicketWalaService {
	
	private DataAccessService das;
	
	public TicketWalaServiceImpl(DataAccessService das) {
		this.das = das;
	}
		

	@Override
	public List<MovieShow> getAllMovieShow() {
		return new ArrayList<MovieShow>(das.getAllMovieShows().values());
		
	}

	@Override
	public MovieShow getMovieShow(String movieShowId) {
		return das.findMovieShow(movieShowId);
	}

	// TODO: Need to impl createNewOrderMethod- 22-03-2018
	@Override
	public Result createNewOrder(String movieShowId) {
		Order order = new Order("1", new MovieShow("1", "Movie33", LocalDateTime.now(), 300));
		
		return null;
	}

	@Override
	public Result addSeatTicket(String orderId, Seat s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result submitOrder(String orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result createMovieShow(MovieShow movieShow) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result updateMovieShow(String movieShowId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result deleteOneMovieShow(String movieShowId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delateAllMovieShow() {
		// TODO Auto-generated method stub
		return null;
	}

}
