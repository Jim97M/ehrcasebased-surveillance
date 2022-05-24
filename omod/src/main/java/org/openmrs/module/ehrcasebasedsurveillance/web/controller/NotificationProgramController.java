package org.openmrs.module.ehrcasebasedsurveillance.web.controller;

import org.openmrs.module.ehrcasebasedsurveillance.api.dao.NotificationProgramDao;
import org.openmrs.module.ehrcasebasedsurveillance.api.repository.NotificationProgramRepo;
import org.openmrs.module.ehrcasebasedsurveillance.models.NotificationPrograms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080/")
@RestController
@RequestMapping("/api")
public class NotificationProgramController {
	
	@Autowired
	NotificationProgramDao npDao;
	
	@PostMapping("/programs")
	public String save(@RequestBody NotificationPrograms n) {
		return npDao.save(n) + "Notification Program Saved Successfully";
	}
	
	@GetMapping("/programs")
	public List<NotificationPrograms> findAll() {
		return npDao.findAll();
	}
	
	@DeleteMapping("/programs/{id}")
	public String deleteById(@PathVariable int program_id) {
		return npDao.deleteById(program_id) + "Notification Program Deleted Successfully";
	}
	
	@PutMapping("/programs/{id}")
	public String update(@RequestBody NotificationPrograms n, @PathVariable int program_id) {
		return npDao.update(n, program_id) + "Updated Successfully";
	}
	
}
