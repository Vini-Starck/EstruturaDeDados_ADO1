package estrutura_ado1;


public class TestaLista {
    public static void main(String args []){
        Metodos metodo = new Metodos();
        
        Produto p1 = new Produto("Carne", "Alimentos", 200, 123, 1);
        Produto p2 = new Produto("Água", "Alimentos", 4, 111, 2);
        Produto p3 = new Produto("Copo", "Utensilio", 8, 3412, 4);
        
        metodo.inserirElementoInicio(p1);
        metodo.inserirElementoInicio(p2);
        metodo.inserirElementoInicio(p3);
        System.out.println("Sem desconto:");
        metodo.exibir(metodo.getAtual());
        System.out.println("Com desconto:");
        metodo.desconto(0.1f, "Alimentos");
        metodo.exibir(metodo.getAtual());
        
    }
    
    
    
}
