package com.psl.dao;

import com.psl.entity.BloodDonnerDetails;

public interface IDonnerDAO {

	BloodDonnerDetails getDonner(String name);
	void addDonner(BloodDonnerDetails e);
	void updateDonner(BloodDonnerDetails e);
	void deleteDonner(String name);
}
