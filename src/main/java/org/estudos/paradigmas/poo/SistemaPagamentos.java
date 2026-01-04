package org.estudos.paradigmas.poo;

import java.util.ArrayList;
import java.util.List;

public class SistemaPagamentos {

    public static void main(String[] args) {
        System.out.println("--- Orientação a Objetos ---");

        // POLIMORFISMO:
        // A lista é do tipo genérico "Pagamento", mas armazena instâncias específicas (Cartão, Boleto).
        List<Pagamento> pagamentos = new ArrayList<>();
        
        pagamentos.add(new PagamentoCartao(150.00));
        pagamentos.add(new PagamentoBoleto(200.50));
        pagamentos.add(new PagamentoCartao(50.00));

        // Processamos todos da mesma forma, mas cada um reage conforme sua implementação concreta.
        for (Pagamento p : pagamentos) {
            p.realizarPagamento(); 
        }
    }
}
