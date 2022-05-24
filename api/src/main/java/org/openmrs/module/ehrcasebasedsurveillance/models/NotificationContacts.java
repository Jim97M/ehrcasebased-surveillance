package org.openmrs.module.ehrcasebasedsurveillance.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "notification_contacts")
public class NotificationContacts {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long contact_id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone")
	private Integer phone;
	
	@Column(name = "date")
	private Date created_at;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinTable(name = "contact_program", joinColumns = @JoinColumn(name = "program_id"), inverseJoinColumns = @JoinColumn(name = "contact_id"))
	private List<NotificationPrograms> contactProgramList;
}
