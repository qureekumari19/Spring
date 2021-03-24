package com.psl.service;

import org.springframework.stereotype.Service;

import com.psl.entity.BloodDonnerDetails;

@Service
public class DonnerService {
       public BloodDonnerDetails getdonerByName(String name)
       {    
    	   if(name.equals("quree"))
    	     return new BloodDonnerDetails(name,"bagodar","o-positive",1234);
    	   else
    		   return new BloodDonnerDetails(name,"Pune","AB-positive",65434);
       }
        
}
