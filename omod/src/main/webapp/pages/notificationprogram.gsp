<%
  ui.decorateWith("appui", "standardEmrPage", [title: "Sending Notifications To Client"])
          ui.includeJascript("ehrcasebasedsurveillance", registerNotificationPrograms.js)

%>

     <style type="text/css">
        .send-notification{

          }
        .send-form{
              display: inline-block;
          }
         .contact-number{
             flex-direction: row;
          }

         .contact-name{
              flex-direction: row
          }

         .contact-email{
              flex-direction: row
          }

         .contact-program{
              flex-direction: row
          }
          button{
            background-color: blue;
          }
     </style>

      <div class="send-notification">
         <p> Send Notification Programs</p>
        <div class="send-form">
          <form class="simple-form-ui" id="register" method="POST">
         <div class="contact-id">
           <label> Enter Contact Id</label>
             <input name="contactid" type="text" />
          </div>
          <div class="contact-number">
           <label>Enter Phone Number </label>
             <input name="phone" type="number" />
          </div>
          <div class="contact-name">
            <label>Enter Name </label>
             <input name="name" type="text" />
          </div>
          <div class="contact-email">
            <label>Enter Email </label>
             <input name="email" type="email" />
          </div>
          <div class="contact-program">
            <label>Enter ProgramId </label>
             <input name="programid" type="text" />
           </div>
           <div class=""createddate>
            <label>Enter Create Date </label>
             <input name="createddate" type="date" />
           </div>
             <button type="submit">Register Results</button>
          </form>
        </div>

      </div>