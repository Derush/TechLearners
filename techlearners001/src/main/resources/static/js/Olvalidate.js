
var modal = document.getElementById('id11');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function (event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}


var modal = document.getElementById('id12');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function (event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}


var modal = document.getElementById('id13');
window.onclick = function (event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}



function getSubject51() {
    var subject51sel = document.getElementById("list51").value;
    document.getElementById("subject51").value = subject51sel;
    var op52 = document.getElementById("list52");
    for (var i = 0; i < op52.length; i++) {
        // lowercase comparison for case-insensitivity
        (op52[i].value == subject51sel )
            ? op52[i].disabled = true
            : op52[i].disabled = false;
    }
    var op53 = document.getElementById("list53");
    for (var i = 0; i < op53.length; i++) {
        // lowercase comparison for case-insensitivity
        (op3[i].value == subject51sel )
            ? op53[i].disabled = true
            : op53[i].disabled = false;
    }
}

getSubject51();


function getSubject52() {
    var subject52sel = document.getElementById("list52").value;
    var subject51sel = document.getElementById("list51").value;
    document.getElementById("subject52").value = subject52sel;
    var op53 = document.getElementById("list53");
    for (var i = 0; i < op53.length; i++) {
        // lowercase comparison for case-insensitivity
        ((op53[i].value == subject51sel ) || (op53[i].value == subject52sel ))
            ? op53[i].disabled = true
            : op53[i].disabled = false;
    }
    var opR = document.getElementById("list51");
    for (var i = 0; i < opR.length; i++) {
        // lowercase comparison for case-insensitivity
        (opR[i].value == subject52sel )
            ? opR[i].disabled = true
            : opR[i].disabled = false;
    }
}

getSubject52();







function getSubject53() {
    var subject53sel = document.getElementById("list53").value;
    document.getElementById("subject53").value = subject53sel;
}

getSubject53();

function getStream() {
    var streamval = document.getElementById("list").value;
    document.getElementById("stream").value = streamval;
}

getStream();

function getSubject61() {
    var subject61sel = document.getElementById("list61").value;
    document.getElementById("subject61").value = subject61sel;
    var op62 = document.getElementById("list62");
    for (var i = 0; i < op62.length; i++) {
        // lowercase comparison for case-insensitivity
        (op62[i].value == subject61sel )
            ? op62[i].disabled = true
            : op62[i].disabled = false;
    }
    var op63 = document.getElementById("list63");
    for (var i = 0; i < op63.length; i++) {
        // lowercase comparison for case-insensitivity
        (op63[i].value == subject61sel )
            ? op63[i].disabled = true
            : op63[i].disabled = false;
    }
}

getSubject61();


function getSubject62() {
    var subject62sel = document.getElementById("list62").value;
    var subject61sel = document.getElementById("list61").value;
    document.getElementById("subject62").value = subject62sel;
    var op63 = document.getElementById("list63");
    for (var i = 0; i < op63.length; i++) {
        // lowercase comparison for case-insensitivity
        ((op63[i].value == subject62sel ) || (op63[i].value == subject61sel ))
            ? op63[i].disabled = true
            : op63[i].disabled = false;
    }
    var opR = document.getElementById("list61");
    for (var i = 0; i < opR.length; i++) {
        // lowercase comparison for case-insensitivity
        (opR[i].value == subject62sel )
            ? opR[i].disabled = true
            : opR[i].disabled = false;
    }
}

getSubject62();






function getSubject63() {
    var subject63sel = document.getElementById("list63").value;
    document.getElementById("subject63").value = subject63sel;
}

getSubject63();



function getStream() {
    var streamval = document.getElementById("list").value;
    document.getElementById("stream").value = streamval;
}

getStream();


function getSubject41() {
    var subject41sel = document.getElementById("list41").value;
    document.getElementById("subject41").value = subject41sel;
    var op42 = document.getElementById("list42");
    for (var i = 0; i < op42.length; i++) {

        (op42[i].value == subject41sel )
            ? op42[i].disabled = true
            : op42[i].disabled = false;
    }
    var op43 = document.getElementById("list43");
    for (var i = 0; i < op43.length; i++) {
        // lowercase comparison for case-insensitivity
        (op43[i].value == subject41sel )
            ? op43[i].disabled = true
            : op43[i].disabled = false;
    }
}

getSubject41();




function getSubject42() {
    var subject41sel = document.getElementById("list41").value;
    var subject42sel = document.getElementById("list42").value;
    document.getElementById("subject42").value = subject42sel;
    var op42 = document.getElementById("list43");
    for (var i = 0; i < op42.length; i++) {
        // lowercase comparison for case-insensitivity
        ((op42[i].value == subject42sel ) || (op42[i].value == subject41sel ))
            ? op42[i].disabled = true
            : op42[i].disabled = false;
    }
    var opR = document.getElementById("list41");
    for (var i = 0; i < opR.length; i++) {
        // lowercase comparison for case-insensitivity
        (opR[i].value == subject42sel )
            ? opR[i].disabled = true
            : opR[i].disabled = false;
    }

}

getSubject42();



function getSubject43() {
    var subject43sel = document.getElementById("list43").value;
    document.getElementById("subject43").value = subject43sel;
}

getSubject43();
