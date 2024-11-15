package dev.vissa.nevermissue.shared.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tasks")
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "taskID")
	private Integer id;
	@Column(name = "displayDescription")
	private String description;
	//private String name;
	//private Integer priority;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "issueID")
	private Issue issue;
	
}
