package com.psl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.psl.entity.BloodDonnerDetails;


@Repository("dao")
public class DonnerDAOImpl implements IDonnerDAO{
	
	@Autowired
	private JdbcTemplate template;

	public BloodDonnerDetails getDonner(String name) {
		return template.queryForObject("select * from Donner where name="+name, 
				new RowMapper<BloodDonnerDetails>(){

			public BloodDonnerDetails mapRow(ResultSet rs, int rownum)
					throws SQLException {
				

				BloodDonnerDetails e = new BloodDonnerDetails();			
				e.setName(rs.getString("name"));
				e.setPhone_number(rs.getString("phone_number"));
				e.setBd(rs.getString("blood_group"));
				e.setAddress(rs.getString("address"));
				return e;
			}
			
		});
	}

	public void addDonner(BloodDonnerDetails e) {
		System.out.println("add Donner------------------");
		template.update("insert into Dooner(name,phone_number,blood_group,address) values('"+e.getName()+"','"+e.getPhone_number()+"','"+e.getBd()+"','"+e.getAddress()+ "')");
		System.out.println("Done------------------");
		
	}

	public void updateDonner(BloodDonnerDetails e) {
		// TODO Auto-generated method stub
		
	}

	public void deleteDonner(String name) {
		// TODO Auto-generated method stub
		
	}
}
