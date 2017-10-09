function getSubject1() {
    var subject1sel = document.getElementById("list1").value;
    document.getElementById("subject1").value = subject1sel;

}

getSubject1();


function getSubject1Result() {
    var subject1Result = document.getElementById("subject1Result1").value;
    document.getElementById("subject1R").value = subject1Result;
}

getSubject1Result();


function getSubject2() {
    var subject2sel = document.getElementById("list2").value;
    document.getElementById("subject2").value = subject1sel;

}

getSubject2();


function getSubject1Result() {
    var subject2Result = document.getElementById("subject1Result2").value;
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


function getSubject4() {
    var subject4sel = document.getElementById("list4").value;
    document.getElementById("subject4").value = subject4sel;

}

getSubject4();


function getSubject4Result() {
    var subject4Result = document.getElementById("subject4Result").value;
    document.getElementById("subject4R").value = subject4Result;


}

getSubject4Result();


function getSubject5() {
    var subject5sel = document.getElementById("list5").value;
    document.getElementById("subject5").value = subject5sel;
}

getSubject5();

function getSubject5Result() {
    var subject5Result = document.getElementById("subject1Result2").value;
    document.getElementById("subject5R").value = subject5Result;
}

getSubject5Result();


function getSubject6() {
    var subject6sel = document.getElementById("list6").value;
    document.getElementById("subject6").value = subject6sel;
}

getSubject6();


function getSubject6Result() {
    var subject6Result = document.getElementById("subject1Result6").value;
    document.getElementById("subject6R").value = subject6Result;
}

getSubject6Result();


function getSubject7() {
    var subject7sel = document.getElementById("list7").value;
    document.getElementById("subject7").value = subject7sel;
}

getSubject7();


function getSubject7Result() {
    var subject7Result = document.getElementById("subject1Result7").value;
    document.getElementById("subject7R").value = subject7Result;
}

getSubject7Result();


function getSubject8() {
    var subject8sel = document.getElementById("list8").value;
    document.getElementById("subject8").value = subject8sel;
}

getSubject8();


function getSubject8Result() {
    var subject8Result = document.getElementById("subject1Result8").value;
    document.getElementById("subject8R").value = subject8Result;
}

getSubject8Result();


function getSubject9() {
    var subject9sel = document.getElementById("list9").value;
    document.getElementById("subject9").value = subject9sel;
}

getSubject9();


function getSubject9Result() {
    var subject9Result = document.getElementById("subject1Result9").value;
    document.getElementById("subject9R").value = subject9Result;
}

getSubject9Result();


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
