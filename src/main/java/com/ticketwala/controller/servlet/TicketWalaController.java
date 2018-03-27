package com.ticketwala.controller.servlet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ticketwala.model.MovieShow;
import com.ticketwala.service.api.TicketWalaService;


@RestController
public class TicketWalaController {
	
	@Autowired
	TicketWalaService ticketWalaService;
	
	@RequestMapping(value = "/movieshows", method = RequestMethod.GET)
	public List<MovieShow> getAllMovieShows() {
		return this.ticketWalaService.getMovieShows();
	}
	
	@RequestMapping(value ="/movieshow/{id}", method = RequestMethod.GET)
	
	public ResponseEntity<MovieShow> getMovieShow(@PathVariable("id") String id) {
		
		MovieShow movieShow = this.ticketWalaService.getMovieShow(id);
		HttpStatus s = movieShow == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;
		
		return new ResponseEntity<MovieShow> (movieShow , s);
	}

}

