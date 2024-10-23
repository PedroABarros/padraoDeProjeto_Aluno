package org.example;

public class PedidoEstadoEntregue extends PedidoEstado {

    private PedidoEstadoEntregue() {}

    private static PedidoEstadoEntregue instance = new PedidoEstadoEntregue();

    public static PedidoEstadoEntregue getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Entregue";
    }

    // Como o pedido já foi entregue, nenhuma outra ação pode ser realizada.
    @Override
    public boolean aprovar(Pedido pedido) {
        return false; // Não pode aprovar um pedido já entregue
    }

    @Override
    public boolean cancelar(Pedido pedido) {
        return false; // Não pode cancelar um pedido já entregue
    }

    @Override
    public boolean despachar(Pedido pedido) {
        return false; // Não pode despachar um pedido já entregue
    }

    @Override
    public boolean entregar(Pedido pedido) {
        return false; // Já está entregue
    }

    @Override
    public boolean rejeitar(Pedido pedido) {
        return false; // Não pode rejeitar um pedido já entregue
    }
}
