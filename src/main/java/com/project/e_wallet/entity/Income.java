package com.project.e_wallet.entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="income")
public class Income {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="iid")
	private int iid;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="amount")
	private double amount;
	
	@Column(name="detail")
	private String description;
	
	@ManyToOne(cascade= {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name = "inc_user_id")
	private User user;
	
	
	
}
