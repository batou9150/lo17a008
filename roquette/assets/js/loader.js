function load_results(natural_query) {
	if(natural_query == null) {
		natural_query = $("input[name=requete]").val();
	} else {
		$("input[name=requete]").val(natural_query);
	}
	$("#content").html("");
	$("#btn-go").html("<img src=\"assets/img/load.gif\">");
	var jqxhr = $.ajax({
		type : "GET",
		url : "servlet/LanceRequete",
		data: { requete : natural_query }
	}).done(function(data) {
		var obj = $.parseJSON(data);
		var content = "";
		if(obj.naturalQuery != null && obj.naturalQuery != "")
			content += "<div class=\"alert alert-success\">" + obj.naturalQuery + "</div>";
		if(obj.queryPostCorrection != null && obj.queryPostCorrection != "")
			content += "<div class=\"alert alert-info\">" + obj.queryPostCorrection + "</div>";
		if(obj.queryPostLemme != null && obj.queryPostLemme != "")
			content += "<div class=\"alert alert-info\">" + obj.queryPostLemme + "</div>";
		if(obj.SQLQuery != null && obj.SQLQuery != "")
			content += "<div class=\"alert alert-warning\">" + obj.SQLQuery + "</div>";
		if(obj.error != null && obj.error != "")
			content += "<div class=\"alert alert-danger\">" + obj.error + "</div>";
		
		if(obj.results != null && obj.results != "") {
			content += "<div class=\"col-md-3\">";
			if(obj.count != null) {
				content += "Il y a " + obj.count + " r&eacute;sultat";
				if(obj.count > 1) content += "s";
				content += ".";
			}
			content += obj.results + "</div><div id=\"display\" class=\"col-md-4\"></div>";
		}
		
		$("#content").html(content);
		$("#btn-go").html("Go!");
	}).fail(function(jqXHR) {
		$("#content").html(data + "servlet/LanceRequete");
		$("input[name=requete]").val("");
	});
}

function load_LCI(url) {
	$("#display").html("<iframe width=\"900px\" height=\"10000px\" src=\"LCI/" + url + "\"></iframe>");
}

function keyUp(event) {
	if(event.keyCode != 37 && event.keyCode != 38 && event.keyCode != 39 && event.keyCode != 40) {
		load_results();
	}
}