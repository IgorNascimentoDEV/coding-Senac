class Conta 
  
    # para a criação de classes em Ruby, primeiro se usa a palavra chave class, seguido do seu nome.
    
    # em Ruby não se usa as chaves para delimitar a caixa de código, e sim se usa a palavra chave End, para marcar o final do código class . 

    #O "def" diz ao Ruby que estamos definindo um método
  
    #Em Ruby, o construtor de uma classe é definido com o uso da palavra-chave initialize

    def initialize (cliente, saldo)
      @cliente = cliente
      @saldo = saldo
    end
end