package com.tuto.model.entities;



import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tuto.model.BaseEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
public class Tutorial extends BaseEntity {
	private String title;
	private String description;
	private boolean published;
	@OneToMany(mappedBy = "tutorial")
	private List<Comment> comments;
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "tutorial")
	private TutorialDetails tutorialDetails;
	@ManyToMany(mappedBy = "tutorials",cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	private Set<Tag> tags;

}
