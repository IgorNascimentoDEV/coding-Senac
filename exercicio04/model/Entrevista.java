package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Entrevista {

    private int id;
    private String dataEntrevista;
    private int codigoVaga;
    private String nomecandidato;
    private List<String> softSkills;
    private List<String> skillsTecnicos;
    private SenioridadeEnum nivelProposto;
    private BigDecimal salarioProposto;
    private StatusEnum statusEnum;
    private ArrayList<Entrevista> entrevistasList = new ArrayList<>();

    public Entrevista() {
    }

    public Entrevista(int id, String dataEntrevista, int codigoVaga, String nomecandidato, List<String> softSkills, List<String> skillsTecnicos, SenioridadeEnum nivelProposto, BigDecimal salarioProposto, StatusEnum statusEnum) {
        this.id = id;
        this.dataEntrevista = dataEntrevista;
        this.codigoVaga = codigoVaga;
        this.nomecandidato = nomecandidato;
        this.softSkills = softSkills;
        this.skillsTecnicos = skillsTecnicos;
        this.nivelProposto = nivelProposto;
        this.salarioProposto = salarioProposto;
        this.statusEnum = statusEnum;
    }

    public String getDataEntrevista() {
        return dataEntrevista;
    }

    public void setDataEntrevista(String dataEntrevista) {
        this.dataEntrevista = dataEntrevista;
    }

    public int getCodigoVaga() {
        return codigoVaga;
    }

    public void setCodigoVaga(int codigoVaga) {
        this.codigoVaga = codigoVaga;
    }

    public String getNomecandidato() {
        return nomecandidato;
    }

    public void setNomecandidato(String nomecandidato) {
        this.nomecandidato = nomecandidato;
    }

    public List<String> getSoftSkills() {
        return softSkills;
    }

    public void setSoftSkills(List<String> softSkills) {
        this.softSkills = softSkills;
    }

    public List<String> getSkillsTecnicos() {
        return skillsTecnicos;
    }

    public void setSkillsTecnicos(List<String> skillsTecnicos) {
        this.skillsTecnicos = skillsTecnicos;
    }

    public SenioridadeEnum getNivelProposto() {
        return nivelProposto;
    }

    public void setNivelProposto(SenioridadeEnum nivelProposto) {
        this.nivelProposto = nivelProposto;
    }

    public BigDecimal getSalarioProposto() {
        return salarioProposto;
    }

    public void setSalarioProposto(BigDecimal salarioProposto) {
        this.salarioProposto = salarioProposto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Entrevista> getEntrevistasList() {
        return entrevistasList;
    }

    public void setEntrevistasList(ArrayList<Entrevista> entrevistasList) {
        this.entrevistasList = entrevistasList;
    }

    public StatusEnum getStatusEnum() {
        return statusEnum;
    }

    public void setStatusEnum(StatusEnum statusEnum) {
        this.statusEnum = statusEnum;
    }


    @Override
    public String toString() {
        return "============= DADOS DA ENTEVISTA =============" +
                "\nID: " + this.id +
                "\nData: " + this.dataEntrevista +
                "\nC??digo vaga: " + this.codigoVaga +
                "\nCandidato: " + this.nomecandidato +
                "\nSenioridade proposta: " + this.nivelProposto +
                "\nSal??rio proposto: " + this.salarioProposto +
                "\nStatus final: " + this.statusEnum +
                "\n==============================================\n";
    }
}