package com.tuto.model.entities;

import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tuto.model.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitialiser","handler"})
@ToString
public class User extends BaseEntity {
	private String firstName;
	private String lastName;
	private int age;
	private String email;
	private String password;
	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "varchar(30) default 'User'")
	private Grade grade;
	@OneToMany(mappedBy = "user")
	private List<Comment> comments;
	

}
