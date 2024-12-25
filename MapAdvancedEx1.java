package com.csi.map;

import java.util.HashMap;
import java.util.Map;

class Customer{
	
	private int custId;
	private String custName;
	private String custAddress;
	private double Salary;
	public Customer(int custId, String custName, String custAddress, double salary) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
		Salary = salary;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAddress=" + custAddress + ", Salary="
				+ Salary + "]";
	}
	
	
}

public class MapAdvancedEx1 {
	public static void main(String[] args) {
		Map<Integer, Customer> customerMap = new HashMap<Integer, Customer>();
		
		customerMap.put(11,new Customer(111, "Richa", "Delhi", 56000.3));
		customerMap.put(12,new Customer(222, "Soham", "PCMC", 30000.1));
		customerMap.put(13,new Customer(333, "Nikita", "Jalgaon", 25000.00));
		customerMap.put(14,new Customer(444, "Arush", "Mysore", 65000.4));
		customerMap.put(15,new Customer(555, "Bella", "Mumbai", 60000.66));
		
//		System.out.println(customerMap);
		
		for(Map.Entry<Integer, Customer> m:customerMap.entrySet()) {
			if(m.getValue().getSalary()>=50000.00) {
				System.out.println(m.getKey()+ ":" + m.getValue());
			}
		}
		
	}
}
