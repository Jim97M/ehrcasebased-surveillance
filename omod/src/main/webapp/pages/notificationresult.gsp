<%
  ui.decorateWith("appui", "standardEmrPage", [title: "Notification Result"])
          ui.includeJavaScript("", registerNotificationPrograms.js ) %>

          <style>

         </style>

      <div>
        <div>
          <p>Notification Results</p>
        </div>
      <form  >
        <div>
          <label> Result Id</label>
           <input name="result_id" />
        </div>
        <div>
          <label>Lab Result </label>
          <input name="result" />
        </div>
        <div>
          <label> Disease</label>
          <input name="disease" />
        </div>
     
        <div>
          <label> Lab Result</label>
           <input name="lab_result" />
        </div>

       <div>
         <label>Notes </label>
         <input name="result_id"  />
       </div>

      <div>
        <label> Created Date</label>
      </div>
       <div>
         <label> Status</label>
       </div>
    </form>
        <Button >Create Notification</Button>
      </div>
