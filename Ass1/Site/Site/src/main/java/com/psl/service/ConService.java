package com.psl.service;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.dao.IDonnerDAO;
import com.psl.entity.Donner;

@Service("service")
public class ConService {
	@Autowired
	private IDonnerDAO dao;
	
	public Donner getDonner(int id) {
		System.out.println("get Donner");
		return dao.getDonner(id);
	}

	public void addDonner(Donner e) {
		System.out.println("add Donner");
		dao.addDonner(e);
	}

	public void updateDonner(Donner e) {
		// TODO Auto-generated method stub
		System.out.println("update Donner");
		
	}

	public void deleteDonner(int id) {
		// TODO Auto-generated method stub
		System.out.println("delete Donner");
	}

}
