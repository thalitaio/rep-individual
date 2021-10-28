window.onload = function(){
    let viagem = []
    localStorage.setItem("viagem", JSON.stringify(viagem));
    leitorStorage();
}

function leitorStorage(event) {
    event.preventDefault();
    let tbody = document.getElementById("tabela");
    let viagens = JSON.parse(localStorage.getItem("viagem"))
    tbody.innerHTML = "";
    viagens.forEach(agendada => {
        tbody.innerHTML += "<tr>" + "<td>" + agendada["id"] +"</td>" + "<td>" + agendada["destino"] +"</td>" + "<td>" + agendada["data-inicio"] +"</td>" + "<td>" + agendada["data-retorno"] +"</td>";
    });
}
