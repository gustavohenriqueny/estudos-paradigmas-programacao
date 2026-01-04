package org.estudos.paradigmas.poo;

/**
 * HERANÇA:
 * PagamentoBoleto também "é um" Pagamento.
 */
public class PagamentoBoleto extends Pagamento {

    public PagamentoBoleto(double valor) {
        super(valor);
    }

    // POLIMORFISMO:
    // Implementação específica para Boleto.
    @Override
    public void realizarPagamento() {
        System.out.println("Gerando boleto no valor de R$ " + getValor() + "...");
    }
}
