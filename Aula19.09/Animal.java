public class Animal {
    public String raca;
    public String nome;
    public float peso;
    public char sexo;
    public int idade;
    

    public Animal(String raca, String nome, float peso, char sexo, int idade){
        this.raca = raca;
        this.nome = nome;
        this.peso = peso;
        this.sexo = sexo;
        this.idade = idade;
    }

    public void Andar(){
        System.out.println("O "+ nome + " Andando.....");
    }
}
