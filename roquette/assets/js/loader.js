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
		$("#content").html(data);
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
