package Banco.Agencia.Contas.Movimentcaoes;
import Suporte.Data;

public class Movimentacoes {
    private Data Data_transacao;
    private float valor;
    private String tipo_transacao;
    private int Num_Conta_Destinatario;
    private int Num_Agencia_Destinario;
    private int Num_Banco_Destinario;
    private String tipo_pagamento;




    public Movimentacoes() {
        Data_transacao = Data.DataAtual();
        valor=0f;
        tipo_transacao = "NA";
        Num_Agencia_Destinario=0;
        Num_Banco_Destinario=0;
        Num_Conta_Destinatario=0;
        tipo_pagamento ="NA";
    }

    public Movimentacoes(Data Data_transacao, float valor, String tipo_transacao, int Num_Conta_Destinatario, int Num_Agencia_Destinario, int Num_Banco_Destinario, String tipo_pagamento) {
        this.Data_transacao = Data_transacao;
        this.valor = valor;
        this.tipo_transacao = tipo_transacao;
        this.Num_Conta_Destinatario = Num_Conta_Destinatario;
        this.Num_Agencia_Destinario = Num_Agencia_Destinario;
        this.Num_Banco_Destinario = Num_Banco_Destinario;
        this.tipo_pagamento = tipo_pagamento;
    }

    //////////////////////////////////////////////////////////////
    ///
    ///            GETTERS E SETTERS                            //
    ///
    //////////////////////////////////////////////////////////////
    
    public Data getData_transacao() {
        return this.Data_transacao;
    }

    public void setData_transacao(Data Data_transacao) {
        this.Data_transacao = Data_transacao;
    }

    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getTipo_transacao() {
        return this.tipo_transacao;
    }

    public void setTipo_transacao(String tipo_transacao) {
        this.tipo_transacao = tipo_transacao;
    }

    public int getNum_Conta_Destinatario() {
        return this.Num_Conta_Destinatario;
    }

    public void setNum_Conta_Destinatario(int Num_Conta_Destinatario) {
        this.Num_Conta_Destinatario = Num_Conta_Destinatario;
    }

    public int getNum_Agencia_Destinario() {
        return this.Num_Agencia_Destinario;
    }

    public void setNum_Agencia_Destinario(int Num_Agencia_Destinario) {
        this.Num_Agencia_Destinario = Num_Agencia_Destinario;
    }

    public int getNum_Banco_Destinario() {
        return this.Num_Banco_Destinario;
    }

    public void setNum_Banco_Destinario(int Num_Banco_Destinario) {
        this.Num_Banco_Destinario = Num_Banco_Destinario;
    }

    public String getTipo_pagamento() {
        return this.tipo_pagamento;
    }

    public void setTipo_pagamento(String tipo_pagamento) {
        this.tipo_pagamento = tipo_pagamento;
    }

    //////////////////////////////////////////////////////////////
    ///
    ///            Saida de dados                               //
    ///
    //////////////////////////////////////////////////////////////

    public String DadosMovimentacao()
    {
        return Data_transacao.DadosData() + ";" + valor + ";" + tipo_transacao + ";" + Num_Conta_Destinatario + ";" + Num_Agencia_Destinario + ";" + Num_Banco_Destinario + ";" +tipo_pagamento;
    }   
    
    public void ImprimeMovimentacoes()
    {
        System.out.printf("Data: %s -> Valor: %.2f -> Tipó %s\n", Data_transacao.DadosData(),valor,tipo_transacao);
    }
    /////////////////////////////////////////////////////////////
    ///
    ///             Transacoes                              /////
    ///
    ////////////////////////////////////////////////////////////

    public void depositar(Float valor )
    {
        mov(valor);
        this.tipo_transacao="Deposito";
    }

    public void sacar(Float valor)
    {
        mov(valor);
        this.tipo_transacao="Sacar";
    }

    public void tranferir(Float valor,int Num_Banco_Destinario, int Num_Agencia_Destinario,int Num_Conta_Destinatario)
    {
        mov(valor);
        this.tipo_transacao="Tranferir";
        this.Num_Banco_Destinario = Num_Banco_Destinario;
        this.Num_Agencia_Destinario = Num_Agencia_Destinario;
        this.Num_Conta_Destinatario = Num_Conta_Destinatario;
    }

    public void realizarPag(Float valor, String TipoPagamento)
    {
        mov(valor);
        this.tipo_transacao = "Pagamento";
        this.tipo_pagamento =TipoPagamento;
    }

    private void mov(Float valor)
    {
        this.Data_transacao = Data.DataAtual();
        this.valor=valor;
    }

    public void Rendimento(Float valor)
    {
        mov(valor);
        this.tipo_transacao="Rendimento";
    }

    public void ReceberTransferencia(Float valor, int NumBancoOrigem, int NUmAgenciaOrigem, int NumContaOrigem)
    {
        mov(valor);
        this.tipo_transacao="Receber Transferencia";
        this.Num_Banco_Destinario = NumBancoOrigem;
        this.Num_Agencia_Destinario = NUmAgenciaOrigem;
        this.Num_Conta_Destinatario = NumContaOrigem;

    }
}
