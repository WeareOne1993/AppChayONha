package com.mkyong.web.controller;

import java.io.Serializable;

public class Hut implements Serializable
{

    /**
     * 
     */
    private static final long serialVersionUID = 189917511470535614L;

    private Long hutId;
    private String hutName;
    
    public Hut(Long hutId, String hutName)
    {
        this.hutId = hutId;
        this.hutName = hutName;
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

    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    
    
}
