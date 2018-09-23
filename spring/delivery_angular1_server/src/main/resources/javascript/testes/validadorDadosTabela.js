
function validadorPesoAltura(paciente, formulario){
	var arrayErros = [];
	if(paciente.peso >= 300 || paciente.peso <= 0){
		formulario.querySelector("#label-peso").classList.add("paciente-invalido");
		arrayErros.push("Erro de Peso");
	}

	if(paciente.altura >= 3 || paciente.altura <= 0){
	    formulario.querySelector("#label-altura").classList.add("paciente-invalido");
	    arrayErros.push("Erro de altura");
	}
	
	if(paciente.nome == ""){
	    formulario.querySelector("#label-nome").classList.add("paciente-invalido");
	    arrayErros.push("Erro de nome");
	}
	return arrayErros;
}

function erros(listaErros, ulErros){
	ulErros.innerHTML = "";
	listaErros.forEach(function(erro) {
		var li = criadorElementos("li", "erros", erro);
		ulErros.appendChild(li);
	})
}
