package model;

import java.util.ArrayList;

public class Candidato {
    private static int generator;
    private int id;
    private String nome;
    private int idade;
    private String cidade;
    private String halibidadesTecnicas;
    private String halibiladesInterpessoais;
    private double salarioOferecido;
    private String nivelCandidato;
    private StatusEnum status;
    private int codigoVaga;
    private ArrayList<Candidato> candidatosList = new ArrayList<>();

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

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Candidato> getCandidatosList() {
        return candidatosList;
    }

    public void setCandidatosList(ArrayList<Candidato> candidatosList) {
        this.candidatosList = candidatosList;
    }

    public int getCodigoVaga() {
        return codigoVaga;
    }

    public void setCodigoVaga(int codigoVaga) {
        this.codigoVaga = codigoVaga;
    }

    public static int getGenerator() {
        return generator;
    }

    public static void setGenerator(int generator) {
        Candidato.generator = generator;
    }

    @Override
    public String toString() {

        return "============= DADOS DO CANDIDATO =============" +
                "\nID:" + this.id +
                "\nNome: " + this.nome +
                "\nIdade: " + this.idade +
                "\nStatus final: " + this.status +
                "\n==============================================\n";
    }
}