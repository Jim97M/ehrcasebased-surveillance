package org.openmrs.module.ehrcasebasedsurveillance.models;

import java.util.Date;

public class CoreForm {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private String name;
	
	private String content;
	
	private String description;
	
	private String afterSubmit;
	
	private Date createdOn;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getAfterSubmit() {
		return afterSubmit;
	}
	
	public void setAfterSubmit(String afterSubmit) {
		this.afterSubmit = afterSubmit;
	}
	
	public Date getCreatedOn() {
		return createdOn;
	}
	
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public String toString() {
		return "Form[" + id + ", name" + name + "]";
	}
}
