public class Candidato{
    private int id;
    private String nome;
    private int idade;
    private String cidade;
    
    private Entrevista entrevista;

    


  
    
        
        
   
   

    @Override
    public String toString(){
        return "Nome" + " " + getNome();
    }



    
    //Metodos Acessores
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    } 
    public Entrevista getEntrevista() {
        return entrevista;
    }
    public void setEntrevista(Entrevista entrevista) {
        this.entrevista = entrevista;
    }
}