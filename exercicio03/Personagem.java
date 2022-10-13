public abstract class Personagem <Artefato> {
    private String forca;
    private String raca;
    private float vida;
    public Artefato tipo;

    
    public Personagem(String raca, Artefato tipo) {
        this.raca = raca;
        this.tipo = tipo;
    }
    public String getForca() {
        return forca;
    }
    public void setForca(String forca) {
        this.forca = forca;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public float getVida() {
        return vida;
    }
    public void setVida(float vida) {
        this.vida = vida;
    }
    
  
}


