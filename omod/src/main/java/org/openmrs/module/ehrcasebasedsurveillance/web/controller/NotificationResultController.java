package org.openmrs.module.ehrcasebasedsurveillance.web.controller;

import org.openmrs.module.ehrcasebasedsurveillance.api.dao.NotificationResultDao;
import org.openmrs.module.ehrcasebasedsurveillance.models.NotificationResults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:8080")
@RestController
@RequestMapping("/result")
public class NotificationResultController {
    @Autowired
    NotificationResultDao nrDao;

    @PostMapping("/save")
    public String save(@RequestBody NotificationResults n){
       return  nrDao.save(n) + "Notification Results Saved Successfully";
    }

    @GetMapping("/find")
    public List<NotificationResults> findAll(){
        return nrDao.findAll();
    }

    @GetMapping("/find/{id}")
     public String findById(@RequestBody int result_id){
        return nrDao.findById(result_id) + "Notification Result id Found";
    }

    @DeleteMapping("/delete/{id}")
     public String deleteById(@RequestBody int result_id){
        return nrDao.deleteById(result_id) + "Notification Result Id Deleted Successfully";
    }

    @PutMapping("/update/{id}")
      public String update(@RequestBody NotificationResults n, int result_id){
        return nrDao.update(n, result_id) + "Updated Successfully";
    }

}
