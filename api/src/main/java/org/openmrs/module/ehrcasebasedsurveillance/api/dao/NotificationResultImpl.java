package org.openmrs.module.ehrcasebasedsurveillance.api.dao;

import org.openmrs.logic.op.Not;
import org.openmrs.module.ehrcasebasedsurveillance.models.NotificationResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NotificationResultImpl implements NotificationResultDao {

    @Autowired
     JdbcTemplate jdbcTemplate;

    @Override
    public List<NotificationResults> findAll(){
        return jdbcTemplate.query("SELECT * FROM notification_results", new BeanPropertyRowMapper<NotificationResults>(NotificationResults.class
        ));
    }

    @Override
    public NotificationResults findById(int result_id){
       return jdbcTemplate.queryForObject("SELECT * FROM notification_results WHERE id=?", new BeanPropertyRowMapper<>(NotificationResults.class), result_id);
    }

    @Override
    public int save(NotificationResults n){
        return jdbcTemplate.update("INSERT INTO notification_results(result_id, disease, lab_result, notes, created_date, status) VALUES(?,?,?,?)", new Object[]{
                n.getId(), n.getResult_id(), n.getNotes(), n.getStatus(), n.getCreated_date()
        });
    }

    @Override
    public int deleteById(int result_id){
      return   jdbcTemplate.update("DELETE * FROM notification_results WHERE result_id=?", result_id);
    }

    @Override
    public int update(NotificationResults n, int result_id){
      return jdbcTemplate.update("UPDATE notification_programs SET result_id=?, disease=?, lab_result=?, notes=?, created_date=?, status=?", new Object[]{n.getResult_id(), n.getNotes(), n.getStatus(), n.getCreated_date()});
    }

}
