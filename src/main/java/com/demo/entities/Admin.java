package com.demo.entities;
// Generated Apr 26, 2024, 6:17:41 PM by Hibernate Tools 4.3.6.Final

import jakarta.persistence.*;

/**
 * Admin generated by hbm2java
 */
@Entity
@Table(name = "admin", catalog = "vietnamjobs")
public class Admin implements java.io.Serializable {

	private Integer id;
	private Account account;
	private String fullname;
	private String phone;
	private String photo;

	public Admin() {
	}

	public Admin(Account account, String fullname, String phone, String photo) {
		this.account = account;
		this.fullname = fullname;
		this.phone = phone;
		this.photo = photo;
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
	@JoinColumn(name = "account_id", nullable = false)
	public Account getaccount() {
		return this.account;
	}

	public void setaccount(Account account) {
		this.account = account;
	}

	@Column(name = "fullname", nullable = false, length = 250)
	public String getFullname() {
		return this.fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	@Column(name = "phone", nullable = false, length = 100)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "photo", nullable = false, length = 250)
	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

}
