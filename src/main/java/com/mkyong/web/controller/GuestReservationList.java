package com.mkyong.web.controller;

import java.io.Serializable;
import java.util.List;

public class GuestReservationList implements Serializable
{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private List<Hut> huts;
    private List<Reservation> reservation;
    public List<Hut> getHuts() {
        return huts;
    }
    public void setHuts(List<Hut> huts) {
        this.huts = huts;
    }
    public List<Reservation> getReservation() {
        return reservation;
    }
    public void setReservation(List<Reservation> reservation) {
        this.reservation = reservation;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    
    
    
}
