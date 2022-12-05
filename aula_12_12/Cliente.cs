public class Cliente
{
    public int Id { get; set; }
    public string? Nome { get; set; }
    public string? Email { get; set; }
    public int Idade { get; set; }
    public Cliente(){}  
    public Cliente(string nome, string email, int idade) : this()
    {
        Nome = nome;
        Email = email;
        Idade = idade;
    }
    public Cliente(int id, string? nome, string? email, int idade) : this (nome, email, idade)
    {
        Id = id;
    }
}