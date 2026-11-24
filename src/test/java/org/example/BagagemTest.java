package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagagemTest {
    @Test
    void deveRetornarPesoDaBagagemEmQuilogramas() {
        Bagagem bagagem = new Bagagem();
        bagagem.setPeso(20.0);

        assertEquals(20.0, bagagem.getPeso(), 0.00000001);
    }

    @Test
    void deveGuardarPesoDaBalancaEmLibras() {
        Bagagem bagagem = new Bagagem();
        bagagem.setPeso(20.0);

        assertEquals(44.09245244, bagagem.getPesoBalanca(), 0.00000001);
    }

    @Test
    void deveAceitarPesoAteOLimiteDoExercicio() {
        Bagagem bagagem = new Bagagem();
        bagagem.setPeso(22.99);
        assertFalse(bagagem.isExcessoPeso());

        bagagem.setPeso(23.0);
        assertFalse(bagagem.isExcessoPeso());
    }

    @Test
    void deveIdentificarPesoAcimaDoLimiteDoExercicio() {
        Bagagem bagagem = new Bagagem();
        bagagem.setPeso(23.01);

        assertTrue(bagagem.isExcessoPeso());
    }
}
