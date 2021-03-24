package com.psl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.dao.IDonnerDAO;
import com.psl.entity.BloodDonnerDetails;

@Service("service")
public class DonnerService {      
    @Autowired
   	private IDonnerDAO dao;
   	
   	public BloodDonnerDetails getDonner(String name) {
   		System.out.println("get Donner");
   		return dao.getDonner(name);
   	}

   	public void addDonner(BloodDonnerDetails e) {
   		System.out.println("add Donner");
   		dao.addDonner(e);
   	}

   	public void updateDonner(BloodDonnerDetails e) {
   		// TODO Auto-generated method stub
   		System.out.println("update Donner");
   		
   	}

   	public void deleteDonner(String name) {
   		// TODO Auto-generated method stub
   		System.out.println("delete Employee");
   	}
        
}
