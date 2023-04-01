/***************************************************************
	**************** 
	* Kean University 
	* Spring 2023 
	* Course: CPS*2231 - Computer Programming 
	* Author: Ben Abraham 
	* Homework: 3, task 3 
	* Program Description: 
	**************************************************************
	***********/ 
package Assigment3;

import java.util.Date;

public class AccountTest {

	private int id = 1122; 
	private double balance = 20000; 
	private double interestRate = 0.045;
	private Date dateCreated; 
	
	
	public AccountTest(){
		}
	
	public AccountTest(int id, double balance){
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



