package com.demo.entities;
// Generated Apr 26, 2024, 6:17:41 PM by Hibernate Tools 4.3.6.Final

import java.util.Date;
import jakarta.persistence.*;

/**
 * Payment generated by hbm2java
 */
@Entity
@Table(name = "payment", catalog = "vietnamjobs")
public class Payment implements java.io.Serializable {

	private Integer id;
	private Postings postings;
	private Date startDate;
	private Date endDate;
	private double cost;

	public Payment() {
	}

	public Payment(Postings postings, Date startDate, Date endDate, double cost) {
		this.postings = postings;
		this.startDate = startDate;
		this.endDate = endDate;
		this.cost = cost;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "postings_id", nullable = false)
	public Postings getPostings() {
		return this.postings;
	}

	public void setPostings(Postings postings) {
		this.postings = postings;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "start_date", nullable = false, length = 10)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "end_date", nullable = false, length = 10)
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Column(name = "cost", nullable = false, precision = 22, scale = 0)
	public double getCost() {
		return this.cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

}