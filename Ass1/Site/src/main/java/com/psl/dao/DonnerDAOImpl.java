package com.psl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.psl.entity.Donner;


@Repository("dao")
public class DonnerDAOImpl implements IDonnerDAO{
	
	@Autowired
	private JdbcTemplate template;

	@Override
	public Donner getDonner(int id) {

		return template.queryForObject("select * from Employee where id="+id, 
				new RowMapper<Donner>(){

			@Override
			public Donner mapRow(ResultSet rs, int rownum)
					throws SQLException {
				
                if(rs.equals(0))
                {
                	System.out.println("no data exist");
                	return null;
                }
                else {
				Donner e = new Donner();
				e.setId(rs.getInt("id"));
				e.setName(rs.getString("name"));
				e.setEmail(rs.getString("email"));
				return e;
                }
			}
			
		});
		
	}

	@Override
	public void addDonner(Donner e) {		
		template.update("insert into Employee(id,name,email) values('"+e.getId()+"','"+e.getName() +"','" + e.getEmail() + "')");
		System.out.println("Done------------------");
	}

	@Override
	public void updateDonner(Donner e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDonner(int id) {
		// TODO Auto-generated method stub
	}

}
