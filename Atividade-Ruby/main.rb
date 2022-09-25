require_relative "Conta"
require_relative "Cliente"

#Instanciando objetos cliente1 e cliente2
cliente1 = Cliente.new("Juliana Silva", "F", 23, "Enferemeira")
cliente2 = Cliente.new("Manuel Silva", "M", 33, "Vendedor")

#Instanciando objetos conta1 e conta2
conta1 = Conta.new(cliente1, "1", "202")
conta2 = Conta.new(cliente2, "2", "202")

#Acessando valores 
puts "NOME: " + conta1.cliente.nome
puts "NÚMERO DA CONTA: " + conta1.numero
puts "NAGÊNCIA: " + conta1.agencia
puts "SALDO: #{conta1.saldo}"

#Invocando método extrato
puts conta1.extrato

#Invocando médodo depositar 
conta1.depositar

#Invocando o método sacar
conta1.sacar

#Invocando o método transferir
conta1.transferir(conta2)
conta2.extrato