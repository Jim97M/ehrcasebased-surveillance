<table>

  <tr>
     <th> ${ui.message("Diagnosis.time")} </th>
     <th> ${ui.message("Diagnosis.datetime")} </th>
     <th> ${ui.message("Diagnosis.email")} </th>
     <th>${ui.message("Diagnosis.name")} </th>
     <th>${ui.message("Diagosis.provider")} </th>
   </tr>
   <% if (diagnosis) { %>
     <% diagnosis.each { %>
       <tr>
          <td>${ui.format(it.time)}</td>
          <td>${ui.format(it.datetime)}</td>
          <td>${ui.format(it.email)}</td>
          <td>${ui.format(it.name)}</td>
          <td>${ui.format(it.provider)}</td>
       </tr>
   <% } %>
   <% } else { %>
      <tr>
        <td colspan="4">${ ui.message("general.none")} </td>
      </tr>
</table>



