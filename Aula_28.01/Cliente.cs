public class Cliente{
    
    public int id {get;set;}
    public string nome {get;set;}
    public string email {get;set;}
    public int idade {get;set;}

    public Cliente(){}
    public Cliente(string nome, string email, int idade): this()
    {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public Cliente(int id, string nome, string email, int idade): this(nome, email, idade)
    {
        this.id = id;
    }

}