	/***************************************************************
	**************** 
	* Kean University 
	* Spring 2023 
	* Course: CPS*2231 - Computer Programming 
	* Author: Ben Abraham 
	* Homework: 3, task 2 
	* Program Description: 
	**************************************************************
	***********/ 

package Assigment3;
import java.util.Date;

	public class Account {
		
		private int id = 0; 
		private double balance = 0; 
		private double interestRate = 0.02;
		private Date dateCreated; 
		
		
		public Account(){
			}
		
		public Account(int id, double balance){
			this.id = id; 
			this.balance = balance; 
			this.interestRate = 0; 
			this.dateCreated = new Date(); 
			
		}
		
		public int getId() {
			return id;
		}
		public void setId (int newid) {
			this.id = newid; 
		}
		public double getBalance() {
			return balance;	
		}
		public void setBalance(double newBalance) {
			this.balance = newBalance;
		}
		public double getAnnualInterestRate() {
			return interestRate;	
		}
		public void setAnnualInterestRate(double newRate) {
	        this.interestRate = newRate;
	        }
		public String toString() {
	        return "Account ID: " + id + "\nBalance: $" + balance;
		}
		public Date getDataCreated() {
			return dateCreated;
		}
		public double getMonthlyInterestRate() {
			return balance;	
		}
		public double getMonthlyInterest() {
			return balance;	
		}
		public void deposit(double depositAmount) {
			balance	+= depositAmount;	
		}
		public void withdraw (double withdrawAmount) {
			balance -= withdrawAmount;
		}
	}



