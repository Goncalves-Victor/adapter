package org.example;

public class Bagagem {
    private final BalancaLibras balanca;
    private final IPeso peso;

    public Bagagem() {
        balanca = new BalancaLibras();
        peso = new PesoAdapter(balanca);
    }

    public void setPeso(double quilogramas) {
        peso.setQuilogramas(quilogramas);
    }

    public double getPeso() {
        return peso.getQuilogramas();
    }

    public double getPesoBalanca() {
        return balanca.getLibras();
    }

    public boolean isExcessoPeso() {
        // Limite de 23 kg definido apenas para este exercício.
        return peso.getQuilogramas() > 23.0;
    }
}
