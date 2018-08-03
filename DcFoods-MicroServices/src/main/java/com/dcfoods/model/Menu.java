package com.dcfoods.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_MENU")
public class Menu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String day;
	
	@Override
	public String toString() {
		return "Menu [id=" + id + ", day=" + day + ", brk_fst=" + brk_fst + ", lunch=" + lunch + ", dinner=" + dinner
				+ "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getBrk_fst() {
		return brk_fst;
	}

	public void setBrk_fst(String brk_fst) {
		this.brk_fst = brk_fst;
	}

	public String getLunch() {
		return lunch;
	}

	public void setLunch(String lunch) {
		this.lunch = lunch;
	}

	public String getDinner() {
		return dinner;
	}

	public void setDinner(String dinner) {
		this.dinner = dinner;
	}

	private String brk_fst;
	
	private String lunch;
	
	private String dinner;

}
