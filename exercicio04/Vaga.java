import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.transform.Source;

public class Vaga {
    private String nomeVaga;
    private String local;
    private String data;
    private String modalidade;
    private int vaga;




   

    
  
      //Sobrescrevendo metodo toString
    @Override
    public String toString(){
        return "*Nome da Vaga: " + getNomeVaga() + " \n*Local: " + getLocal() +" \n*Modalidade: " + getModalidade(); 
    }

    



    //Metodos Acessores
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public String getNomeVaga() {
        return nomeVaga;
    }
    public void setNomeVaga(String nomeVaga) {
        this.nomeVaga = nomeVaga;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getModalidade() {
        return modalidade;
    }
    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
}
