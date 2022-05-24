package org.openmrs.module.ehrcasebasedsurveillance.api.dao;

import org.openmrs.module.ehrcasebasedsurveillance.models.NotificationPrograms;

import java.util.List;

public interface NotificationProgramDao {
	
	public List<NotificationPrograms> findAll();
	
	public NotificationPrograms findById(int program_id);
	
	public int deleteById(int program_id);
	
	public int save(NotificationPrograms n);
	
	public int update(NotificationPrograms n, int program_id);
}
