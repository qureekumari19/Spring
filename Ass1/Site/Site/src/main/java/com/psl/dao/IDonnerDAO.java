package com.psl.dao;

import com.psl.entity.Donner;

public interface IDonnerDAO {

	Donner getDonner(int id);
	void addDonner(Donner e);
	void updateDonner(Donner e);
	void deleteDonner(int id);
}
