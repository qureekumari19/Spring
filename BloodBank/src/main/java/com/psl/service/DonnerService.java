package com.psl.service;

import org.springframework.stereotype.Service;

import com.psl.entity.BloodDonnerDetails;

@Service
public class DonnerService {
       public BloodDonnerDetails getdonerByName(String name)
       {
    	  return new BloodDonnerDetails(name,"bagodar","o-positive",1234);   
       }
        
}
