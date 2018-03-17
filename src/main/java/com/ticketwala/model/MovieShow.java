package com.ticketwala.model;
import java.time.LocalDateTime;

/**
 * @author dasst

 */
public class MovieShow {
    private static final int CINEMA_SEATS_IN_A_ROW =5;
    private static final int CINEMA_ROWS =5;
    private static final double TICKET_PRICE = 40.30;

    private String id;
    private String movieName;
    private LocalDateTime time;
    private int durationInMinute;
    private CinemaHall cinemaHall;

    /**
     * this MoveShow class contractor
     *
     * @param id               this the String ID of MovieShow
     * @param movieName        this the name of movie
     * @param time             this will get the local date time using LocalDateTime Class
     * @param durationInMinute this the movie duration
     */
    public MovieShow(String id, String movieName, LocalDateTime time, int durationInMinute) {
        this.id = id;
        this.movieName = movieName;
        this.time = time;
        this.durationInMinute = durationInMinute;
        this.cinemaHall = new CinemaHall(CINEMA_ROWS,CINEMA_SEATS_IN_A_ROW,TICKET_PRICE);
    }

    public String getId() {
        return id;
    }

    public String getMovieName() {
        return movieName;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public int getDurationInMinute() {
        return durationInMinute;
    }

    public CinemaHall getCinemaHall() {
        return cinemaHall;
    }

    public double getTicketPrice() {
        return TICKET_PRICE;
    }

    /**
     * this method will return  the class toString
     */
    @Override
    public String toString() {
        return "MovieShow{" + "id='" + id + '\'' +
                ", movieName='" + movieName + '\'' +
                ", time=" + time +
                ", durationInMinute=" + durationInMinute + '}';
    }
}
