public class Principal {
    public static void main(String[] args) {
        Hospital hospital = new Hospital(); // Instanciando um novo objeto da classe "Hospital"
        hospital.nome = "Restauração"; // Atribuindo valor ao atributo "nome" do objeto "hospital"

        Hospital hospitalDoCancer = new Hospital(); // Instanciando um novo objeto da classe "Hospital"
        hospitalDoCancer.nome = "Do Câncer"; // Atribuindo valor ao atributo "nome" do objeto "hospitalDoCancer"

        Medico medico = new Medico(); // Instanciando um novo objeto do tipo "Medico"
        medico.nome = "Reginaldo"; // Atribuindo valor ao atributo "nome" do objeto "medico"

        hospital.ContratarOuSubstituir(medico); // Chamando o método "ContratarOuSubstituir" passando um objeto chamado "medico" da classe "Medico" como parâmetro

        Paciente p = new Paciente();
        p.nome = "Gerald";

        hospitalDoCancer.Internar(p);
        
        System.out.println("O hospital "+ hospital.nome +" está lotado? " + hospital.EstaLotado());

        hospital.Internar(medico);

    }
}