<%
  ui.decorateWith("appui", "standardEmrPage", [title: "Notification Result"])
          ui.includeJavaScript("ehrcasebasedsurveillance", registerNotificationPrograms.js ) %>

          <style>
                  <style type="text/css">
                  .send-notification{

          }
                  .send-form{
              display: inline-block;
          }
                  .result-disease{
              flex-direction: row;
          }

                  .result-lab{
              flex-direction: row
          }

                  .result-email{
              flex-direction: row
          }

                  .result-notes{
              flex-direction: row
          }
                  .result-status{
              flex-direction: row
          }
                  .created-date{
              flex-direction: row
          }
          button{
            background-color: blue;
          }
        </style>
         </style>

      <div class="container">
        <div class="notification-header">
          <p>Notification Results</p>
        </div>
      <form name="results" id="results">
        <div class="result-id">
          <label> Result Id</label>
           <input name="result_id" />
        </div>
        <div class="result-lab">
          <label>Lab Result </label>
          <input name="lab" />
        </div>
        <div class="result-disease">
          <label> Disease</label>
          <input name="disease" />
        </div>

       <div class="result-notes" >
         <label>Notes </label>
         <input name="notes"  />
       </div>

      <div class="created-date" >
         <label> Created Date</label>
         <input name="created_date" />
      </div>
       <div class="status">
         <label> Status</label>
         <input name="status" />
       </div>
    </form>
        <button name="submit" >Create Notification</button>
      </div>
