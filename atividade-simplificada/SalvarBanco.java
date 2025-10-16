class SalvarBanco {
    public salvo (Pedido pedido) {
        // Violação do DIP: Depende diretamente da implementação concreta
        
        private MySQLRepositorio repositorio = new MySQLRepositorio();

        repositorio.salvar(pedido);

    }
}