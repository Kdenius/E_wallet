package com.project.e_wallet.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="name",length=20)
	private String name;
	@Column(name="mail",length=20)
	private String mail;
	@Column(name="status")
	private double status; // current amount
	
	@OneToMany(mappedBy="user",cascade=CascadeType.ALL)
	private List<Income> incomes;
	@OneToMany(mappedBy="user",cascade=CascadeType.ALL)
	private List<Expenses> expenses;
	
	public User() {}
	public User(int id, String name, String mail, double status, List<Income> incomes, List<Expenses> expenses) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.status = status;
		this.incomes = incomes;
		this.expenses = expenses;
	}
//	public User(int id, String name, String mail, double status) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.mail = mail;
//		this.status = status;
//	}
	


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public double getStatus() {
		return status;
	}
	public void setStatus(double status) {
		this.status = status;
	}
	public List<Income> getIncomes() {
		return incomes;
	}
	public void setIncomes(List<Income> incomes) {
		this.incomes = incomes;
	}
	public List<Expenses> getExpenses() {
		return expenses;
	}
	public void setExpenses(List<Expenses> expenses) {
		this.expenses = expenses;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mail=" + mail + ", status=" + status + ", incomes=" + incomes
				+ ", expenses=" + expenses + "]";
	}
	
}
