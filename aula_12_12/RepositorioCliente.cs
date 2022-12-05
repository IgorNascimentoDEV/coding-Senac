using MySqlConnector;
public class RepositorioClienteMySQL : IRepostorio
{
    private MySqlConnection? conexao = null;
    private void AbrirConexao()
    {
        conexao = new MySqlConnection("server=mysql5030.site4now.net; user id=a2d8fc_aula;pwd=abc12345;database=db_a2d8fc_aula;");
        conexao.Open();
    }
    private void FecharConexao()
    {
        if (conexao != null)
            conexao.Close();
    }
    public void Inserir(Cliente c)
    {
        AbrirConexao();
        MySqlCommand comando = new MySqlCommand("INSERT INTO Clientes (nome, email, idade) VALUES (@Nome, @Email, @Idade);", conexao);
        comando.Parameters.AddWithValue("@Nome", c.Nome);
        comando.Parameters.AddWithValue("@Email", c.Email);
        comando.Parameters.AddWithValue("@Idade", c.Idade);
        comando.ExecuteNonQuery();
        FecharConexao();
    }
    public void Deletar(int id)
    {
        AbrirConexao();
        MySqlCommand comando = new MySqlCommand("DELETE FROM Clientes WHERE id = @Id", conexao);
        comando.Parameters.AddWithValue("@Id", id);
        comando.ExecuteNonQuery();
        FecharConexao();
    }
    public void Atualizar(int id, Cliente c)
    {
        AbrirConexao();
        MySqlCommand comando = new MySqlCommand("UPDATE Clientes SET nome = @Nome, email = @Email, idade = @Idade WHERE id = @Id", conexao);
        comando.Parameters.AddWithValue("@Id", id);
        comando.Parameters.AddWithValue("@Nome", c.Nome);
        comando.Parameters.AddWithValue("@Email", c.Email);
        comando.Parameters.AddWithValue("@Idade", c.Idade);
        comando.ExecuteNonQuery();
        FecharConexao();
    }
    public List<Cliente> Listar()
    {
        List<Cliente> clientes = new List<Cliente>();
        AbrirConexao();
        MySqlCommand comando = new MySqlCommand("SELECT * FROM Clientes", conexao);
        MySqlDataReader dr = comando.ExecuteReader();
        while (dr.Read())
        {
            Cliente cli = new Cliente(dr.GetInt32("Id"), dr.GetString("Nome"), dr.GetString("Email"), dr.GetInt32("Idade"));
            clientes.Add(cli);
        }
        FecharConexao();
        return clientes;
    }
    public Cliente Buscar(int id)
    {
        Cliente cliente = null;
        AbrirConexao();
        MySqlCommand comando = new MySqlCommand("SELECT * FROM Clientes WHERE id = @Id", conexao);
        comando.Parameters.AddWithValue("@Id", id);
        MySqlDataReader dr = comando.ExecuteReader();
        while (dr.Read())
        {
            cliente = new Cliente(dr.GetInt32("Id"), dr.GetString("Nome"), dr.GetString("Email"), dr.GetInt32("Idade"));
        }
        FecharConexao();
        return cliente;
    }
}