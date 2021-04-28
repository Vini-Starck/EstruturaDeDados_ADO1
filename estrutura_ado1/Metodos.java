package estrutura_ado1;

import java.util.Scanner;

public class Metodos {
    Scanner leitor = new Scanner(System.in);

    private Elemento atual = null;
    
    private int quantidadeElementos = 0;


    public Elemento getAtual() {
        return atual;
    }

    public void inserirElementoInicio(Object objeto) {
        Elemento novoElemento = new Elemento(atual, objeto);
        this.atual = novoElemento;
        quantidadeElementos++;
    }

    public void exibir(Elemento elemento) {
        float total = 0;
        System.out.print("=== Cupom Fiscal ===");
        System.out.print("{");
        Produto produto;
        for(int i = 0; i<quantidadeElementos; i++){
            System.out.print(elemento+" ");
            produto = (Produto)elemento.getObject();
            total += produto.getPreco()*produto.getQuantidade();
            elemento = elemento.getAnt();
            System.out.print("}");
            System.out.println("\nTOTAL = "+total);
        }
    }
    
    public void desconto(float desconto, String categoria){
        Elemento elemento = this.atual;
        Produto produto;
        while(elemento != null){
            produto = (Produto)elemento.getObject(); // Casting
            if(produto.getCategoria().equals(categoria)){
                produto.setPreco(produto.getPreco()*(1-desconto));
                
            }
            elemento = elemento.getAnt(); // vá para o elemento anterior
        }
    }
}
