package com.microservices.TourWebsite.domain;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TourPackage {
	 @Id
	    private String code;

	 @Column
	 private String name;
	
	public TourPackage(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TourPackage other = (TourPackage) obj;
		return Objects.equals(code, other.code) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "TourPackage [code=" + code + ", name=" + name + "]";
	}
	 
	 

}
