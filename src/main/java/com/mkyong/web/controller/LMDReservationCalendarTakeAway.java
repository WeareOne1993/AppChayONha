/*
 *
 * Project: HRS
 *
 * Copyright 2013 by SAC
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of SAC. ("Confidential Information"). You
 * shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license
 * agreement you entered into with SAC.
 */
package com.mkyong.web.controller;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class LMDReservationCalendarTakeAway implements Serializable
{


    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private Integer hutBedCategoryId;

    private Integer bedCategoryId;
    
    private String label;

    /** The booking enabled. */
    private boolean bookingEnabled = true;

    /** The closed. */
    private boolean closed;

    /** The event. */
    private Set<String> events = new HashSet<String>();

    private int freeRoom = 0;

    /** Flag to show future hut occupancy when deadline has passed or not. */
    private boolean futureHutOccupancyShown = false;

    /** The reservation date. */
    
    private Date reservationDate;
    
    private String dateToString;

    private int totalRoom = 0;

    private String imageUrl;
    
    public LMDReservationCalendarTakeAway(Integer hutBedCategoryid, Integer bedCategoryId, String label, boolean bookingEnabled, boolean closed, Set<String> events, int freeRoom, boolean futureHutOccupancyShown, Date reservationDate, String dateToString, int totalRoom, String imageUrl)
    {
        this.hutBedCategoryId = hutBedCategoryid;
        this.bedCategoryId = bedCategoryId;
        this.label = label;
        this.bookingEnabled = bookingEnabled;
        this.closed = closed;
        this.events = events;
        this.freeRoom = freeRoom;
        this.futureHutOccupancyShown = futureHutOccupancyShown;
        this.reservationDate = reservationDate;
        this.dateToString = dateToString;
        this.totalRoom = totalRoom;
        this.imageUrl = imageUrl;
    }

    public int getHutBedCategoryId() {
        return hutBedCategoryId;
    }

    public void setHutBedCategoryId(int hutBedCategoryId) {
        this.hutBedCategoryId = hutBedCategoryId;
    }

    public int getBedCategoryId() {
        return bedCategoryId;
    }

    public void setBedCategoryId(int bedCategoryId) {
        this.bedCategoryId = bedCategoryId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isBookingEnabled() {
        return bookingEnabled;
    }

    public void setBookingEnabled(boolean bookingEnabled) {
        this.bookingEnabled = bookingEnabled;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public Set<String> getEvents() {
        return events;
    }

    public void setEvents(Set<String> events) {
        this.events = events;
    }

    public int getFreeRoom() {
        return freeRoom;
    }

    public void setFreeRoom(int freeRoom) {
        this.freeRoom = freeRoom;
    }

    public boolean isFutureHutOccupancyShown() {
        return futureHutOccupancyShown;
    }

    public void setFutureHutOccupancyShown(boolean futureHutOccupancyShown) {
        this.futureHutOccupancyShown = futureHutOccupancyShown;
    }

    @JsonSerialize(using=JsonDateSerializer.class)
    public Date getReservationDate() {
        return reservationDate;
    }
    
    public double getReservedRoomsRatio() {
        return 1.0 - (totalRoom > 0 ? freeRoom * 1.0 / totalRoom : 0f);
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getDateToString() {
        return dateToString;
    }

    public void setDateToString(String dateToString) {
        this.dateToString = dateToString;
    }

    public int getTotalRoom() {
        return totalRoom;
    }

    public void setTotalRoom(int totalRoom) {
        this.totalRoom = totalRoom;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }
}
