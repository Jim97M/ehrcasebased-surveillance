package org.openmrs.module.ehrcasebasedsurveillance;

import org.openmrs.EncounterType;
import org.openmrs.Obs;
import org.openmrs.Patient;
import org.openmrs.api.APIException;
import org.openmrs.api.OpenmrsService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface EHRCasebasedSurveillianceService extends OpenmrsService {
	
	public List<Obs> listObsGroup(Integer personalId, Integer conceptId, Integer min, Integer max) throws APIException;
	
	public EncounterType insertEncounterTypeByKey(String type) throws APIException;
}
