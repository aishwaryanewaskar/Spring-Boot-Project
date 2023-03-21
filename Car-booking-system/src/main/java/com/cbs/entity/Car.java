package com.cbs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int carId;
	@Column(length = 30, nullable = false)
	private String model;
	@Column(length = 30)
	private String color;
	@Column(length = 10, nullable = false)
	private int capacity;
	@Column(length = 30, nullable = false)
	private boolean available;
	
}
