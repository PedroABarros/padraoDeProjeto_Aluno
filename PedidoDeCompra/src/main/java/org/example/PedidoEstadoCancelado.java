package org.example;

public class PedidoEstadoCancelado extends PedidoEstado {

    private PedidoEstadoCancelado() {}

    private static PedidoEstadoCancelado instance = new PedidoEstadoCancelado();

    public static PedidoEstadoCancelado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Cancelado";
    }

    @Override
    public boolean aprovar(Pedido pedido) {
        return false; // Um pedido cancelado não pode ser aprovado
    }

    @Override
    public boolean despachar(Pedido pedido) {
        return false; // Não pode despachar um pedido cancelado
    }

    @Override
    public boolean entregar(Pedido pedido) {
        return false; // Não pode entregar um pedido cancelado
    }

    @Override
    public boolean rejeitar(Pedido pedido) {
        return false; // Já está cancelado
    }
}
