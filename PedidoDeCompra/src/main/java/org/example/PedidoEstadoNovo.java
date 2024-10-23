package padroescomportamentais.state;

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

    // Um pedido entregue não pode ser modificado
    @Override
    public boolean aprovar(Pedido pedido) {
        return false; // Não é possível aprovar um pedido já entregue
    }

    @Override
    public boolean cancelar(Pedido pedido) {
        return false; // Não é possível cancelar um pedido já entregue
    }

    @Override
    public boolean rejeitar(Pedido pedido) {
        return false; // Não é possível rejeitar um pedido já entregue
    }

    @Override
    public boolean despachar(Pedido pedido) {
        return false; // Não é possível despachar um pedido já entregue
    }

    @Override
    public boolean entregar(Pedido pedido) {
        return false; // Não é possível entregar um pedido já entregue
    }
}
