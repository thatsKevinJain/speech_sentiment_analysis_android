$(".button-collapse").sideNav();
$(".modal").modal();

$(document).ready(function() {
  $(".collapsible").collapsible();
});

var config = {
  apiKey: "AIzaSyB4-bScbPeLDdxA0kIucVtHUPop6bhKfOs",
  authDomain: "speech-analysis-194811.firebaseapp.com",
  databaseURL: "https://speech-analysis-194811.firebaseio.com",
  projectId: "speech-analysis-194811",
  storageBucket: "speech-analysis-194811.appspot.com",
  messagingSenderId: "742301869392"
};
firebase.initializeApp(config);

var timeaverage = {
  length: 0,
  total: 0
};

firebase
  .database()
  .ref("/Users")
  .once("value")
  .then(function(snapshot) {
    var data = snapshot.val();
    var vals = Object.values(data);

    var servicelevel = vals
      .map(function(element, i, self) {
        if (element.time_duration < 46) {
          return element.time_duration;
        }
      })
      .filter(Boolean);

    $("#service_level").html(
      Number(servicelevel.length / vals.length) * 100 + "%"
    );

    $("#total_calls").html(vals.length);

    for (var key in data) {
      timeaverage.length++;
      timeaverage.total = timeaverage.total + Number(data[key].time_duration);

      $("#showList").append(
        $("<li></li>").html(`
			<div class="collapsible-header active">${key}</div>
			<div class="collapsible-body">Content: ${
        data[key].classify_content ? data[key].classify_content : "No Content"
      }</div>
			<div class="collapsible-body">Sentiment: ${
        data[key].sentiment ? data[key].sentiment : 0
      }</div>
			<div class="collapsible-body">Time Duration: ${
        data[key].time_duration ? data[key].time_duration : 0
      }</div>
	  		<div class="collapsible-body">Score: ${Math.abs(
          Number(
            data[key].sentiment * 100 +
              Number(data[key].time_duration) / 45 * 100
          ) / 2
        ).toFixed()}</div>
			`)
      );
    }
  })
  .then(function() {
    $("#average_call").html(
      Number(timeaverage.total / timeaverage.length).toFixed(2) + "s"
    );
  });
