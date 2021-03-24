package com.psl.service;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.dao.ICashDAO;
import com.psl.entity.WithDraw;

@Service("service")
public class ConService {
	@Autowired
	private ICashDAO dao;
	
	public WithDraw getdetails(int id) {
		System.out.println("get Details");
		return dao.getBalance(id);
	}

	public void addBalance(int id,int amt) {
		System.out.println("add Balance");
		dao.addBalance(id,amt);
	}

	public void takeBalance(int id,int amt) {
		// TODO Auto-generated method stub
		System.out.println("WithDraw Balance");
		dao.takeBalance(id,amt);
		
	}
}
