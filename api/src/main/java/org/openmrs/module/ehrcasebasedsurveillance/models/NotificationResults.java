package org.openmrs.module.ehrcasebasedsurveillance.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "notification_results")
public class NotificationResults {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
      private String result_id;

     @Column
      private String disease;

     @Column
      private String notes;

     @Column
      private Date created_date;

     @Column
       private String status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResult_id(){
        return result_id;
    }

    public void setResult_id(String result_id){
        this.result_id = result_id;
    }

    public String getNotes(){
        return notes;
    }

    public void setNotes(String notes){
        this.notes = notes;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public Date getCreated_date(){
        return created_date;
    }

    public void setCreated_date(Date created_date){
        this.created_date = created_date;
    }



}
