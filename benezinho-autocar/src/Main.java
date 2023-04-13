import br.com.benezinho.model.Categoria;
import br.com.benezinho.model.Produto;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Apenas declarando que vou precisar destas variáveis
        Categoria categoria;
        Produto produto;
        double total = 0;
        int encerrar = 0;

        do {

            var nomeCategoria = JOptionPane.showInputDialog("Categoria");
            categoria = new Categoria(nomeCategoria);

            var nomeDoProduto = JOptionPane.showInputDialog("Produto");

            var preco = Double.parseDouble(JOptionPane.showInputDialog("Preço (apenas números)"));

            produto = new Produto(nomeDoProduto, preco, categoria);

            total += produto.getPreco();

            var pergunta = """
                                        
                    Deseja cadastrar  mais um produto?
                                        
                    [ 1 ] SIM
                    [ 0 ] ENCERRAR - Mostrar o valor total
                                        
                    """;
            encerrar = Integer.parseInt(JOptionPane.showInputDialog(pergunta));

        } while (encerrar > 0);

        JOptionPane.showMessageDialog(null, "TOTAL: " + total);
    }
}


