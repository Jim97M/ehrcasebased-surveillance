package org.openmrs.module.ehrcasebasedsurveillance.api.dao;

import org.openmrs.module.ehrcasebasedsurveillance.models.NotificationPrograms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NotificationProgramImpl implements NotificationProgramDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<NotificationPrograms> findAll() {
		return jdbcTemplate.query("Select * FROM notification_programs", new BeanPropertyRowMapper<NotificationPrograms>(
		        NotificationPrograms.class));
	}
	
	@Override
	public NotificationPrograms findById(int program_id) {
		return jdbcTemplate.queryForObject("SELECT * FROM notification_programs WHERE program_id=?",
		    new BeanPropertyRowMapper<NotificationPrograms>(NotificationPrograms.class), program_id);
	}
	
	@Override
	public int deleteById(int program_id) {
		return jdbcTemplate.update("DELETE * FROM notification_programs WHERE program_id=?", program_id);
	}
	
	@Override
	public int save(NotificationPrograms n) {
		return jdbcTemplate.update(
		    "INSERT INTO notification_programs(program_id, name, description, created_date) VALUES(?,?,?,?)", new Object[] {
		            n.getProgram_id(), n.getCreated_date(), n.getName(), n.getDescription() });
	}
	
	@Override
	public int update(NotificationPrograms n, int program_id) {
		return jdbcTemplate.update(
		    "UPDATE notification_programs SET name = ?, description = ?, created_date = ? WHERE program_id = ?",
		    new Object[] { n.getDescription(), n.getName(), n.getCreated_date() }, program_id);
	}


}
