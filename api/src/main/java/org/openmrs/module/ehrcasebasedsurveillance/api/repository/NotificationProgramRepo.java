package org.openmrs.module.ehrcasebasedsurveillance.api.repository;

import org.openmrs.module.ehrcasebasedsurveillance.models.NotificationPrograms;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationProgramRepo extends JpaRepository<NotificationPrograms, Long> {
	
	List<NotificationPrograms> findByName(String name);
	
	List<NotificationPrograms> findByEmail(String email);
	
	List<NotificationPrograms> findByPhone(Integer phone);
}
