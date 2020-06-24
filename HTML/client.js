function client() {
    // obtendo os dados do usuário
    var cliente = new Object()
    cliente.nome = document.getElementById("nome").value
    cliente.endereco = document.getElementById("endereco").value
    cliente.rg = document.getElementById("rg").value
    cliente.idade = Number(document.getElementById("idade").value)
    cliente.nota = Number(document.getElementById("nota").value)

    // consome a API
    var request = new XMLHttpRequest()
        // abre a conexão
    request.open('POST', 'http://localhost:8080/api/cliente', true)
        // carrega da conexão
    request.onload = function() {
            if ((request.status >= 200) && (request.status < 400)) {
                console.log('Conectou com sucesso na API')
            } else {
                console.log('Problema na conexão com a API')
            }
        }
        // configura a conexão - header
    request.setRequestHeader('Content-Type', 'application/json')
        // envia os dados para inserção - transforma em JSON
    request.send(JSON.stringify(cliente))
    alert('Cliente inserido com sucesso')
}


function consultar() {
    var req = new XMLHttpRequest()

    req.open('GET', 'http://localhost:8080/api/cliente', true)

    req.onload = function() {
        var clientes = JSON.parse(this.response)
        
        var tabela = document.getElementById('tabela')
        clientes.forEach(cliente => {
            var linha = document.createElement('tr')
            tabela.appendChild(linha)
            var col1 = document.createElement('td')   
            var col2 = document.createElement('td')   
            var col3 = document.createElement('td')   
            var col4 = document.createElement('td')   
            var col5 = document.createElement('td')
            
            col1.textContent = cliente.nome
            col2.textContent = cliente.endereco
            col3.textContent = cliente.rg
            col4.textContent = cliente.idade
            col5.textContent = cliente.nota

            linha.appendChild(col1)
            linha.appendChild(col2)
            linha.appendChild(col3)
            linha.appendChild(col4)
            linha.appendChild(col5)
        })
    }
    req.send()
}