public class Candidato{
    private int id;
    private String nome;
    private int idade;
    private String cidade;
    
    private String halibidadesTecnicas;
    private String halibiladesInterpessoais;
    private double salarioOferecido;
    private String nivelCandidato;
    private String status;
    
    

    


  
    
        
        
   
   
    //Sobrescrevendo metodo toString
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
    public String getHalibidadesTecnicas() {
        return halibidadesTecnicas;
    }
    public void setHalibidadesTecnicas(String halibidadesTecnicas) {
        this.halibidadesTecnicas = halibidadesTecnicas;
    }
    public String getHalibiladesInterpessoais() {
        return halibiladesInterpessoais;
    }
    public void setHalibiladesInterpessoais(String halibiladesInterpessoais) {
        this.halibiladesInterpessoais = halibiladesInterpessoais;
    }
    public double getSalarioOferecido() {
        return salarioOferecido;
    }
    public void setSalarioOferecido(double salarioOferecido) {
        this.salarioOferecido = salarioOferecido;
    }
    public String getNivelCandidato() {
        return nivelCandidato;
    }
    public void setNivelCandidato(String nivelCandidato) {
        this.nivelCandidato = nivelCandidato;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}