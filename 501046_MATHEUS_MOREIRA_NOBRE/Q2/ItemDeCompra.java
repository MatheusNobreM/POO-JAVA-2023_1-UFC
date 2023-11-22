

public class ItemDeCompra {
    // Atributos pedidos:
    private String nome;
    private Double produtoUnitario;
    private Integer quantidadeProduto;

    //Constrututor pedido, com a execeção genérica:
    public ItemDeCompra(String nome, Double produtoUnitario, Integer quantidadeProduto) {
        this.nome = nome;
        if(produtoUnitario > 0.0 ){
            this.produtoUnitario = produtoUnitario;
        }else{
            System.out.println("O seu produto esta invalido pois e menor ou igual a 0,0");
            return;
        }
        if(quantidadeProduto > 0 ){
            this.quantidadeProduto = quantidadeProduto;
        }else{
            System.out.println("O seu produto esta invalido pois e menor ou igual a 0,0");
            return;
        }
    }

    // Método para retornar o nome do Produto:
    public String nomeDoProduto() {
        return nome;
    }

    // Método para retornar o valor total:
    public Double valorTotal(){
        double total = this.produtoUnitario *this.quantidadeProduto;
        return total;
    }
}