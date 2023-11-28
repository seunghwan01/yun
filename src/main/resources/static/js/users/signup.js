//function selectAll(selectAll)  {
//  const checkboxes 
//       = document.getElementsByName('a-check1');
//  
//  checkboxes.forEach((checkbox) => {
//    checkbox.checked = selectAll.checked;
//  })
//}

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

    const checkboxes = document.getElementsByName("a-check2")
    
    checkboxes.forEach((checkbox) => {
      checkbox.checked = selectAll2.checked;
    })

}

function allChecked2() {

    const allCheck = document.querySelector('input[name="all2"]');
    const checkboxes = document.querySelectorAll('input[name="a-check2"]');
    const checkboxesChecked = document.querySelectorAll('input[name="a-check2"]:checked');
    
    if (checkboxes.length === checkboxesChecked.length) {
        allCheck.checked = true;
    } else {
        allCheck.checked = false;
    }

}
		