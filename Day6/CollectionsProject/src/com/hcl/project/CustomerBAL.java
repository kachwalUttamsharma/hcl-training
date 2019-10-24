<<<<<<< HEAD
package com.hcl.project;

import java.util.List;

public class CustomerBAL {
static StringBuilder sb = new StringBuilder();
	
	public boolean addCustomerBal(Customer objCustomer) throws CustomerException{
		boolean isAdded = true;
		
		if(objCustomer.getCustId() <= 0){
			sb.append("Customer Id cannot be negative or Zero \r\n");
			isAdded = false;
		}
		
		if(objCustomer.getCustName().length() <= 5){
			sb.append("Customer Name must be more than 5 characters \r\n");
			isAdded = false;
		}
		
		if(objCustomer.getAnnualPremium() < 20000 && objCustomer.getAnnualPremium() > 1000000){
			sb.append("AnnualPreium must be between 20000 and 1000000\r\n");
			isAdded = false;
		}
		if(objCustomer.getModalPremium() < 1000 && objCustomer.getModalPremium() > 50000){
			sb.append("AnnualPreium must be between 20000 and 1000000\r\n");
			isAdded = false;
		}
		if(objCustomer.getPaymentMode() >= 3 && objCustomer.getPaymentMode() <= 1  ){
			sb.append("PaymentMode must be 1,2 or 3\r\n");
			isAdded = false;
		}
		
		if(isAdded == false){
			throw new CustomerException(sb.toString());
		}else {
			new CustomerDAO().addCustomerDao(objCustomer);
		}
		return isAdded;
	}
	
	public Customer searchCustomerBal(int custId){
		return new CustomerDAO().searchCustomerDao(custId);
	}
	
	public List<Customer> showCustomerBal(){
		return new CustomerDAO().showCustomerDao();
	}
	
	public String updateCustomerBal(Customer objCustomer){
		return new CustomerDAO().updateCustomerDao(objCustomer);
	}
	
	public String deleteCustomerBal(int custId){
		return new CustomerDAO().deleteCustomerDao(custId);
	}
	
	public void writeCustomerFileBal() {
		new CustomerDAO().writeCustomerFileDao();
	}
	
	public void readCustomerFileBal() {
		new CustomerDAO().readCustomerFileDao();
	}
	
}
=======
package com.hcl.project;

import java.util.List;

public class CustomerBAL {
static StringBuilder sb = new StringBuilder();
	
	public boolean addCustomerBal(Customer objCustomer) throws CustomerException{
		boolean isAdded = true;
		
		if(objCustomer.getCustId() <= 0){
			sb.append("Customer Id cannot be negative or Zero \r\n");
			isAdded = false;
		}
		
		if(objCustomer.getCustName().length() <= 5){
			sb.append("Customer Name must be more than 5 characters \r\n");
			isAdded = false;
		}
		
		if(objCustomer.getAnnualPremium() < 20000 && objCustomer.getAnnualPremium() > 1000000){
			sb.append("AnnualPreium must be between 20000 and 1000000\r\n");
			isAdded = false;
		}
		if(objCustomer.getModalPremium() < 1000 && objCustomer.getModalPremium() > 50000){
			sb.append("AnnualPreium must be between 20000 and 1000000\r\n");
			isAdded = false;
		}
		if(objCustomer.getPaymentMode() >= 3 && objCustomer.getPaymentMode() <= 1  ){
			sb.append("PaymentMode must be 1,2 or 3\r\n");
			isAdded = false;
		}
		
		if(isAdded == false){
			throw new CustomerException(sb.toString());
		}else {
			new CustomerDAO().addCustomerDao(objCustomer);
		}
		return isAdded;
	}
	
	public Customer searchCustomerBal(int custId){
		return new CustomerDAO().searchCustomerDao(custId);
	}
	
	public List<Customer> showCustomerBal(){
		return new CustomerDAO().showCustomerDao();
	}
	
	public String updateCustomerBal(Customer objCustomer){
		return new CustomerDAO().updateCustomerDao(objCustomer);
	}
	
	public String deleteCustomerBal(int custId){
		return new CustomerDAO().deleteCustomerDao(custId);
	}
	
	public void writeCustomerFileBal() {
		new CustomerDAO().writeCustomerFileDao();
	}
	
	public void readCustomerFileBal() {
		new CustomerDAO().readCustomerFileDao();
	}
	
}
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
