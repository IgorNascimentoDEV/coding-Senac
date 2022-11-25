package model;

import java.util.ArrayList;

public class Vaga {

    private int idVaga;
    private String nomeVaga;
    private String local;
    private String data;
    private String modalidade;
    private int codigoVaga;
    private ArrayList<Vaga> vagasList = new ArrayList<>();

    public Vaga() {
    }

    public Vaga(int idVaga, String nomeVaga, String local, String data, String modalidade, int codigoVaga) {
        this.idVaga = idVaga;
        this.nomeVaga = nomeVaga;
        this.local = local;
        this.data = data;
        this.modalidade = modalidade;
        this.codigoVaga = codigoVaga;
    }

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

    public int getCodigoVaga() {
        return codigoVaga;
    }

    public void setCodigoVaga(int codigoVaga) {
        this.codigoVaga = codigoVaga;
    }

    public ArrayList<Vaga> getVagasList() {
        return vagasList;
    }

    public void setVagasList(ArrayList<Vaga> vagasList) {
        this.vagasList = vagasList;
    }

    public int getIdVaga() {
        return idVaga;
    }

    public void setIdVaga(int idVaga) {
        this.idVaga = idVaga;
    }

    @Override
    public String toString() {
        return "============ DADOS DA VAGA ============" +
                "\nID: " + this.idVaga +
                "\nCódigo: " + this.codigoVaga +
                "\nNome da Vaga: " + this.nomeVaga +
                "\nLocal: " + this.local +
                "\nModalidade: " + this.modalidade +
                "\n=========================================\n";
    }
}