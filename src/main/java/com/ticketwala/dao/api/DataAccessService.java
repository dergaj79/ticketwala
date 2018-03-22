package com.ticketwala.dao.api;

import java.util.HashMap;

import com.ticketwala.command.api.Result;
import com.ticketwala.model.MovieShow;
import com.ticketwala.model.Order;

public interface DataAccessService {
	//==============================
		//CRUD Operations for Movie Show
		//==============================
		Result createMovieShow(MovieShow movieShow);
		MovieShow findMovieShow(String movieShowId);
		Result deleteMovieShow(String movieShowId);
		Result updateMovieShow(MovieShow movieShow);
		
		//=====================================
		// Fetch/Delete all Movie Shows from DB
		//=====================================
		HashMap<String, MovieShow> getAllMovieShows();
		Result deleteAllMovieShows();

		/**
		 * Commits a user's order and updates the seats that were taken by this order to be unavailable.
		 * 
		 * @param order
		 * @return Result
		 */
		Result commitOrder(Order order);

}
