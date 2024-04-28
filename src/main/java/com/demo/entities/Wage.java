package com.demo.entities;
// Generated Apr 26, 2024, 6:17:41 PM by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.*;

/**
 * Wage generated by hbm2java
 */
@Entity
@Table(name = "wage", catalog = "vietnamjobs")
public class Wage implements java.io.Serializable {

	private Integer id;
	private String name;
	private int min;
	private int max;
	private Set<Postings> postingses = new HashSet<Postings>(0);

	public Wage() {
	}

	public Wage(String name, int min, int max) {
		this.name = name;
		this.min = min;
		this.max = max;
	}

	public Wage(String name, int min, int max, Set<Postings> postingses) {
		this.name = name;
		this.min = min;
		this.max = max;
		this.postingses = postingses;
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

	@Column(name = "name", nullable = false, length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "min", nullable = false)
	public int getMin() {
		return this.min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	@Column(name = "max", nullable = false)
	public int getMax() {
		return this.max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "wage")
	public Set<Postings> getPostingses() {
		return this.postingses;
	}

	public void setPostingses(Set<Postings> postingses) {
		this.postingses = postingses;
	}

}
