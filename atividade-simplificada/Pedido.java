// Classe que representa o Pedido
class Pedido {
    // Violação do OCP: Aberto para modificação quando um novo pagamento surgir
    private java.util.List<Item> itens = new java.util.ArrayList<>();
    private String tipoPagamento; // "cartao", "boleto"

    private void adicionarItem(Item item) {
        itens.add(item);
    }

    private java.util.List<Item> getItens() {
        return itens;
    }

    private String getTipoPagamento() {
        return tipoPagamento;
    }

    private void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}