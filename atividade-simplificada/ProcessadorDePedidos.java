/**
 * ESTA É A CLASSE QUE VIOLA TODOS OS PRINCÍPIOS SOLID
 */
class ProcessadorDePedidos {
   
    public void processar(Pedido pedido, Banco repo) {
        // 1. Responsabilidade: Calcular o total
        calc();

        // 2. Responsabilidade: Processar o pagamento
        
        processo(pedido);

        // 3. Responsabilidade: Salvar no banco
        salvar(repo, pedido);

        // 4. Responsabilidade: Enviar e-mail
        envio();
        // Lógica de envio de e-mail
    }
}