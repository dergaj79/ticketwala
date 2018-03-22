package com.ticketwala.service.test;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tecketwala.service.impl.TicketWalaServiceImpl;
import com.ticketwala.dao.api.DataAccessService;
import com.ticketwala.dao.impl.DataAccessServiceImpl;
import com.ticketwala.model.MovieShow;
import com.ticketwala.service.api.TicketWalaService;
import static org.junit.Assert.*;

public class TicketWalaServiceTest {

    private DataAccessService das = new DataAccessServiceImpl();
    private TicketWalaService tws = new TicketWalaServiceImpl(das);
    
		
	
	@Before
    public void setUp() throws Exception {
		das.deleteAllMovieShows();
		das.createMovieShow(new MovieShow("1", "Movie1",LocalDateTime.now(), 130));
		das.createMovieShow(new MovieShow("2", "Movie2",LocalDateTime.now(), 100));
		das.createMovieShow(new MovieShow("3", "Movie3",LocalDateTime.now(), 110));
		das.createMovieShow(new MovieShow("4", "Movie4",LocalDateTime.now(), 10));
		das.createMovieShow(new MovieShow("5", "Movie5",LocalDateTime.now(), 190));
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetAllMovieShow() {
    	List<MovieShow> allMovieShow = tws.getAllMovieShow();
    	assertTrue(allMovieShow.size()== 5);
    	
    }
    @Test
    public void testGetMovieShow() {
    	MovieShow movieShow = tws.getMovieShow("3");
    	assertTrue(movieShow.getId().equals("3"));
    	assertTrue(movieShow.getMovieName().equals("Movie3"));
    }

}

