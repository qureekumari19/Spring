package com.psl.bean;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestBean {

	 @Autowired	 
	 @Qualifier("list")
	 private ArrayList<String> list;
	 public ArrayList<String> getList() {
		return list;
	}
	public void setList(ArrayList<String> list) {
		this.list = list;
	}
	private HashSet<String> set;
	 public HashSet<String> getSet() {
		return set;
	}
	public void setSet(HashSet<String> set) {
		this.set = set;
	}
	private Map<Integer,String> map;
	 @Autowired
	 @Qualifier("employee")
	 private List emplist;
	public List getEmplist() {
		return emplist;
	}
	public void setEmplist(List emplist) {
		this.emplist = emplist;
	}		
	public Map<Integer, String> getMap() {
		return map;
	}
	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return list+"\n"+set+"\n"+map;
	}
}
