package com.devonfw.quarkus.domain.model;

import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;

@Table
public class Fruit {

	@PrimaryKey
    private Long id;

    private String name;

    private String color;

    public Fruit() {
    }

    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


}
