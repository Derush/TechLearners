function getSubject1() {
    var subject1sel = document.getElementById("list1").value;
    document.getElementById("subject1").value = subject1sel;
    var op1 = document.getElementById("list2");
    for (var i = 0; i < op1.length; i++) {
        (op1[i].value == subject1sel )
            ? op1[i].disabled = true
            : op1[i].disabled = false;
    }
    var opr3 = document.getElementById("list3");
    for (var i = 0; i < opr3.length; i++) {
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
    document.getElementById("subject2").value = subject2sel;
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

function getdistrict1() {
    var distri1 = document.getElementById("districtList1").value;
    document.getElementById("district1").value = distri1;
}

getdistrict();

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


function validateForm1() {
    var x = document.forms["myForm"]["subject1"].value;
    var y = document.forms["myForm"]["subject2"].value;
    var z = document.forms["myForm"]["subject3"].value;
    if (((x == y) || (y == z) || (x == z))) {
        alert("There are same subjects in the form");
        return false;
    }
}

<!-- script for pop up -->

function getSubject21() {
    var subject21sel = document.getElementById("list21").value;
    document.getElementById("subject21").value = subject21sel;
}

getSubject21();

function getSubject21Result() {
    var subject21Result = document.getElementById("subject1Result21").value;
    document.getElementById("subject21R").value = subject21Result;
}

getSubject21Result();

function getSubject22() {
    var subject22sel = document.getElementById("list22").value;
    document.getElementById("subject22").value = subject22sel;
}

getSubject22();


function getSubject22Result() {
    var subject22Result = document.getElementById("subject22Result").value;
    document.getElementById("subject22R").value = subject22Result;
}

getSubject22Result();


function getSubject23() {
    var subject23sel = document.getElementById("list23").value;
    document.getElementById("subject23").value = subject23sel;
}

getSubject23();


function getSubject23Result() {
    var subject23Result = document.getElementById("subject23Result").value;
    document.getElementById("subject23R").value = subject23Result;
}

getSubject23Result();

function getdistrict2() {
    var distri2 = document.getElementById("districtList2").value;
    document.getElementById("district2").value = distri1;
}


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


function validateForm2() {
    var x = document.forms["myForm"]["subject21"].value;
    var y = document.forms["myForm"]["subject22"].value;
    var z = document.forms["myForm"]["subject23"].value;
    if (((x == y) || (y == z) || (x == z))) {
        alert("There are same subjects in the form");
        return false;
    }
}

<!-- script for pop up -->

function getSubject31() {
    var subject31sel = document.getElementById("list31").value;
    document.getElementById("subject31").value = subject31sel;
}

getSubject31();

function getSubject31Result() {
    var subject31Result = document.getElementById("subject1Result31").value;
    document.getElementById("subject31R").value = subject31Result;
}

getSubject31Result();

function getSubject32() {
    var subject32sel = document.getElementById("list32").value;
    document.getElementById("subject32").value = subject32sel;
}

getSubject32();


function getSubject32Result() {
    var subject32Result = document.getElementById("subject32Result").value;
    document.getElementById("subject32R").value = subject32Result;
}

getSubject32Result();


function getSubject33() {
    var subject33sel = document.getElementById("list33").value;
    document.getElementById("subject33").value = subject33sel;
}

getSubject33();


function getSubject33Result() {
    var subject33Result = document.getElementById("subject33Result").value;
    document.getElementById("subject33R").value = subject33Result;
}

getSubject33Result();


function getStream() {
    var streamval = document.getElementById("list").value;
    document.getElementById("stream").value = streamval;
}

getStream();

function getdistrict3() {
    var distri3 = document.getElementById("districtList3").value;
    document.getElementById("district3").value = distri3;
}


var modal = document.getElementById('id03');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function (event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}


function validateForm3() {
    var x = document.forms["myForm"]["subject31"].value;
    var y = document.forms["myForm"]["subject32"].value;
    var z = document.forms["myForm"]["subject33"].value;
    if (((x == y) || (y == z) || (x == z))) {
        alert("There are same subjects in the form");
        return false;
    }
}

<!-- script for pop up -->

function getSubject41() {
    var subject41sel = document.getElementById("list41").value;
    document.getElementById("subject41").value = subject41sel;
}

getSubject41();

function getSubject41Result() {
    var subject41Result = document.getElementById("subject1Result41").value;
    document.getElementById("subject41R").value = subject41Result;
}

getSubject41Result();

function getSubject42() {
    var subject42sel = document.getElementById("list42").value;
    document.getElementById("subject42").value = subject42sel;
}

getSubject42();


function getSubject42Result() {
    var subject42Result = document.getElementById("subject42Result").value;
    document.getElementById("subject42R").value = subject42Result;
}

getSubject42Result();


function getSubject43() {
    var subject43sel = document.getElementById("list43").value;
    document.getElementById("subject43").value = subject43sel;
}

getSubject43();


function getSubject43Result() {
    var subject43Result = document.getElementById("subject43Result").value;
    document.getElementById("subject43R").value = subject43Result;
}

getSubject43Result();

function getdistrict4() {
    var distri4 = document.getElementById("districtList4").value;
    document.getElementById("district4").value = distri4;
}

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

function getdistrict5() {
    var distri5 = document.getElementById("districtList5").value;
    document.getElementById("district5").value = distri5;
}


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

function getdistrict6() {
    var distri6 = document.getElementById("districtList6").value;
    document.getElementById("district6").value = distri6;
}


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
