package org.example;

public class PedidoEstadoRejeitado extends PedidoEstado {

    private PedidoEstadoRejeitado() {}

    private static PedidoEstadoRejeitado instance = new PedidoEstadoRejeitado();

    public static PedidoEstadoRejeitado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Rejeitado";
    }

    // Como o pedido foi rejeitado, nenhuma outra ação pode ser realizada.
    @Override
    public boolean aprovar(Pedido pedido) {
        return false; // Não pode aprovar um pedido rejeitado
    }

    @Override
    public boolean cancelar(Pedido pedido) {
        return false; // Já foi rejeitado, não pode ser cancelado
    }

    @Override
    public boolean despachar(Pedido pedido) {
        return false; // Não pode despachar um pedido rejeitado
    }

    @Override
    public boolean entregar(Pedido pedido) {
        return false; // Não pode entregar um pedido rejeitado
    }

    @Override
    public boolean rejeitar(Pedido pedido) {
        return false; // Já está rejeitado
    }
}
