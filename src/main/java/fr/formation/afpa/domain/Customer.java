package fr.formation.afpa.domain;
// Generated 10 mai 2021 12:01:41 by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Customer generated by hbm2java
 */
public class Customer implements java.io.Serializable {

	private Integer custId;
	private String address;
	private String city;
	private String custTypeCd;
	private String fedId;
	private String postalCode;
	private String state;
	private Set accounts = new HashSet(0);
	private Set comptes = new HashSet(0);
private Set officers = new HashSet(0);

	public Customer() {
	}

	public Customer(String custTypeCd, String fedId) {
		this.custTypeCd = custTypeCd;
		this.fedId = fedId;
	}

	public Customer(String address, String city, String custTypeCd, String fedId, String postalCode, String state,
			Set accounts, Set comptes, Set officers) {
		this.address = address;
		this.city = city;
		this.custTypeCd = custTypeCd;
		this.fedId = fedId;
		this.postalCode = postalCode;
		this.state = state;
		this.accounts = accounts;
		this.comptes = comptes;
		
		this.officers = officers;
	}

	public Integer getCustId() {
		return this.custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCustTypeCd() {
		return this.custTypeCd;
	}

	public void setCustTypeCd(String custTypeCd) {
		this.custTypeCd = custTypeCd;
	}

	public String getFedId() {
		return this.fedId;
	}

	public void setFedId(String fedId) {
		this.fedId = fedId;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Set getAccounts() {
		return this.accounts;
	}

	public void setAccounts(Set accounts) {
		this.accounts = accounts;
	}

	public Set getComptes() {
		return this.comptes;
	}

	public void setComptes(Set comptes) {
		this.comptes = comptes;
	}

	
	public Set getOfficers() {
		return this.officers;
	}

	public void setOfficers(Set officers) {
		this.officers = officers;
	}

}
