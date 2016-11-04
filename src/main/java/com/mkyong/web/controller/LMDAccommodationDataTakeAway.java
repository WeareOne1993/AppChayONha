package com.mkyong.web.controller;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class LMDAccommodationDataTakeAway implements Serializable
{
    private static final long serialVersionUID = -8886634239947233911L;
    private Integer numberOfNight = 0;
    private boolean childrenFieldVisible;
    private Integer numberOfChildren = 0;
    private boolean mountainguideFieldVisible;
    private Integer numberOfMountainGuides = 0;
    private boolean halfboardFieldVisible;
    private boolean vegetarianFieldVisible;
    private Integer numberOfVegetarians = 0;
    private boolean dogFieldVisible;
    private String groupName = null;
    private String freeText1 = null;
    private boolean guestCommentVisible;
    private String comments = null;
    private String hutFiles;

    private Date startDate;
    private Date endDate;
    @JsonSerialize(using=JsonDateSerializer.class)
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    @JsonSerialize(using=JsonDateSerializer.class)
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    //description
    private List<LMDHutBedCategory> hutBedcategories;
    
    private List<LMDHutLabelsTakeAway> hutLabels;

    //list data cached
    List<List<LMDReservationCalendarTakeAway>> computeCachedData;

    public Integer getNumberOfNight() {
        return numberOfNight;
    }

    public void setNumberOfNight(Integer numberOfNight) {
        this.numberOfNight = numberOfNight;
    }

    public boolean isChildrenFieldVisible() {
        return childrenFieldVisible;
    }

    public void setChildrenFieldVisible(boolean childrenFieldVisible) {
        this.childrenFieldVisible = childrenFieldVisible;
    }

    public Integer getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(Integer numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public boolean isMountainguideFieldVisible() {
        return mountainguideFieldVisible;
    }

    public void setMountainguideFieldVisible(boolean mountainguideFieldVisible) {
        this.mountainguideFieldVisible = mountainguideFieldVisible;
    }

    public Integer getNumberOfMountainGuides() {
        return numberOfMountainGuides;
    }

    public void setNumberOfMountainGuides(Integer numberOfMountainGuides) {
        this.numberOfMountainGuides = numberOfMountainGuides;
    }

    public boolean isHalfboardFieldVisible() {
        return halfboardFieldVisible;
    }

    public void setHalfboardFieldVisible(boolean halfboardFieldVisible) {
        this.halfboardFieldVisible = halfboardFieldVisible;
    }

    public boolean isVegetarianFieldVisible() {
        return vegetarianFieldVisible;
    }

    public void setVegetarianFieldVisible(boolean vegetarianFieldVisible) {
        this.vegetarianFieldVisible = vegetarianFieldVisible;
    }

    public Integer getNumberOfVegetarians() {
        return numberOfVegetarians;
    }

    public void setNumberOfVegetarians(Integer numberOfVegetarians) {
        this.numberOfVegetarians = numberOfVegetarians;
    }

    public boolean isDogFieldVisible() {
        return dogFieldVisible;
    }

    public void setDogFieldVisible(boolean dogFieldVisible) {
        this.dogFieldVisible = dogFieldVisible;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getFreeText1() {
        return freeText1;
    }

    public void setFreeText1(String freeText1) {
        this.freeText1 = freeText1;
    }

    public boolean isGuestCommentVisible() {
        return guestCommentVisible;
    }

    public void setGuestCommentVisible(boolean guestCommentVisible) {
        this.guestCommentVisible = guestCommentVisible;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getHutFiles() {
        return hutFiles;
    }

    public void setHutFiles(String hutFiles) {
        this.hutFiles = hutFiles;
    }

    public List<LMDHutBedCategory> getHutBedcategories() {
        return hutBedcategories;
    }

    public void setHutBedcategories(List<LMDHutBedCategory> hutBedcategories) {
        this.hutBedcategories = hutBedcategories;
    }

    public List<LMDHutLabelsTakeAway> getHutLabels() {
        return hutLabels;
    }

    public void setHutLabels(List<LMDHutLabelsTakeAway> hutLabels) {
        this.hutLabels = hutLabels;
    }

    public List<List<LMDReservationCalendarTakeAway>> getComputeCachedData() {
        return computeCachedData;
    }

    public void setComputeCachedData(List<List<LMDReservationCalendarTakeAway>> computeCachedData) {
        this.computeCachedData = computeCachedData;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }


}
