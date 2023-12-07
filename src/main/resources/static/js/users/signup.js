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

document.addEventListener("DOMContentLoaded", function () {
	
	var form = document.querySelector("form");

	form.addEventListener("submit", function (event) {
		var email = document.querySelector(".email").value;
		var password = document.querySelector(".password").value;
		var passworda = document.querySelector(".password-a").value;
		var name = document.querySelector(".name").value;
		var phone = document.querySelector(".phone").value;
		var reg_email = /^([0-9a-zA-Z_\.-]+)@([0-9a-zA-Z_-]+)(\.[0-9a-zA-Z_-]+){1,2}$/;

		var errorMessage = "";

		if(!reg_email.test){
			errorMessage += "이메일 형식이 잘못되었습니다.\n";
		}
		
		if (!email.trim()) {
			errorMessage += "이메일을 작성하지 않았습니다.\n";
		}

		if (!password.trim()) {
			errorMessage += "비밀번호를 작성하지 않았습니다.\n";
		}

		if (password.trim()!=passworda.trim()){
			errorMessage += "비밀번호가 맞지 않습니다.\n"
		}

		if (!name.trim()) {
			errorMessage += "이름을 작성하지 않았습니다.\n";
}

		if (!phone.trim()) {
			errorMessage += "전화번호를 작성하지 않았습니다.\n";
		}
		if (!email.trim() || !password.trim() || !name.trim() || !phone.trim()) {
			errorMessage = "모든 요소를 작성해주세요.\n";
		}

		if (errorMessage) {
			alert(errorMessage);
			event.preventDefault();
		}
	});
});