function cadastrar() {
    var cliente = new Object()

    cliente.nome = document.getElementById('nome').value
    cliente.endereco = document.getElementById('endereco').value
    cliente.rg = document.getElementById('rg').value
    cliente.idade = document.getElementById('idade').value
    cliente.nota = document.getElementById('nota').value

    // consome a API

    var request = new XMLHttpRequest()
    request.open('POST', 'https://localhost:8080/api/cliente', true)
    request.onload = function() {
        if(request.status >= 200 && request.status <= 400){
            console.log('Conectou com sucesso')
        } else{
            console.log('Problema na conexão com a API')
        }
    }

    request.setRequestHeader('Content-type', 'application/json')
    request.send(JSON.stringify(cliente))
    alert('Clliente inserido com sucesso')
}