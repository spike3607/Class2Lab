/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;

/**
 *
 * @author Spike
 */
public class WelcomeService {
    private Calendar cal;

    public WelcomeService() {
        cal = Calendar.getInstance();
    }    
    
    private String determineTimeofDay () {
        if (cal.get(Calendar.HOUR_OF_DAY) <= 6) {
            return "morning";
        }
        else if (cal.get(Calendar.HOUR_OF_DAY) >= 18) {
            return "evening";
        }
        else {
            return "afternoon";
        }
    }
    
    public String createMessage(String name) {
        return "Good " + determineTimeofDay() + "," + name + ", Welcome!";
    }
}
