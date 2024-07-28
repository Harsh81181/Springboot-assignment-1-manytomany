package com.jsp.springboot_first_assignment.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int rollNo;
	@ManyToMany( cascade = CascadeType.ALL)
	@JoinTable(name = "stduent_subject",
	joinColumns = @JoinColumn(name="stduent_id"),
	inverseJoinColumns = @JoinColumn(name="subject_id")
	)
	@JsonIgnore
	private List<Subject> subjects;
}
