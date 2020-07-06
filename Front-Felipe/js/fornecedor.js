function cadastrar() {
    // obtendo os dados do usuário
    var fornecedor = new Object()
    fornecedor.razao = document.getElementById("razao").value
    fornecedor.fantasia = document.getElementById("fantasia").value
    fornecedor.cnpj = document.getElementById("cnpj").value
    fornecedor.telefone = document.getElementById("telefone").value
    fornecedor.endereco = document.getElementById("endereco").value
    fornecedor.email = document.getElementById("email").value
   

    fornecedor.id = document.getElementById('id').value
    // consome a API
    var request = new XMLHttpRequest()
        // abre a conexão
    request.open('POST', 'http://localhost:8080/api/fornecedor', true)
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
    request.send(JSON.stringify(fornecedor))
    alert('inserido com sucesso')
}


function consultar() {
    var req = new XMLHttpRequest()

    req.open('GET', 'http://localhost:8080/api/fornecedor', true)

    req.onload = function() {
        var fornecedores = JSON.parse(this.response)
        
        var tabela = document.getElementById('tabela')
        fornecedores.forEach(fornecedor => {
            var linha = document.createElement('tr')
            tabela.appendChild(linha)
            var col1 = document.createElement('td')   
            var col2 = document.createElement('td')   
            var col3 = document.createElement('td')   
            var col4 = document.createElement('td')   
            var col5 = document.createElement('td')   
            var col6 = document.createElement('td')   
            var col7 = document.createElement('td')   
            var col8 = document.createElement('td')   
            var col9 = document.createElement('td')   
            
            col1.textContent = fornecedor.id
            col2.textContent = fornecedor.razao
            col3.textContent = fornecedor.fantasia
            col4.textContent = fornecedor.cnpj
            col5.textContent = fornecedor.telefone
            col6.textContent = fornecedor.endereco
            col7.textContent = fornecedor.email
            
            var imageRemove = document.createElement('img')
            imageRemove.setAttribute('src', 'img/remover.png')
            imageRemove.setAttribute('onclick', `remover(${fornecedor.id})`)
            
            var imageAtualiza = document.createElement('img')
            imageAtualiza.setAttribute('src', 'img/alterar.png')
            imageAtualiza.setAttribute('onclick', `atualizar(${JSON.stringify(fornecedor)})`)

            linha.appendChild(col1)
            linha.appendChild(col2)
            linha.appendChild(col3)
            linha.appendChild(col4)
            linha.appendChild(col5)
            linha.appendChild(col6)
            linha.appendChild(col7)
            col8.appendChild(imageRemove)
            col9.appendChild(imageAtualiza)
            linha.appendChild(col8)
            linha.appendChild(col9)
        })
    }
    req.send()
}
 function remover(id) {
     var req = new XMLHttpRequest()

     req.open('DELETE', 'http://localhost:8080/api/fornecedor/'+id, true)

     req.onload = function() {
         if((req.status >= 200) && (req.status < 400)){
             console.log('Conenctou com sucesso')
         }else{
             console.log('Falha na conexão')
         }
     }
     req.send()
     alert('fantasia removido com sucesso')
     location.reload()
 }

 function atualizar(fornecedor) {
     console.log(fornecedor)
    
    document.getElementById("razao").value = fornecedor.razao
    document.getElementById("fantasia").value = fornecedor.fantasia
    document.getElementById("cnpj").value = fornecedor.cnpj
    document.getElementById("telefone").value = fornecedor.telefone
    document.getElementById("endereco").value = fornecedor.endereco
    document.getElementById("email").value = fornecedor.email
    document.getElementById("id").value = fornecedor.id

 
 }