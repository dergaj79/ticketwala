package com.ticketwala.controller.test;
import static org.junit.Assert.fail;

import java.time.LocalDateTime;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.ticketwala.TicketWalaWebApplication;
import com.ticketwala.dao.api.DataAccessService;
import com.ticketwala.dao.impl.DataAccessServiceImpl;
import com.ticketwala.model.MovieShow;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest(
		webEnvironment = WebEnvironment.DEFINED_PORT,
		classes = TicketWalaWebApplication.class)
public class TicketWalaControllerTest {

	private void prepareDatabase() {
		DataAccessService das =  new  DataAccessServiceImpl();
		das.deleteAllMovieShows();
		das.createMovieShow(new MovieShow("1", "Movie99", LocalDateTime.now(), 90));
		das.createMovieShow(new MovieShow("2", "Movie100", LocalDateTime.now(), 90));
	}
	
	@Test
	public void testGetMovieShow() {
		prepareDatabase();
		get("/movieshow/1")
			.then()
				.body("id", equalTo("1")).and()
					.body("movieName", equalTo("Movie99"));
	}

}
