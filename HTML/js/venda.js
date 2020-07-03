function venda() {
    // obtendo os dados do usuário
    var venda = new Object()
    venda.numVenda = document.getElementById("numVenda").value
    venda.cliente = document.getElementById("cliente").value
    venda.produto = document.getElementById("produto").value
   

    venda.id = document.getElementById('id').value
    // consome a API
    var request = new XMLHttpRequest()
        // abre a conexão
    request.open('POST', 'http://localhost:8080/api/venda', true)
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
    request.send(JSON.stringify(venda))
    alert('Cliente inserido com sucesso')
}


function consultar() {
    var req = new XMLHttpRequest()

    req.open('GET', 'http://localhost:8080/api/venda', true)

    req.onload = function() {
        var clientes = JSON.parse(this.response)
        
        var tabela = document.getElementById('tabela')
        clientes.forEach(venda => {
            var linha = document.createElement('tr')
            tabela.appendChild(linha)
            var col1 = document.createElement('td')   
            var col2 = document.createElement('td')   
            var col3 = document.createElement('td')   
            var col4 = document.createElement('td')   
            var col5 = document.createElement('td')   
            var col6 = document.createElement('td')   
            
            col1.textContent = venda.id
            col2.textContent = venda.numVenda
            col3.textContent = venda.cliente
            col4.textContent = venda.produto
            
            var imageRemove = document.createElement('img')
            imageRemove.setAttribute('src', 'img/remover.png')
            imageRemove.setAttribute('onclick', `remover(${venda.id})`)
            
            var imageAtualiza = document.createElement('img')
            imageAtualiza.setAttribute('src', 'img/alterar.png')
            imageAtualiza.setAttribute('onclick', `atualizar(${JSON.stringify(venda)})`)

            linha.appendChild(col1)
            linha.appendChild(col2)
            linha.appendChild(col3)
            linha.appendChild(col4)
            linha.appendChild(col5)
            linha.appendChild(col6)
            col5.appendChild(imageRemove)
            col6.appendChild(imageAtualiza)
        })
    }
    req.send()
}
 function remover(id) {
     var req = new XMLHttpRequest()

     req.open('DELETE', 'http://localhost:8080/api/venda/'+id, true)

     req.onload = function() {
         if((req.status >= 200) && (req.status < 400)){
             console.log('Conenctou com sucesso')
         }else{
             console.log('Falha na conexão')
         }
     }
     req.send()
     alert('Cliente removido com sucesso')
     location.reload()
 }

 function atualizar(venda) {
     console.log(venda)
    
    document.getElementById("numVenda").value = venda.numVenda
    document.getElementById("cliente").value = venda.cliente
    document.getElementById("produto").value = venda.produto
    document.getElementById("id").value = venda.id

 
 }