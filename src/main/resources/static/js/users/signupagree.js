function selectAll(selectAll) {

    const checkboxes = document.getElementsByName("a-check1")
    
    checkboxes.forEach((checkbox) => {
      checkbox.checked = selectAll.checked;
    })

}

function allChecked() {

    const allCheck = document.querySelector('input[name="all"]');
    const checkboxes = document.querySelectorAll('input[name="a-check1"]');
    const checkboxesChecked = document.querySelectorAll('input[name="a-check1"]:checked');
    
    if (checkboxes.length === checkboxesChecked.length) {
        allCheck.checked = true;
    } else {
        allCheck.checked = false;
    }

}


function selectAll2(selectAll2) {

    const checkboxes2 = document.getElementsByName("a-check2")
    
    checkboxes2.forEach((checkbox2) => {
      checkbox2.checked = selectAll2.checked;
    })

}

function allChecked2() {

    const allCheck2 = document.querySelector('input[name="all2"]');
    const checkboxes2 = document.querySelectorAll('input[name="a-check2"]');
    const checkboxesChecked2 = document.querySelectorAll('input[name="a-check2"]:checked');
    
    if (checkboxes2.length === checkboxesChecked2.length) {
        allCheck2.checked = true;
    } else {
        allCheck2.checked = false;
    }

}

function modal1(){
	document.getElementById('modal1').style.opacity="1";
	document.getElementById('modal1').style.visibility="visible";
	document.body.style.overflowY="hidden";
	document.body.style.position="relative";
}
function modalc1(){
	document.getElementById('modal1').style.opacity="0";
	document.getElementById('modal1').style.visibility="hidden";
}
function modal2(){
	document.getElementById('modal2').style.opacity="1";
	document.getElementById('modal2').style.visibility="visible";
	document.body.style.overflowY="hidden";
	document.body.style.position="relative";
}
function modalc2(){
	document.getElementById('modal2').style.opacity="0";
	document.getElementById('modal2').style.visibility="hidden";
}
function modal3(){
	document.getElementById('modal3').style.opacity="1";
	document.getElementById('modal3').style.visibility="visible";
	document.body.style.overflowY="hidden";
	document.body.style.position="relative";
}
function modalc3(){
	document.getElementById('modal3').style.opacity="0";
	document.getElementById('modal3').style.visibility="hidden";
}
function modal4(){
	document.getElementById('modal4').style.opacity="1";
	document.getElementById('modal4').style.visibility="visible";
	document.body.style.overflowY="hidden";
	document.body.style.position="relative";
}
function modalc4(){
	document.getElementById('modal4').style.opacity="0";
	document.getElementById('modal4').style.visibility="hidden";
}
function modal5(){
	document.getElementById('modal5').style.opacity="1";
	document.getElementById('modal5').style.visibility="visible";
	document.body.style.overflowY="hidden";
	document.body.style.position="relative";
}
function modalc5(){
	document.getElementById('modal5').style.opacity="0";
	document.getElementById('modal5').style.visibility="hidden";
}
function modal6(){
	document.getElementById('modal6').style.opacity="1";
	document.getElementById('modal6').style.visibility="visible";
	document.body.style.overflowY="hidden";
	document.body.style.position="relative";
}
function modalc6(){
	document.getElementById('modal6').style.opacity="0";
	document.getElementById('modal6').style.visibility="hidden";
}
function modal7(){
	document.getElementById('modal7').style.opacity="1";
	document.getElementById('modal7').style.visibility="visible";
	document.body.style.overflowY="hidden";
	document.body.style.position="relative";
}
function modalc7(){
	document.getElementById('modal7').style.opacity="0";
	document.getElementById('modal7').style.visibility="hidden";
}
function modal8(){
	document.getElementById('modal8').style.opacity="1";
	document.getElementById('modal8').style.visibility="visible";
	document.body.style.overflowY="hidden";
	document.body.style.position="relative";
}
function modalc8(){
	document.getElementById('modal8').style.opacity="0";
	document.getElementById('modal8').style.visibility="hidden";
}