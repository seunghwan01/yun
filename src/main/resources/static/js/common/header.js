function openPop(){
	document.getElementById('userList').classList.toggle('active');
	document.getElementById('list').classList.toggle('active');
	document.body.classList.toggle('active');
	document.getElementById('line1').classList.toggle('active');
	document.getElementById('line2').classList.toggle('active');
	document.getElementById('line3').classList.toggle('active');
}
function openUserTap(){
	document.getElementById('userTap').classList.toggle('active');
}
function openChat(){
	document.getElementById('bot-contatner').classList.toggle('active');
	document.getElementById('chat-robot').classList.toggle('active');
}
function closeChat(){
	document.getElementById('bot-contatner').classList.toggle('active');
	document.getElementById('chat-robot').classList.toggle('active');
}