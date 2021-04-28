
package estrutura_ado1;

/*Considere uma lista simplesmente encadeada.
Elabore um sistema para armazenar uma lista de compras. Cada elemento da lista terá os atributos: nomeProduto (String), 
codigo (int), preço (float), categoria (String), quantidade(int).
Escreva um método que realize o desconto de todos os produtos de uma determinada categoria. O usuário do sistema deve entrar 
com a categoria e o valor do desconto (Por exemplo: 10% - 0.1).
Escreva um método para gerar um cupom fiscal da compra. Detalhando os produtos comprados e o total da compra.
Escreva um método para remover, por codigo, um determinado produto da lista.*/


public class Produto {
    private String nome, categoria;
    private float preco;
    private int codigo, quantidade;

    public Produto() {
    }
    
    
    public Produto(String nome, String categoria, float preco, 
            int codigo, int quantidade) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.codigo = codigo;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", categoria=" + categoria 
                + ", preco=" + preco + ", codigo=" 
                + codigo + ", quantidade=" + quantidade + "}\n";
    }

    
    
    
    
}
