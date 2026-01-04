package org.estudos.paradigmas.poo;

/**
 * ABSTRAÇÃO:
 * Definimos um modelo genérico "Pagamento" que representa o conceito,
 * escondendo a complexidade e forçando um contrato (método realizarPagamento).
 * A classe é abstrata pois não faz sentido instanciar um "Pagamento" genérico.
 */
public abstract class Pagamento {
    
    // ENCAPSULAMENTO:
    // Atributo protegido (ou privado) impede acesso direto descontrolado de fora.
    // O valor só é acessível ou modificável pelos métodos definidos (getters/setters ou construtor).
    private double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    // Método abstrato obriga as subclasses a implementarem sua própria lógica
    public abstract void realizarPagamento();
}
