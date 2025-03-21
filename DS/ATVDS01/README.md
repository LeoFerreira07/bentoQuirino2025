Classe produto:

atributos:
        1- ID
        2- valor
        3- nome
        4 descriçao
        5 quantidade estoque

cosntrutores
        1- Construtor total, com todos os atributos  
        2- Construtor parcial, com ID e Valor
        3- Construtoe parcial, com ID, Valor e Nome

Metodos funcionalidades 
        Não criei nenhuma
  
Funçao Main:


Declarei uma Array para os produtos, uma variavel leitora e uma variavel boleana para o do-while q o codigo vai rodar,
iniciei o laço de repetiçao (do-while) e printei na tela o menu pricipal, com os topicos que foram selecionados pelo professor,
depois crie um switch-case para o menu, segue abaixo oq cada switch-case:

        1-Case (criar um produto):
          
                No primeiro case eu fiz um menu para o usuario escolher qual metodo construtor ele quer usar, 
                e fiz um for-loop, para prencher a array dos produtos com o novo produto, caso nao tenha mais 
                espaço ele ira exibir uma mensagem 

        2-Case (alterar um produto):

                O usuario seleciona o ID do produto que deseja alterar, depois um for-loop passa pela array e verifica
                se o ID existe, se existir o obejto  passa por 3 if  que verificam quais atributos o ele tem, se ele tiver 
                esse atributo o usuario consegue alterar se nao, nao consegue.
                
        3-Case (excluir um produtoo):
                
                O usuario seleciona o ID do produto que deseja alterar, depois um for-loop passa pela array e verifica
                se o id digitado existe e nao é null , se exitir e nao for null ele apaga o objeto.

        4- Case (Mostrar produtos):
        
                Inicia um for-loop que verifica se a posiçao da array nao é null, se nao estiver vazio ele verifica quais atributos 
                o objeto tem o mostra.  
                
        5-Case (sair do programa) 
        
                 Um simples break

