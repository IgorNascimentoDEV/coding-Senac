public class Hospital {
    public String nome;
    private Medico medico;
    private Pessoa paciente;

    public void ContratarOuSubstituir(Medico medico) {
        this.medico = medico;
        System.out.println("Seja bem-vindo, " + medico.nome);
    }

    public void Desligar(Medico medico) {
        this.medico = null;
    }

    public void Internar(Pessoa paciente) {
        if (medico == null) {
            System.out.println("Infelizmente estamos sem médicos. Por favor, volte depois ...");
        } else {
            this.paciente = paciente;
            System.out.println("Paciente " + paciente.nome + " internado!");
        }
    }

    public void Internar(Medico paciente) {
        System.out.println("O paciente " + paciente.nome + " tem desconto!");
        Internar((Pessoa) paciente);
    }

    public boolean EstaLotado() {
        return paciente != null;
    }
}
