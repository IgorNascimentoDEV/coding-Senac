import java.util.Scanner;

public class Aluno {
    //Atributos
    private int id;
    private String nome;
    private String email;
    private int idade;




    //Construtores
    public Aluno(int id, String nome, String email, int idade) {
        this(nome, email, idade);
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
    public Aluno(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public Aluno(){

    }

    //Sobrescrita do metodo toString
    @Override
    public String toString(){
        return "Nome " + getNome() + " " + "Idade " + getIdade();
    }
    
    //Metodos Acessores
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }


   
}
