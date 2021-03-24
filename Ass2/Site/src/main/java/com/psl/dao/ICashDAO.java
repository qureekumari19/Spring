package com.psl.dao;

import com.psl.entity.WithDraw;

public interface ICashDAO {

	WithDraw getBalance(int id);
	void addBalance(int id,int amt);
	void takeBalance(int id,int amt);	
}
