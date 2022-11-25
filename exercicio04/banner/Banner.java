package banner;

public class Banner {

    private String banner;
    private String informacoes;

    public void banner() {
        banner = (
                "-----------------------------------------------------------------------------------------------------\n" +
                        "   _|_|       _|_|_|     _|_|_|   _|_|_|_|   _|      _|   _|_|_|_|_|   _|    _|   _|_|_|     _|_|_|_|  \n" +
                        " _|    _|   _|         _|         _|         _|_|    _|       _|       _|    _|   _|    _|   _|        \n" +
                        " _|_|_|_|   _|         _|         _|_|_|     _|  _|  _|       _|       _|    _|   _|_|_|     _|_|_|    \n" +
                        " _|    _|   _|         _|         _|         _|    _|_|       _|       _|    _|   _|    _|   _|        \n" +
                        " _|    _|     _|_|_|     _|_|_|   _|_|_|_|   _|      _|       _|         _|_|     _|    _|   _|_|_|_|\n " +
                        "-----------------------------------------------------------------------------------------------------\n");
        System.out.println(banner);
    }

    public void informacoes(){
        informacoes = ("Para realizar registros (cadastro de vagas, candiatos e entrevistas) é preciso seguir a ordem de cadastro.\n" +
                "    1 - Deve-se primeiramente realizar o cadastro de uma vaga.\n" +
                "    2 - Após o cadastro da vaga é possível realizar o cadastro do canditado e associá-lo a uma vaga já cadastrada.\n" +
                "    3 - Por fim é possível realizar o registro/cadastro da entrevista, associando a ela um candidaro e uma vaga já cadastrada no sistema.\n" +
                "\n" +
                "Informações adicionais:" +
                "\n" +
                "  - Após o cadastro de um candiato o mesmo recebe o status/enum A_ENTREVISTAR de forma automática. A validação final do seu status é \n" +
                "    atribuída no momento da finalização de sua entrevista\n" +
                "  - Este sistema foi desenvolvido com base em dois módulos diferentes, a package controller e model. Na packege model estão as definições\n" +
                "    das classes e seus respectivos métodos toString e métodos acessores e as classes enum. Já na package controller estão as classes de \n" +
                "    controle, responsáveis por alocar os métodos e as regras do sistema, como geração do id para identificar os registros e realizar deletes,\n" +
                "    por exemplo.\n" +
                "  - A classe Banner da package banner possui o banner/logo ACCENTURE E informaçoes pertinentes para o entendimento da aplicação.\n" +
                "  - Por fim, a classe Application é responsável pela execução da applicação.\n");
        System.out.println(informacoes);
    }
}