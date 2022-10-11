import java.util.Random;

public class Jogo {
    private int id;
    private String nome;
    private String descricao;

    public Jogo(String nome, String descricao) {
        setNome(nome);
        setDescricao(descricao);
    }

    public int getId(){
        id = new Random().nextInt(10000);
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }    
}
