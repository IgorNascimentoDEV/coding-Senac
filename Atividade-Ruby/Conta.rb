class Conta 

    # para a criação de classes em Ruby, primeiro se usa a palavra chave class, seguido do seu nome.
      
    # em Ruby não se usa as chaves para delimitar a caixa de código, e sim se usa a palavra chave End, para marcar o final do código class. 
  
    #O "def" diz ao Ruby que estamos definindo um método.
    
    #Em Ruby, o construtor de uma classe é definido com o uso da palavra-chave initialize.
  
    #Em Ruby é utilizado o "puts" como comando de saída e o "gets.chomp" como comando de entrada
  
    attr_accessor :cliente, :saldo, :numero, :agencia, :valorDiferenca
    
    def initialize (cliente, numero, agencia)
      @cliente = cliente
      @numero = numero
      @agencia = agencia
      @saldo = 0
      @valorDiferenca = 0
    end 
    
    def diferenca
      if @saldo >= 1
        @valorDiferenca = 1
      elsif @saldo < 1 and @saldo > 0
        @valorDiferenca = @saldo
      end
    end  

    def extrato
      puts "\n======= EXTRATO DA CONTA ======="
      puts "Nome do cliente: #{cliente.nome}"
      puts "Saldo em conta: R$ #{saldo}"
      puts "================================\n"
    end
    
    def depositar
      puts "\n========= DEPÓSITO EM CONTA ========"
      puts "Informe o valor que deseja depositar:"
      valor = gets.chomp
        
      while valor.to_f == 0 or valor.to_f < 0
        puts "Valor inválido, informe um valor maior que R$ 0.00"
        valor = gets.chomp
      end 
        
      @saldo = @saldo + valor.to_f
      puts "\nVocê depositou R$ #{valor}, seu saldo atual é de R$ #{saldo}\n"
    end
    
    def sacar
      puts "\n=========== SAQUE EM CONTA ==========="
      puts "Informe o valor que você deseja sacar?"
      saque = gets.chomp
  
      while saque.to_f > @saldo or saque.to_f == 0 or saque.to_f < 0
        puts "Não foi possível realizar o saque, tente sacar um valor entre R$ 1,00 e #{saldo}"
        puts "Informe o valor que você deseja sacar:"
        saque = gets.chomp
      end
        
      @saldo = @saldo - saque.to_f
      puts "\nVoce sacou R$ #{saque}, seu saldo atual é de R$ #{saldo}\n"
    end
  
    def transferir(contaDestino)
      diferenca
      puts "\n====================== TRANSFERÊNCIA ENTRE CONTAS ========================"
      puts "Informe o valor ao qual você deseja transferir para conta do titular #{contaDestino.cliente.nome}."
      valor = gets.chomp
      
      while valor.to_f > @saldo or valor.to_f == 0 or valor.to_f < 0
        puts "\nNão foi possível realizar o saque, tente sacar um valor entre R$ #{@valorDiferenca} e R$ #{saldo}"
        puts "Informe o valor que você deseja transferir:"
        valor = gets.chomp
      end
      
      @saldo = @saldo - valor.to_f
      contaDestino.saldo = contaDestino.saldo + valor.to_f
      
      puts "\nVocê acaba de transferir R$ #{valor} para a conta do titular #{contaDestino.cliente.nome}"
      puts "Seu saldo atual é R$ #{saldo}"
    end
  end