public interface IRepostorio {
    public void Inserir(Cliente c);
    public void Deletar(int id);
    public void Atualizar(int id, Cliente c);
    public List<Cliente> Listar();
    public Cliente Buscar(int id);
}