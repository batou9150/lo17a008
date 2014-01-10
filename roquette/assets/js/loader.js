function load_results(natural_query) {
	var jqxhr = $.ajax({type: "GET", url: "http://www.google.fr"})
	  .done(function(data) {
		  $("#content").html(data);
		  alert("done");
	  })
	  .fail(function(jqXHR, textStatus, errorThrown) {
		  alert(jqXHR.responseText);
		  alert(jqXHR.responseXML);
	  });
}