package com.tuto.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tuto.model.BaseEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
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
public class Comment extends BaseEntity {
private String content;
@ManyToOne(optional = false,cascade = CascadeType.ALL)
private Tutorial tutorial;
@ManyToOne(optional = false,cascade = CascadeType.ALL)
private User user;
}
