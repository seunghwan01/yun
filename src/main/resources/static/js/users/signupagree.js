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
	document.getElementById('modal').style.opacity="1";
	document.getElementById('modal').style.visibility="visible";
	document.body.style.overflowY="hidden";
	document.body.style.position="relative";
}
function modalc(){
	document.getElementById('modal').style.opacity="0";
	document.getElementById('modal').style.visibility="hidden";
}