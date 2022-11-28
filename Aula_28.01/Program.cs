using System;
using System.Collections.Generic;
using MySqlConnector;

namespace Aula_28._01
{
    class Program
    {
        static void Main(string[] args)
        {
            RepositorioCliente repositorio = new RepositorioCliente();
            Cliente tioPatinhas = new Cliente("Igor Nascimento", "contato@gmai.com", 89);

            //repositorio.Inserir(tioPatinhas);

            repositorio.Deletar(157);


            List<Cliente> clientesDoBanco = repositorio.Listar();

            foreach(Cliente clienteDaVez in clientesDoBanco){
            Console.WriteLine($"{clienteDaVez.id} {clienteDaVez.nome} {clienteDaVez.email}");
}
        }
    }
}
