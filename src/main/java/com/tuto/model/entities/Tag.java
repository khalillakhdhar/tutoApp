package com.tuto.model.entities;


import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tuto.model.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitialiser","handler"})
public class Tag extends BaseEntity {
private String tagName;
@ManyToMany()
private Set<Tutorial> tutorials;

}
