package com.ivyprograd.order.orderticket;
import javax.persistence.*;

import lombok.*;
@Entity(name="")
@Table(name="orders")
public class BookOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "movieid", nullable = false)
    private long movieid;
    private String source;
    private int nooftickets;

    public BookOrder() {
    }

    public BookOrder(long movieid, String source, int nooftickets) {
        this.movieid = movieid;
        this.source = source;
        this.nooftickets = nooftickets;
    }

    public long getMovieid() {
        return movieid;
    }

    public void setMovieid(long movieid) {
        this.movieid = movieid;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getNooftickets() {
        return nooftickets;
    }

    public void setNooftickets(int nooftickets) {
        this.nooftickets = nooftickets;
    }

    @Override
    public String toString() {
        return "BookingOrder [id=" + movieid + ",  startStation=" + source +
                 ", quantity=" + nooftickets +"]";
    }




}
