function botaoDeletar(event){
	event.preventDefault();
	var classDelete = this.querySelector(".delete").className;
	if(event.target.className == classDelete){
		event.target.parentNode.classList.add("apagarDevagar");
		setTimeout(function() {
			event.target.parentNode.remove();
		}, 800)
	}
}
