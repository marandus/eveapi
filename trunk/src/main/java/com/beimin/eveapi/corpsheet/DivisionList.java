package com.beimin.eveapi.corpsheet;

import java.util.ArrayList;
import java.util.Collection;

class DivisionList {
	private String name;
	private final Collection<Division> divisions = new ArrayList<Division>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addDivision(Division division) {
		divisions.add(division);
	}

	public Collection<Division> getDivisions() {
		return divisions;
	}
}