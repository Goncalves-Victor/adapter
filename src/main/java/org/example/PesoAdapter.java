package org.example;

// Adapter: oferece quilogramas usando uma balança que trabalha em libras.
public class PesoAdapter implements IPeso {
    private final BalancaLibras balanca;

    public PesoAdapter(BalancaLibras balanca) {
        this.balanca = balanca;
    }

    @Override
    public double getQuilogramas() {
        return balanca.getLibras() * 0.45359237;
    }

    @Override
    public void setQuilogramas(double quilogramas) {
        balanca.setLibras(quilogramas / 0.45359237);
    }
}
