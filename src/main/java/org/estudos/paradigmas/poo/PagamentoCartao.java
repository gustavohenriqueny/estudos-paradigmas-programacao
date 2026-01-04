package org.estudos.paradigmas.poo;

/**
 * HERANÇA:
 * PagamentoCartao "é um" Pagamento. Herda atributos (valor) e comportamentos.
 */
public class PagamentoCartao extends Pagamento {

    public PagamentoCartao(double valor) {
        super(valor);
    }

    // POLIMORFISMO:
    // Sobrescrita (Override) do método realizarPagamento.
    // A mesma chamada de método se comporta de maneira diferente dependendo do objeto.
    @Override
    public void realizarPagamento() {
        System.out.println("Processando pagamento de R$ " + getValor() + " no Cartão de Crédito...");
    }
}
