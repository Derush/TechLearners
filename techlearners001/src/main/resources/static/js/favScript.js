function getSubject1() {
    var subject1sel = document.getElementById("list1").value;
    document.getElementById("subject1").value = subject1sel;
    var op = document.getElementById("list2");
    for (var i = 0; i < op.length; i++) {
        // lowercase comparison for case-insensitivity
        (op[i].value == subject1sel )
            ? op[i].disabled = true
            : op[i].disabled = false;
    }
    var opr3 = document.getElementById("list3");
    for (var i = 0; i < opr3.length; i++) {
        // lowercase comparison for case-insensitivity
        (opr3[i].value == subject1sel )
            ? opr3[i].disabled = true
            : opr3[i].disabled = false;
    }
}

getSubject1();


function getSubject1Result() {
    var subject1Result = document.getElementById("subject1Result1").value;
    document.getElementById("subject1R").value = subject1Result;
}

getSubject1Result();

function getSubject2() {
    var subject2sel = document.getElementById("list2").value;
    var subject1sel = document.getElementById("list1").value;
    document.getElementById("subject2").value = subject2sel;
    var op2 = document.getElementById("list3");
    for (var i = 0; i < op2.length; i++) {
        // lowercase comparison for case-insensitivity
        ((op2[i].value == subject2sel ) || (op2[i].value == subject1sel ))
            ? op2[i].disabled = true
            : op2[i].disabled = false;
    }
    var opR = document.getElementById("list1");
    for (var i = 0; i < opR.length; i++) {
        // lowercase comparison for case-insensitivity
        (opR[i].value == subject2sel )
            ? opR[i].disabled = true
            : opR[i].disabled = false;
    }
}

getSubject2();

function getSubject2Result() {
    var subject2Result = document.getElementById("subject2Result").value;
    document.getElementById("subject2R").value = subject2Result;
}

getSubject2Result();

function getSubject3() {
    var subject3sel = document.getElementById("list3").value;
    document.getElementById("subject3").value = subject3sel;

}

getSubject3();


function getSubject3Result() {
    var subject3Result = document.getElementById("subject3Result").value;
    document.getElementById("subject3R").value = subject3Result;


}

getSubject3Result();


function getStream() {
    var streamval = document.getElementById("list").value;
    document.getElementById("stream").value = streamval;
}

getStream();


var modal = document.getElementById('id01');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function (event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}


<!-- script for pop up -->

function getSubject21() {
    var subject21sel = document.getElementById("list21").value;
    document.getElementById("subject21").value = subject21sel;
    var op22 = document.getElementById("list22");
    for (var i = 0; i < op22.length; i++) {
        // lowercase comparison for case-insensitivity
        (op22[i].value == subject21sel )
            ? op22[i].disabled = true
            : op22[i].disabled = false;
    }
    var opr23 = document.getElementById("list23");
    for (var i = 0; i < opr23.length; i++) {
        // lowercase comparison for case-insensitivity
        (opr23[i].value == subject21sel )
            ? opr23[i].disabled = true
            : opr23[i].disabled = false;
    }
}

getSubject21();





function getSubject22() {

    var subject22sel = document.getElementById("list22").value;
    // var subject21sel = document.getElementById("list21").value;
    document.getElementById("subject22").value = subject22sel;
    /* var op22 = document.getElementById("list23");
     for (var i = 0; i < op22.length; i++) {
         // lowercase comparison for case-insensitivity
         ((op22[i].value == subject22sel ) || (op22[i].value == subject21sel ))
             ? op22[i].disabled = true
             : op22[i].disabled = false;
     }
     var opR1 = document.getElementById("list21");
     for (var i = 0; i < opR1.length; i++) {
         // lowercase comparison for case-insensitivity
         (opR1[i].value == subject22sel )
             ? opR1[i].disabled = true
             : opR1[i].disabled = false;
     }*/
}

getSubject22();



function getSubject23() {
    var subject23sel = document.getElementById("list23").value;
    document.getElementById("subject23").value = subject23sel;
}

getSubject23();




function getStream() {
    var streamval = document.getElementById("list").value;
    document.getElementById("stream").value = streamval;
}

getStream();


var modal = document.getElementById('id02');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function (event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}


<!-- script for pop up -->

function getSubject31() {
    var subject31sel = document.getElementById("list31").value;
    document.getElementById("subject31").value = subject31sel;
    var op32 = document.getElementById("list32");
    for (var i = 0; i < op31.length; i++) {
        // lowercase comparison for case-insensitivity
        (op32[i].value == subject31sel )
            ? op32[i].disabled = true
            : op32[i].disabled = false;
    }
    var opr33 = document.getElementById("list33");
    for (var i = 0; i < opr3.length; i++) {
        // lowercase comparison for case-insensitivity
        (opr33[i].value == subject31sel )
            ? opr33[i].disabled = true
            : opr33[i].disabled = false;
    }
}

getSubject31();



function getSubject32() {
    var subject32sel = document.getElementById("list32").value;
    document.getElementById("subject32").value = subject32sel;
}

getSubject32();




function getSubject33() {
    var subject33sel = document.getElementById("list33").value;
    document.getElementById("subject33").value = subject33sel;
}

getSubject33();







function getStream() {
    var streamval = document.getElementById("list").value;
    document.getElementById("stream").value = streamval;
}

getStream();


var modal = document.getElementById('id03');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function (event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}


<!-- script for pop up -->

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
    var subject42sel = document.getElementById("list42").value;
    document.getElementById("subject42").value = subject42sel;
}

getSubject42();





function getSubject43() {
    var subject43sel = document.getElementById("list43").value;
    document.getElementById("subject43").value = subject43sel;
}

getSubject43();







function getStream() {
    var streamval = document.getElementById("list").value;
    document.getElementById("stream").value = streamval;
}

getStream();


var modal = document.getElementById('id04');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function (event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}


function validateForm4() {
    var x = document.forms["myForm"]["subject41"].value;
    var y = document.forms["myForm"]["subject42"].value;
    var z = document.forms["myForm"]["subject43"].value;
    if (((x == y) || (y == z) || (x == z))) {
        alert("There are same subjects in the form");
        return false;
    }
}

<!-- script for pop up -->

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

function getSubject51Result() {
    var subject51Result = document.getElementById("subject1Result51").value;
    document.getElementById("subject51R").value = subject51Result;
}

getSubject51Result();

function getSubject52() {
    var subject52sel = document.getElementById("list52").value;
    document.getElementById("subject52").value = subject52sel;
}

getSubject52();


function getSubject52Result() {
    var subject52Result = document.getElementById("subject52Result").value;
    document.getElementById("subject52R").value = subject52Result;
}

getSubject52Result();


function getSubject53() {
    var subject53sel = document.getElementById("list53").value;
    document.getElementById("subject53").value = subject53sel;
}

getSubject53();


function getSubject53Result() {
    var subject53Result = document.getElementById("subject53Result").value;
    document.getElementById("subject53R").value = subject53Result;
}

getSubject53Result();


function getStream() {
    var streamval = document.getElementById("list").value;
    document.getElementById("stream").value = streamval;
}

getStream();


var modal = document.getElementById('id05');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function (event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}


function validateForm5() {
    var x = document.forms["myForm"]["subject51"].value;
    var y = document.forms["myForm"]["subject52"].value;
    var z = document.forms["myForm"]["subject53"].value;
    if (((x == y) || (y == z) || (x == z))) {
        alert("There are same subjects in the form");
        return false;
    }
}

<!-- script for pop up -->

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

function getSubject61Result() {
    var subject61Result = document.getElementById("subject1Result61").value;
    document.getElementById("subject61R").value = subject61Result;
}

getSubject61Result();

function getSubject62() {
    var subject62sel = document.getElementById("list62").value;
    document.getElementById("subject62").value = subject62sel;
}

getSubject62();


function getSubject62Result() {
    var subject62Result = document.getElementById("subject62Result").value;
    document.getElementById("subject62R").value = subject62Result;
}

getSubject62Result();


function getSubject63() {
    var subject63sel = document.getElementById("list63").value;
    document.getElementById("subject63").value = subject63sel;
}

getSubject63();


function getSubject63Result() {
    var subject63Result = document.getElementById("subject63Result").value;
    document.getElementById("subject63R").value = subject63Result;
}

getSubject63Result();


function getStream() {
    var streamval = document.getElementById("list").value;
    document.getElementById("stream").value = streamval;
}

getStream();


var modal = document.getElementById('id06');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function (event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}


function validateForm6() {
    var x = document.forms["myForm"]["subject61"].value;
    var y = document.forms["myForm"]["subject62"].value;
    var z = document.forms["myForm"]["subject63"].value;
    if (((x == y) || (y == z) || (x == z))) {
        alert("There are same subjects in the form");
        return false;
    }
}
