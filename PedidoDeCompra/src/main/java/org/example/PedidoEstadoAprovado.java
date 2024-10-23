package org.example;

public class PedidoEstadoAprovado extends PedidoEstado {

    private PedidoEstadoAprovado() {}

    private static PedidoEstadoAprovado instance = new PedidoEstadoAprovado();

    public static PedidoEstadoAprovado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Aprovado";
    }

    @Override
    public boolean despachar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoDespachado.getInstance());
        return true; // Transição para o estado "Despachado"
    }

    @Override
    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true; // Transição para o estado "Cancelado"
    }

    @Override
    public boolean rejeitar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoRejeitado.getInstance());
        return true; // Transição para o estado "Rejeitado"
    }

    // Um pedido aprovado não pode ser entregue diretamente, deve ser despachado primeiro.
    @Override
    public boolean entregar(Pedido pedido) {
        return false;
    }
}
