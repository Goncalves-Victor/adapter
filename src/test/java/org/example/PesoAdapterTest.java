package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PesoAdapterTest {
    @Test
    void deveConverterQuilogramasParaLibras() {
        BalancaLibras balanca = new BalancaLibras();
        IPeso peso = new PesoAdapter(balanca);

        peso.setQuilogramas(1.0);

        assertEquals(2.20462262, balanca.getLibras(), 0.00000001);
    }

    @Test
    void deveConverterLibrasParaQuilogramas() {
        BalancaLibras balanca = new BalancaLibras();
        IPeso peso = new PesoAdapter(balanca);
        balanca.setLibras(10.0);

        assertEquals(4.5359237, peso.getQuilogramas(), 0.00000001);
    }

    @Test
    void deveConverterPesoZeroNosDoisSentidos() {
        BalancaLibras balanca = new BalancaLibras();
        IPeso peso = new PesoAdapter(balanca);
        balanca.setLibras(10.0);
        peso.setQuilogramas(0.0);

        assertEquals(0.0, balanca.getLibras(), 0.00000001);
        assertEquals(0.0, peso.getQuilogramas(), 0.00000001);
    }
}
