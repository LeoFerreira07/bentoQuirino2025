package DS.ATVDS01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean sair = false;
        Produto[] produtos = new Produto[10];
        
        do {
            System.out.println("--------------------- ");
            System.out.println("1-CRIAR PRODUTO ");
            System.out.println("2-ALTERAR PRODUTO");
            System.out.println("3-REMOVER PRODUTO");
            System.out.println("4-LISTAR TODOS OS PRODUTOS");
            System.out.println("5-SAIR");
            System.out.println("--------------------- ");
            System.out.println("Escolha uma opção: ");
            
            int escolha = leitor.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("1-Criar um produto: \n" +
                            "---------------------\n" +
                            "1 - Criar um produto completo \n" +
                            "2 - Criar um produto com nome e valor \n" +
                            "3 - Criar um produto com nome, valor e ID \n");

                    int subEscolha = leitor.nextInt();
            
                    int id = 0, estoque = 0;
                    String nome = "", descricao = "";
                    float valor = 0;
                    
                    System.out.println("Digite o ID do produto: ");
                    id = leitor.nextInt();
                    leitor.nextLine();
                    System.out.println("Digite o valor do produto: ");
                    valor = leitor.nextFloat();
                    leitor.nextLine();
                    
                    Produto novoProduto = null;
                    
                    switch (subEscolha) {
                        case 1:
                            System.out.println("Digite a descrição do produto: ");
                            descricao = leitor.nextLine();
                            System.out.println("Digite a quantidade em estoque: ");
                            estoque = leitor.nextInt();
                            System.out.println("Digite o nome do produto: ");
                            nome = leitor.nextLine();
                            novoProduto = new Produto(id, nome, valor, descricao, estoque);
                            break;
                        case 2:
                            novoProduto = new Produto(id, valor);
                            break;
                        case 3:
                            novoProduto = new Produto(id, nome, valor);
                            System.out.println("Digite o nome do produto: ");
                            nome = leitor.nextLine();
                            break;  
                        default:
                            System.out.println("Opção inválida!");
                            return;
                    }
                    boolean isProductAdded = false;
                    for (int i = 0; i < produtos.length; i++) {
                        if (produtos[i] == null) {
                            produtos[i] = novoProduto;
                            isProductAdded = true;
                            break;
                        }
                    }
                    
                    if (isProductAdded) {
                        System.out.println("Produto cadastrado com sucesso!");
                    } else {
                        System.out.println("Erro: Não há espaço para novos produtos.");
                    }
                    break;
                
                case 2:
                    System.out.println("Digite o ID do produto que deseja alterar: ");
                    id = leitor.nextInt();
                    for (int i = 0; i < produtos.length; i++) {
                        if (produtos[i] != null && produtos[i].getId() == id) {
                            System.out.println("-----ALTERAR PRODUTO-----");
                            System.out.println("Id atual: " + produtos[i].getId());
                            System.out.println("Digite o novo ID do produto (ou pressione Enter para manter): ");
                            String novoId = leitor.nextLine();
                            if (!novoId.isEmpty()) {
                                produtos[i].setId(Integer.parseInt(novoId));
                            }
                            System.out.println("Valor atual: " + produtos[i].getValor());
                            System.out.println("Digite o novo valor do produto (ou -1 para manter): ");
                            valor = leitor.nextFloat();
                            if (valor != -1) {
                                produtos[i].setValor(valor);
                            }
                            if (produtos[i].getNome() != null) {
                                System.out.println("Nome atual: " + produtos[i].getNome());
                                System.out.println("Digite o novo nome (ou pressione Enter para manter): ");
                                String novoNome = leitor.nextLine();
                                if (!novoNome.isEmpty()) {
                                    produtos[i].setNome(novoNome);
                                }
                            }
                            if (produtos[i].getDescricao() != null) {
                                System.out.println("Descrição atual: " + produtos[i].getDescricao());
                                System.out.println("Digite a nova descrição (ou pressione Enter para manter): ");
                                String novaDescricao = leitor.nextLine();
                                if (!novaDescricao.isEmpty()) {
                                    produtos[i].setDescricao(novaDescricao);
                                }
                            }
                            if (produtos[i].getQuantidadeEstoque() != 0l) {
                                System.out.println("Quantidade em estoque atual: " + produtos[i].getQuantidadeEstoque());
                                System.out.println("Digite a nova quantidade em estoque (ou -1 para manter): ");
                                int novaQuantidade = leitor.nextInt();
                                if (novaQuantidade != -1) {
                                    produtos[i].setQuantidadeEstoque(novaQuantidade);
                                }
                            }
                        }
                    }
                    break;
                
                case 3:
                    System.out.println("Digite o ID do produto que deseja remover: ");
                    id = leitor.nextInt();
                    for (int i = 0; i < produtos.length; i++) {
                        if (produtos[i] != null && produtos[i].getId() == id) {
                            produtos[i] = null;
                            System.out.println("Produto removido com sucesso.");
                            break;
                        }
                    }
                    break;
                
                case 4:
                for (int i = 0; i < produtos.length; i++) {
                    if (produtos[i] != null) {
                        System.out.println("-----PRODUTO-----");
                        System.out.print("ID:");
                        System.out.println(produtos[i].getId());
                        if (produtos[i].getNome() != null) {
                            System.out.print("NOME:");
                            System.out.println(produtos[i].getNome());
                        }
                        if (produtos[i].getDescricao() != null) {
                            System.out.print("DESCRIÇÃO:");
                            System.out.println(produtos[i].getDescricao());
                        }
                        System.out.print("VALOR:");
                        System.out.println(produtos[i].getValor());

                        if (produtos[i].getQuantidadeEstoque() != 0) {
                            System.out.print("QUANTIDADE:");
                            System.out.println(produtos[i].getQuantidadeEstoque());
                            System.out.println("\n\n");
                        }
                    } 
                } break; 
                case 5:
                    sair = true;
                    break;
                
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (!sair);
        
        leitor.close();
    }
}