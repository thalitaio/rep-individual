/*
_  Crie uma função que capture as informações do formulário e salve em localstorage. O dado deve ser um dicionário dentro de uma lista e convertido para JSON.
_  Crie uma função para ler os dados do localStorage e carregar dentro de uma tabela no HTML. Converta o dado de JSON para uma lista de dicionários.

*/

window.onload = function(){
    let viagem = []
    localStorage.setItem("viagem", JSON.stringify(viagem));
}

function salvar(event) {
    event.preventDefault();
    let id = document.getElementById('id');
    let destino = document.getElementById('destino');
    let dataInicio = document.getElementById('data-inicio');
    let dataFim = document.getElementById('data-retorno');

    viagem = { "id": id.value, "destino": destino.value, "data-inicio": dataInicio.value, "data-retorno": dataFim.value};
    let viagens = JSON.parse(localStorage.getItem("viagem"));
    viagens.push(viagem);
    localStorage.setItem("viagem", JSON.stringify(viagens));
}

