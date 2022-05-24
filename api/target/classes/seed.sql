INSERT INTO TABLE `notifications_contacts`(`contact_id`, `name`, `email`, `phone`, `program_id`, `created_date) VALUES
   ("1", "Patient A", "patienta@gmail.com", "0732443454", "5","2021-09-07 10:47:47"),
   ("2", "Patient B", "patientb@gmail.com", "0723443454", "7","2021-04-07 10:23:47"),
   ("3", "Patient C", "patientc@gmail.com", "0752443454", "8","2021-01-07 09:17:20"),
   ("4", "Patient D", "patientd@gmail.com", "0700443454", "9","2022-01-03 12:00:01"),
   ("5", "Patient E", "patiente@gmail.com", "0712003454", "10","2020-09-07 10:10:12")

INSERT INTO `notifications_programs`(`program_id`, `name`, `description`, `created_date`) VALUES
   ("1", "program1", "Notification Program 1", "2021-09-03 10:47:40"),
   ("2", "program2", "Notification Program 2", "2021-06-07 09:30:04"),
   ("3", "program3", "Notification Program 3", "2021-02-05 14:51:23"),
   ("4", "program4", "Notification Program 4", "2020-11-13 16:47:10"),

INSERT INTO `notification_results`(`result_id`, `disease`, `result`, `lab_result`, `notes`, `created_date`, `status`) VALUES
   ("1", "TB", "Negative", "Negative", "No Traces of Tuberculosis Found", "2021-01-07 09:17:20", "Negative"),
   ("2", "Typhoid", "Negative", "Negative", "No Traces of Typhoid Found", "2021-02-06 09:17:20", "Negative"),
   ("1", "Dysentry", "Negative", "Negative", "No Traces of Dysentry Found", "2021-04-03 09:17:20", "Negative"),
   ("1", "Polio", "Negative", "Negative", "No Traces of Polio Found", "2020-09-07 09:17:20", "Negative"),
   ("1", "Amoeba", "Negative", "Negative", "No Traces of Amoeba Found", "2022-01-07 09:17:20", "Negative")