package Banco.Agencia.Contas;

import Banco.Agencia.Contas.Movimentcaoes.Movimentacoes;
import Banco.Clientes.Clientes;
import Suporte.Data;

public class Poupanca extends Conta {
   

    // rendimento do mês atual. 
    private float rendimento;
    
    
    
    public Poupanca(int Num_Conta, int Senha_Conta, float saldo,
    boolean conjunta, Clientes Cliente_primario,
    int Num_Agencia, Data Abertura_de_Conta,float rendimento) {
    super(Num_Conta, Senha_Conta, saldo, conjunta, Cliente_primario, Num_Agencia,
        Abertura_de_Conta);
    this.rendimento = 0.5f;

}


@Override
    public String SaidaArquivo() {
        return "Poupanca;"+ super.SaidaArquivo() + ";" + this.rendimento ;
    }


    public float getRendimento() {
        return rendimento;
    }

    public void setRendimento(float rendimento) {
        this.rendimento = rendimento;
    }

    public void AplicarRendimento()
    {
        Float valor =this.saldo*rendimento;
        this.saldo += valor;
        Movimentacoes Nova = new Movimentacoes();
        Nova.Rendimento(valor);
        Movimentacoes.add(Nova);
    }
    
}
