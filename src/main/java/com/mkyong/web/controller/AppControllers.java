package com.mkyong.web.controller;



import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.time.DateUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class AppControllers
{
    @RequestMapping(value = "/diu", method = RequestMethod.GET)
    @ResponseBody
    public LMDAccommodationDataTakeAway hello()
    {
        return null;

    }
    
    @RequestMapping(value="rest/reservation/accommodation", method = RequestMethod.GET,  produces = "application/json")
    @ResponseBody
    public LMDAccommodationDataTakeAway returnAccommodationData()
    {
        LMDAccommodationDataTakeAway accommodationData = new LMDAccommodationDataTakeAway();
        
        accommodationData.setNumberOfNight(1);
        accommodationData.setChildrenFieldVisible(true);
        accommodationData.setNumberOfChildren(0);
        accommodationData.setMountainguideFieldVisible(true);
        accommodationData.setNumberOfMountainGuides(0);
        accommodationData.setHalfboardFieldVisible(true);
        accommodationData.setVegetarianFieldVisible(true);
        accommodationData.setNumberOfVegetarians(0);
        accommodationData.setDogFieldVisible(true);
        accommodationData.setGroupName("");
        accommodationData.setFreeText1("");
        accommodationData.setGuestCommentVisible(true);
        accommodationData.setComments("");
        
        //add list hut file, hien tai hut file = rong~ , ko co file nao
                
        accommodationData.setHutFiles("");
        
        //4 loai phong`, muon sua/ them/ xoa phong thi edit tai day
        List<LMDHutBedCategory> hutBedcategories = new ArrayList<LMDHutBedCategory>();
        hutBedcategories.add(new LMDHutBedCategory(111L, 0, "A", 1, "type 1"));
        hutBedcategories.add(new LMDHutBedCategory(112L, 0, "B", 2, "type 2"));
        hutBedcategories.add(new LMDHutBedCategory(113L, 0, "C", 3, "type 3"));
        hutBedcategories.add(new LMDHutBedCategory(114L, 0, "D", 4, "type 4"));
        accommodationData.setHutBedcategories(hutBedcategories);
        
        //list hut labels
        List<LMDHutLabelsTakeAway> hutLabels = new ArrayList<LMDHutLabelsTakeAway>();
        hutLabels.add(new LMDHutLabelsTakeAway("MEAL", "Den h an dam roi", "en"));
        hutLabels.add(new LMDHutLabelsTakeAway("DOGS", "Co 1 con cho", "en"));
        hutLabels.add(new LMDHutLabelsTakeAway("FREE_TEXT1", "FREE_TEXT1+NE", "en"));
        hutLabels.add(new LMDHutLabelsTakeAway("FREE_TEXT2", "FREE_TEXT_2", "en"));
        hutLabels.add(new LMDHutLabelsTakeAway("FREE_NUM1", "FREE_NUM_1", "en"));
        hutLabels.add(new LMDHutLabelsTakeAway("FREE_NUM2", "FREE_NUM2", "en"));
        hutLabels.add(new LMDHutLabelsTakeAway("RES_CONF_EMAIL", "", "en"));
        hutLabels.add(new LMDHutLabelsTakeAway("INT_FREE_TEXT1", "INT FREE TEXT 1", "en"));
        hutLabels.add(new LMDHutLabelsTakeAway("INT_FREE_TEXT2", "INT_FREE_TEXT2", "en"));
        accommodationData.setHutLabels(hutLabels);
        
        //set list computeCachedData
        Date currentdate = Calendar.getInstance().getTime();
        List<List<LMDReservationCalendarTakeAway>> computeCachedData = new ArrayList<List<LMDReservationCalendarTakeAway>>();
        for (int i = 0; i < 2; i++)
        {
            List<LMDReservationCalendarTakeAway> listComputeCached = new ArrayList<LMDReservationCalendarTakeAway>();
            for (int j = 0; j < 4; j++)
            {
                Set<String> events = new HashSet<String>();
                listComputeCached.add(new LMDReservationCalendarTakeAway(128+j, 4+j, "type " + j + 1, true, false, events, 100, false, DateUtils.addDays(currentdate, i), new  SimpleDateFormat("yyyy.MM.dd").format(DateUtils.addDays(currentdate, i)), 100, ""));
            }
            
            computeCachedData.add(listComputeCached);
        }
        
        for (int i = 2; i < 4; i++)
        {
            List<LMDReservationCalendarTakeAway> listComputeCached = new ArrayList<LMDReservationCalendarTakeAway>();
            for (int j = 0; j < 4; j++)
            {
                Set<String> events = new HashSet<String>();
                listComputeCached.add(new LMDReservationCalendarTakeAway(128+j, 4+j, "type " + j + 1, true, false, events, 80, false, DateUtils.addDays(currentdate, i), new  SimpleDateFormat("yyyy.MM.dd").format(DateUtils.addDays(currentdate, i)), 100, ""));
            }
            
            computeCachedData.add(listComputeCached);
        }
        
        for (int i = 4; i < 6; i++)
        {
            List<LMDReservationCalendarTakeAway> listComputeCached = new ArrayList<LMDReservationCalendarTakeAway>();
            for (int j = 0; j < 4; j++)
            {
                Set<String> events = new HashSet<String>();
                listComputeCached.add(new LMDReservationCalendarTakeAway(128+j, 4+j, "type " + j + 1, true, false, events, 50, false, DateUtils.addDays(currentdate, i), new  SimpleDateFormat("yyyy.MM.dd").format(DateUtils.addDays(currentdate, i)), 100, ""));
            }
            
            computeCachedData.add(listComputeCached);
        }
        
        for (int i = 6; i < 8; i++)
        {
            List<LMDReservationCalendarTakeAway> listComputeCached = new ArrayList<LMDReservationCalendarTakeAway>();
            for (int j = 0; j < 4; j++)
            {
                Set<String> events = new HashSet<String>();
                listComputeCached.add(new LMDReservationCalendarTakeAway(128+j, 4+j, "type " + j + 1, true, false, events, 130, false, DateUtils.addDays(currentdate, i), new  SimpleDateFormat("yyyy.MM.dd").format(DateUtils.addDays(currentdate, i)), 100, ""));
            }
            
            computeCachedData.add(listComputeCached);
        }
        
        for (int i = 8; i < 10; i++)
        {
            List<LMDReservationCalendarTakeAway> listComputeCached = new ArrayList<LMDReservationCalendarTakeAway>();
            for (int j = 0; j < 4; j++)
            {
                Set<String> events = new HashSet<String>();
                listComputeCached.add(new LMDReservationCalendarTakeAway(128+j, 4+j, "type " + j + 1, true, false, events, 150, false, DateUtils.addDays(currentdate, i), new  SimpleDateFormat("yyyy.MM.dd").format(DateUtils.addDays(currentdate, i)), 100, ""));
            }
            
            computeCachedData.add(listComputeCached);
        }
        
        for (int i = 10; i < 12 ; i++)
        {
            List<LMDReservationCalendarTakeAway> listComputeCached = new ArrayList<LMDReservationCalendarTakeAway>();
            for (int j = 0; j < 4; j++)
            {
                Set<String> events = new HashSet<String>();
                listComputeCached.add(new LMDReservationCalendarTakeAway(128+j, 4+j, "type " + j + 1, true, false, events, 60, false, DateUtils.addDays(currentdate, i), new  SimpleDateFormat("yyyy.MM.dd").format(DateUtils.addDays(currentdate, i)), 100, ""));
            }
            
            computeCachedData.add(listComputeCached);
        }
        
        for (int i = 10; i < 14 ; i++)
        {
            List<LMDReservationCalendarTakeAway> listComputeCached = new ArrayList<LMDReservationCalendarTakeAway>();
            for (int j = 0; j < 4; j++)
            {
                Set<String> events = new HashSet<String>();
                listComputeCached.add(new LMDReservationCalendarTakeAway(128+j, 4+j, "type " + j + 1, true, false, events, 100, false, DateUtils.addDays(currentdate, i), new  SimpleDateFormat("yyyy.MM.dd").format(DateUtils.addDays(currentdate, i)), 100, ""));
            }
            
            computeCachedData.add(listComputeCached);
        }
        
        accommodationData.setComputeCachedData(computeCachedData);
        
        
        accommodationData.setStartDate(computeCachedData.get(0).get(0).getReservationDate());
        accommodationData.setEndDate(computeCachedData.get(computeCachedData.size()-1).get(0).getReservationDate());
        return accommodationData;
    }
    
    @RequestMapping(value="rest/guest/reservation", method = RequestMethod.GET,  produces = "application/json")
    @ResponseBody
    public Map<String, Object> returnGuestReservationList()
    {
        Map<String, Object> output = new HashMap<String, Object>();
        List<Hut> huts = new ArrayList<Hut>();
        
        huts.add(new Hut(11L, "Nha la"));
        huts.add(new Hut(22L, "Nha Go~"));
        huts.add(new Hut(33L, "Nha Xi Mang"));
        
        output.put("Huts", huts);
        
        List<Reservation> reservation = new ArrayList<Reservation>();
        reservation.add(new Reservation(1111L, "2016.11.07", 11L, "Nha La", 4, "Confirmed"));
        reservation.add(new Reservation(2222L, "2016.11.15", 11L, "Nha Go", 12, "Canceled"));
        
        output.put("reservation", reservation);
        
        return output;
    }
}
