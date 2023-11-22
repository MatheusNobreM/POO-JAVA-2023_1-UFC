
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<ItemDeCompra> listaDeCompras = new ArrayList<>();

        // Inicializando uma lista de ItemDeCompra:
        ItemDeCompra item1 = new ItemDeCompra("Camiseta", 50.0, 2);
        ItemDeCompra item2 = new ItemDeCompra("uva", 0.50, 50);
        ItemDeCompra item3 = new ItemDeCompra("pao", 1.0,10);
        ItemDeCompra item4 = new ItemDeCompra("cafe", 7.00,53);

        // Adicionando a lista
        listaDeCompras.add(item1);
        listaDeCompras.add(item2);
        listaDeCompras.add(item3);
        listaDeCompras.add(item4);

        // Percorrendo a lista e imprimindo nome e valor total de cada item:
        for (ItemDeCompra item : listaDeCompras) {
            System.out.println("Nome do Produto: " + item.nomeDoProduto());
            System.out.println("Valor Total: " + item.valorTotal());
            System.out.println("=====================================");
        }

        /*
        Demonstração para o tratamento de exceção quando dados inválidos são utilizados,
        tendando criar um item com valor unitário ou quantidade menor que 0,0: */
        ItemDeCompra itemInvalido1 = new ItemDeCompra("Mouse", -1.0, 10);
        ItemDeCompra itemInvalido2 = new ItemDeCompra("Garrafa", 50.0, 0);
        // A mensagem de exceção será exibida no construtor do ItemDeCompra

    }
}
