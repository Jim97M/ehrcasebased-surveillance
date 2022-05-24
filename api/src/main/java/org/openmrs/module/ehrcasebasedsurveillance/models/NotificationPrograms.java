package org.openmrs.module.ehrcasebasedsurveillance.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "notifications_contacts")
public class NotificationPrograms {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long program_id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "created_date")
	private Date created_date;
	
	public Long getProgram_id() {
		return program_id;
	}
	
	public void setProgram_id(Long program_id) {
		this.program_id = program_id;
	}
	
	public void setProgram_id() {
		this.program_id = program_id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Date getCreated_date() {
		return created_date;
	}
	
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	
}
