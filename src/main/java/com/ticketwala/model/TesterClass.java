package com.ticketwala.model;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.time.LocalDateTime;

/**
 * Main class that help to tests each class under project ticketwala.
 */
public class TesterClass {
    public static void main (String[] args) {
        Seat s1 = new Seat (1, 1, 10);
        Seat s2 = new Seat (2, 2, 20);
        Seat s3 = new Seat (3, 3, 30);
        Seat s4 = new Seat (4, 4, 40);
        s1.setSold (true);
        s2.setSold (true);
        s3.setSold (true);
        s4.setSold (true);
        System.out.println ("print s1 value: " + s1);
        System.out.println ("print s2 value: " + s2);
        System.out.println ("print s3 value: " + s3);
        System.out.println ("print s4 value: " + s4);
        System.out.println ("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ \n");

        CinemaHall cinemaHall = new CinemaHall (10, 10, 22.2);
        System.out.println ("print CinemaHall status before marked the occupied seats: " + cinemaHall);
        cinemaHall.setSeat (s1);
        cinemaHall.setSeat (s2);
        cinemaHall.setSeat (s3);
        cinemaHall.setSeat (s4);
        System.out.println ("print CinemaHall by toString method after 4 seats occupied: " + cinemaHall.toString ());


        MovieShow ms1 = new MovieShow ("01", "MovieName1", LocalDateTime.of (2018,03,26,8,30,40), 110);
        MovieShow ms2 = new MovieShow ("02", "MovieName2", LocalDateTime.of (2018,03,27,10,30,40), 120);
        MovieShow ms3 = new MovieShow ("03", "MovieName3", LocalDateTime.of (2018,03,28,12,30,40), 130);
        MovieShow ms4 = new MovieShow ("04", "MovieName4", LocalDateTime.of (2018,03,29,13,30,40), 140);

        System.out.println ("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ \n");

        System.out.println ("MS1 - Move show time : " + ms1.getTime ());
        System.out.println ("MS2 - Move show time : " + ms2.getTime ());
        System.out.println ("MS3 - Move show time : " + ms3.getTime ());
        System.out.println ("MS4 - Move show time : " + ms4.getTime ());
        System.out.println ("print all MovieShow status: " + ms1);
        System.out.println ("print all MovieShow status: " + ms2);
        System.out.println ("print all MovieShow status: " + ms3);
        System.out.println ("print all MovieShow status: " + ms4);

    }

}
