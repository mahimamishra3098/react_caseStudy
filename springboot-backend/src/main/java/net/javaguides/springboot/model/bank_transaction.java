package net.javaguides.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="transactions")
public class bank_transaction {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String date;
	private int user_id;
	private int acc_id;
	private double amt_credit;
	private double amt_debit;
	
	public bank_transaction() {
		
	}
	
	public bank_transaction(String date, int user_id, int acc_id, double amt_credit, double amt_debit) {
		super();
		this.date = date;
		this.user_id = user_id;
		this.acc_id = acc_id;
		this.amt_credit = amt_credit;
		this.amt_debit = amt_debit;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getAcc_id() {
		return acc_id;
	}
	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}
	public double getAmt_credit() {
		return amt_credit;
	}
	public void setAmt_credit(double amt_credit) {
		this.amt_credit = amt_credit;
	}
	public double getAmt_debit() {
		return amt_debit;
	}
	public void setAmt_debit(double amt_debit) {
		this.amt_debit = amt_debit;
	}
	
	
}
