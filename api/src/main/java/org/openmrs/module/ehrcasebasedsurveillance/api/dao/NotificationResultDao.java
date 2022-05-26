package org.openmrs.module.ehrcasebasedsurveillance.api.dao;

import org.openmrs.module.ehrcasebasedsurveillance.models.NotificationResults;

import java.util.List;

public interface NotificationResultDao {

    public List<NotificationResults> findAll();

    public NotificationResults findById(int result_id);

    public int deleteById(int result_id);

    public int save(NotificationResults n);

    public int update(NotificationResults n, int result_id);
}
