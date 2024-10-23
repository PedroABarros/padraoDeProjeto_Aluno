package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    Pedido pedido;

    @BeforeEach
    public void setUp() {
        pedido = new Pedido();
    }

    // Pedido novo

    @Test
    public void deveAprovarPedidoNovo() {
        pedido.setEstado(PedidoEstadoNovo.getInstance());
        assertTrue(pedido.aprovar());
        assertEquals(PedidoEstadoAprovado.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveCancelarPedidoNovo() {
        pedido.setEstado(PedidoEstadoNovo.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    public void naoDeveRejeitarPedidoNovo() {
        pedido.setEstado(PedidoEstadoNovo.getInstance());
        assertFalse(pedido.rejeitar());
    }

    @Test
    public void naoDeveDespacharPedidoNovo() {
        pedido.setEstado(PedidoEstadoNovo.getInstance());
        assertFalse(pedido.despachar());
    }

    @Test
    public void naoDeveEntregarPedidoNovo() {
        pedido.setEstado(PedidoEstadoNovo.getInstance());
        assertFalse(pedido.entregar());
    }

    // Pedido aprovado

    @Test
    public void naoDeveAprovarPedidoAprovado() {
        pedido.setEstado(PedidoEstadoAprovado.getInstance());
        assertFalse(pedido.aprovar());
    }

    @Test
    public void deveCancelarPedidoAprovado() {
        pedido.setEstado(PedidoEstadoAprovado.getInstance());
        assertTrue(pedido.cancelar());
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveRejeitarPedidoAprovado() {
        pedido.setEstado(PedidoEstadoAprovado.getInstance());
        assertFalse(pedido.rejeitar());
    }

    @Test
    public void deveDespacharPedidoAprovado() {
        pedido.setEstado(PedidoEstadoAprovado.getInstance());
        assertTrue(pedido.despachar());
        assertEquals(PedidoEstadoDespachado.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveEntregarPedidoAprovado() {
        pedido.setEstado(PedidoEstadoAprovado.getInstance());
        assertFalse(pedido.entregar());
    }

    // Pedido despachado

    @Test
    public void naoDeveAprovarPedidoDespachado() {
        pedido.setEstado(PedidoEstadoDespachado.getInstance());
        assertFalse(pedido.aprovar());
    }

    @Test
    public void naoDeveCancelarPedidoDespachado() {
        pedido.setEstado(PedidoEstadoDespachado.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    public void naoDeveRejeitarPedidoDespachado() {
        pedido.setEstado(PedidoEstadoDespachado.getInstance());
        assertFalse(pedido.rejeitar());
    }

    @Test
    public void deveEntregarPedidoDespachado() {
        pedido.setEstado(PedidoEstadoDespachado.getInstance());
        assertTrue(pedido.entregar());
        assertEquals(PedidoEstadoEntregue.getInstance(), pedido.getEstado());
    }

    // Pedido cancelado

    @Test
    public void naoDeveAprovarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.aprovar());
    }

    @Test
    public void naoDeveCancelarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    public void naoDeveRejeitarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.rejeitar());
    }

    @Test
    public void naoDeveDespacharPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.despachar());
    }

    @Test
    public void naoDeveEntregarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.entregar());
    }

    // Pedido entregue

    @Test
    public void naoDeveAprovarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.aprovar());
    }

    @Test
    public void naoDeveCancelarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    public void naoDeveRejeitarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.rejeitar());
    }

    @Test
    public void naoDeveDespacharPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.despachar());
    }

    @Test
    public void naoDeveEntregarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.entregar());
    }
}
