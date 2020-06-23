function client() {
    var cliente = new Object()

    cliente.nome = document.getElementById('nome').value
    cliente.endereco = document.getElementById('endereco').value
    cliente.rg = document.getElementById('rg').value
    cliente.idade = Number(document.getElementById('idade').value)
    cliente.nota = Number(document.getElementById('nota').value)

    // consome a API

    var request = new XMLHttpRequest()
    request.open('POST', 'https://localhost:8080/api/cliente', true)
    request.onload = function() {
        if(request.status >= 200 && request.status <= 400){
            alert('Conectou com sucesso')
        } else{
            console.log('Problema na conexão com a API')
        }
    }

    request.setRequestHeader('Content-type', 'application/json')
    request.send(JSON.stringify(cliente))
    alert('Clliente inserido com sucesso')
}


function product() {
    var product = new Object()

    product.nome = document.getElementById('nome').value
    product.preco = Number(document.getElementById('preco').value)
    product.qtd = Number(document.getElementById('qtd').value)
    product.descricao = document.getElementById('descricao').value

    // consome a API

    var request = new XMLHttpRequest()
    request.open('POST', 'https://localhost:8080/api/product', true)
    request.onload = function() {
        if(request.status >= 200 && request.status <= 400){
            alert('Conectou com sucesso')
        } else{
            console.log('Problema na conexão com a API')
        }
    }

    request.setRequestHeader('Content-type', 'application/json')
    request.send(JSON.stringify(product))
    alert('Produto inserido com sucesso')
}