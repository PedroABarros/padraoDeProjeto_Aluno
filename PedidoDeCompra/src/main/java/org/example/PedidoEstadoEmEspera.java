package org.example;

public class PedidoEstadoEmEspera extends PedidoEstado {

    private PedidoEstadoEmEspera() {}

    private static PedidoEstadoEmEspera instance = new PedidoEstadoEmEspera();

    public static PedidoEstadoEmEspera getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Em Espera";
    }

    @Override
    public boolean aprovar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoAprovado.getInstance());
        return true; // Voltar ao estado "Aprovado"
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

    // Enquanto o pedido está em espera, não pode ser despachado ou entregue.
    @Override
    public boolean despachar(Pedido pedido) {
        return false;
    }

    @Override
    public boolean entregar(Pedido pedido) {
        return false;
    }
}
