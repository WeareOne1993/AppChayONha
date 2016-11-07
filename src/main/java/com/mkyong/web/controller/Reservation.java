package com.mkyong.web.controller;

import java.io.Serializable;

public class Reservation implements Serializable
{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private Long reservationNumber;
    private String arrivalDate;
    private Long hutId;
    private String hutName;
    private int numberOfPeoples;
    private String status;
    
    public Reservation(Long number, String date, Long hutId, String name, int numOfPP, String status)
    {
        this.reservationNumber = number;
        this.arrivalDate = date;
        this.hutId = hutId;
        this.hutName = name;
        this.numberOfPeoples = numOfPP;
        this.status = status;
    }
    
    
    
    public Long getReservationNumber() {
        return reservationNumber;
    }
    public void setReservationNumber(Long reservationNumber) {
        this.reservationNumber = reservationNumber;
    }
    public String getArrivalDate() {
        return arrivalDate;
    }
    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
    public Long getHutId() {
        return hutId;
    }
    public void setHutId(Long hutId) {
        this.hutId = hutId;
    }
    public String getHutName() {
        return hutName;
    }
    public void setHutName(String hutName) {
        this.hutName = hutName;
    }
    public int getNumberOfPeoples() {
        return numberOfPeoples;
    }
    public void setNumberOfPeoples(int numberOfPeoples) {
        this.numberOfPeoples = numberOfPeoples;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    
    

}
