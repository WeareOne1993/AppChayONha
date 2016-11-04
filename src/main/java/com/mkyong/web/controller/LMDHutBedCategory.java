package com.mkyong.web.controller;

import java.io.Serializable;

public class LMDHutBedCategory implements Serializable
{

    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Long id;
    private Integer bedReserved;
    private String hutBedDescription;
    private Integer order;
    private String tenantBedCategoryLabels;
    
    public LMDHutBedCategory(Long id, Integer bedReserved, String hutBedDescription, Integer order, String tenantBedCategoryLabels)
    {
        this.id = id;
        this.bedReserved = bedReserved;
        this.hutBedDescription = hutBedDescription;
        this.order = order;
        this.tenantBedCategoryLabels = tenantBedCategoryLabels;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getBedReserved() {
        return bedReserved;
    }

    public void setBedReserved(Integer bedReserved) {
        this.bedReserved = bedReserved;
    }

    public String getHutBedDescription() {
        return hutBedDescription;
    }

    public void setHutBedDescription(String hutBedDescription) {
        this.hutBedDescription = hutBedDescription;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getTenantBedCategoryLabels() {
        return tenantBedCategoryLabels;
    }

    public void setTenantBedCategoryLabels(String tenantBedCategoryLabels) {
        this.tenantBedCategoryLabels = tenantBedCategoryLabels;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
