<%
  ui.decorateWith("appui", "standardEmrPage", [title: "Sending Notifications To Client"])
%>
          <script type="text/javascript">

          </script>
  <style>

  </style>

    <div class="clear"> Send Notifications to Client </div>
      <div>
        <div>
          <form>
             <input name="contactid"  />
             <input name="phone" />
             <input name="name" />
             <input name="email" />
             <input name="programid" />
             <input name="createddate" />
             <button type="submit" onClick={handleSubmit()}>Send</button>
          </form>
        </div>

      </div>