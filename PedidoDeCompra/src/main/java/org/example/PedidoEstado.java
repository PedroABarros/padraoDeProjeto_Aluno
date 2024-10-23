package org.example;

public abstract class PedidoEstado {

    public abstract String getEstado();

    public boolean aprovar(Pedido pedido) {
        return false;
    }

    public boolean cancelar(Pedido pedido) {
        return false;
    }

    public boolean despachar(Pedido pedido) {
        return false;
    }

    public boolean entregar(Pedido pedido) {
        return false;
    }

    public boolean rejeitar(Pedido pedido) {
        return false;
    }
}
