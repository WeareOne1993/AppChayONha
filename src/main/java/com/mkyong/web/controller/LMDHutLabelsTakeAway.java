package com.mkyong.web.controller;

import java.io.Serializable;

public class LMDHutLabelsTakeAway implements Serializable {


    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String type;
    private String value;
    private String languageCode;

    public LMDHutLabelsTakeAway(String type, String value, String languageCode) {
        this.type = type;
        this.value = value;
        this.languageCode = languageCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
