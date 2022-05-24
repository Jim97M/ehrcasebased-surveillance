jq=jQuery;

//Expose this holder in a global scope so other widgets can access it

var navigationController;

/* Submit Functionality */
jq('#register').submit(function(e){
  e.preventDefault();
  jq('#submit').attr('disabled', 'disabled');
  jq('#submitDiagnosis').attr('disabled', 'disabled');
  jq('validation-errors').hide();
  var formData = jq('#register').serialize();

  jq.ajax({
     url: url,
     type: POST,
     data: formData,
     dataType: "json",
     success: function(response){
        emr.navigateTo({"applicationUrl": response.message});
     },
    error: function(response){
      jq('#validation-errors-content').html()
    }
  })
})

