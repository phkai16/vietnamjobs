package com.demo.entities;
// Generated Apr 26, 2024, 6:17:41 PM by Hibernate Tools 4.3.6.Final

import jakarta.persistence.*;

/**
 * CheckNews generated by hbm2java
 */
@Entity
@Table(name = "check_news", catalog = "vietnamjobs")
public class CheckNews implements java.io.Serializable {

	private Integer id;
	private Postings postings;
	private Seeker seeker;
	private boolean status;

	public CheckNews() {
	}

	public CheckNews(Postings postings, Seeker seeker, boolean status) {
		this.postings = postings;
		this.seeker = seeker;
		this.status = status;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "seekers_id", nullable = false)
	public Seeker getSeeker() {
		return this.seeker;
	}

	public void setSeeker(Seeker seeker) {
		this.seeker = seeker;
	}

	@Column(name = "status", nullable = false)
	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
