package com.psl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.psl.entity.WithDraw;


@Repository("dao")
public class CashDAOImpl implements ICashDAO{
	
	@Autowired
	private JdbcTemplate template;

	@Override
	public WithDraw getBalance(int id) {

		return template.queryForObject("select * from atm where account_number="+id, 
				new RowMapper<WithDraw>(){

			@Override
			public WithDraw mapRow(ResultSet rs, int rownum)
					throws SQLException {
				
//                System.out.println("1");
				WithDraw e = new WithDraw();
				e.setAccno(rs.getInt("account_number"));
				e.setAmount(rs.getInt("amount"));
//				System.out.println("2");
				return e;
			}
			
		});
		
	}

	@Override
	public void addBalance(int id,int amt) {	
		WithDraw t=getBalance(id);		
		  int a=t.getAmount()+amt;
		  template.update("update atm set amount = "+a+" where account_number = "+t.getAccno());		
		System.out.println("Done------------------");
	}

	@Override
	public void takeBalance(int id,int amt) {
		WithDraw t=getBalance(id);
		if(t.getAmount()>amt)
		{
		  int a=t.getAmount()-amt;
		  template.update("update atm set amount = "+a+" where account_number = "+t.getAccno());
		}
		else
		{
			System.out.println("Your balance is too low");
		}		
		  System.out.println("Done------------------");
		  
		
	}
	

}
