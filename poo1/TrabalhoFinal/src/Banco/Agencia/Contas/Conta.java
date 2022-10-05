package Banco.Agencia.Contas;
import java.util.LinkedList;

import Banco.Agencia.Contas.Movimentcaoes.Movimentacoes;
import Banco.Clientes.Clientes;
import Suporte.Data;
import Suporte.GerenArquivos;



public abstract class Conta
{
    protected int Num_Conta;
    protected int Senha_Conta;
    protected float saldo;
    protected boolean StatusDaConta;
    protected boolean conjunta;
    protected Clientes Cliente_primario; 
    protected Clientes Cliente_secundario;
    protected int Num_Agencia;
    protected Data Abertura_de_Conta;
    protected Data Ultima_Movimentacao;
    protected LinkedList<Movimentacoes> Movimentacoes;


    //Construtor Conta Unica
    public Conta(int Num_Conta, int Senha_Conta, float saldo, boolean conjunta, Clientes Cliente_primario, int Num_Agencia, Data Abertura_de_Conta) {
        this.Num_Conta = Num_Conta;
        this.Senha_Conta = Senha_Conta;
        this.saldo = saldo;
        this.StatusDaConta = true;
        this.conjunta = conjunta;
        this.Cliente_primario = Cliente_primario;
        this.Cliente_secundario = null;
        this.Num_Agencia = Num_Agencia;
        this.Abertura_de_Conta = Abertura_de_Conta;
        Ultima_Movimentacao = new Data(0, 0, 0);

        this.Movimentacoes = new LinkedList<>();
    }

    ////////////////////////////////////
    ////
    ////    Getters e Setters       ///
    ////
    ///////////////////////////////////

    public int getNum_Conta() {
        return this.Num_Conta;
    }

    public void setNum_Conta(int Num_Conta) {
        this.Num_Conta = Num_Conta;
    }

    public int getSenha_Conta() {
        return this.Senha_Conta;
    }

    public void setSenha_Conta(int Senha_Conta) {
        this.Senha_Conta = Senha_Conta;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatusDaConta() {
        return this.StatusDaConta;
    }

    public void setStatusDaConta(boolean StatusDaConta) {
        this.StatusDaConta = StatusDaConta;
    }

    public boolean isConjunta() {
        return this.conjunta;
    }

    public boolean getConjunta() {
        return this.conjunta;
    }

    public void setConjunta(boolean conjunta) {
        this.conjunta = conjunta;
    }

    public Clientes getCliente_primario() {
        return this.Cliente_primario;
    }

    public void setCliente_primario(Clientes Cliente_primario) {
        this.Cliente_primario = Cliente_primario;
    }

    public int getNum_Agencia() {
        return this.Num_Agencia;
    }

    public void setNum_Agencia(int Num_Agencia) {
        this.Num_Agencia = Num_Agencia;
    }

    public boolean isStatusDaConta() {
        return this.StatusDaConta;
    }

    public Clientes getCliente_secundario() {
        return this.Cliente_secundario;
    }

    public void setCliente_secundario(Clientes Cliente_secundario) {
        this.Cliente_secundario = Cliente_secundario;
    }

    public Data getAbertura_de_Conta() {
        return this.Abertura_de_Conta;
    }

    public void setAbertura_de_Conta(Data Abertura_de_Conta) {
        this.Abertura_de_Conta = Abertura_de_Conta;
    }

    public Data getUltima_Movimentacao() {
        return this.Ultima_Movimentacao;
    }

    public void setUltima_Movimentacao(Data Ultima_Movimentacao) {
        this.Ultima_Movimentacao = Ultima_Movimentacao;
    }

    public LinkedList<Movimentacoes> getMovimentacoes() {
        return this.Movimentacoes;
    }

    public void setMovimentacoes(LinkedList<Movimentacoes> Movimentacoes) {
        this.Movimentacoes = Movimentacoes;
    }

    ////////////////////////////////////
    ////
    ////    Transacoes Bancarias    ///
    ////
    ///////////////////////////////////

    public void depositar(float valor, int senha) throws IllegalArgumentException
    {
        if(this.verificaSenha(senha)){
            if (valor<=0) throw new IllegalArgumentException("Valor de deposito incorreto");
            
            this.saldo += valor;
            this.Ultima_Movimentacao=Data.DataAtual();

            Movimentacoes Nova = new Movimentacoes();
            Nova.depositar(valor);
            this.Movimentacoes.add(Nova);
        }
        else{ //TRATAR ERRO DEPOIS
            throw new IllegalArgumentException("Senha incorreta");        }
    }

    public void sacar(float valor,int senha) throws IllegalArgumentException
    {
        if(this.verificaSenha(senha)){
            if(saldo<valor) throw new IllegalArgumentException("Saldo insuficiente");
            if(valor<0) throw new IllegalArgumentException("Valor incorreto");
            this.saldo -= valor;
            this.Ultima_Movimentacao=Data.DataAtual();
            Movimentacoes Nova = new Movimentacoes();
            Nova.sacar(valor);
            this.Movimentacoes.add(Nova);
        }
        else{ //TRATAR ERRO DEPOIS
            throw new IllegalArgumentException("Senha Incorreta");
        }

    }

    public void transferir(int Numbanco,int numAgencia, int NumConta,float valor,int senha)throws IllegalArgumentException
    {
        if(this.verificaSenha(senha))
        {
            if (valor<=0) throw new IllegalArgumentException("Valor de transferencia incorreto");
            this.saldo -= valor;
            this.Ultima_Movimentacao=Data.DataAtual();

            Movimentacoes Nova = new Movimentacoes();
            Nova.tranferir(valor, Numbanco, numAgencia, NumConta);
            this.Movimentacoes.add(Nova);
        }
        else{ //TRATAR ERRO DEPOIS
            throw new IllegalArgumentException("Senha Incorreta");
        }

    }

    public void consultaSaldo(int senha)throws IllegalArgumentException
    {
        if(this.verificaSenha(senha)){
            System.out.println("O saldo atual é de:" + this.getSaldo());
            }
            else{ //TRATAR ERRO DEPOIS
                throw new IllegalArgumentException("Senha Incorreta");
            }
        
    }

    public void realizarPag(float valor,int senha ,String TipoPagamento)throws IllegalArgumentException
    {
        if(this.verificaSenha(senha))
        {
            if(saldo<valor) throw new IllegalArgumentException("Saldo insuficiente");

            this.saldo -= valor;
            Ultima_Movimentacao=Data.DataAtual();
            Movimentacoes Nova = new Movimentacoes();
            Nova.realizarPag(valor, TipoPagamento);
            this.Movimentacoes.add(Nova);
        }
        else throw new IllegalArgumentException("Senha incorreta");

    }

    public void ReceberTransferencia(int Numbanco,int numAgencia, int NumConta,float valor)
    {
        this.saldo +=valor;
        Ultima_Movimentacao=Data.DataAtual();
        Movimentacoes Nova = new Movimentacoes();
        Nova.ReceberTransferencia(valor, Numbanco, numAgencia, NumConta);
        this.Movimentacoes.add(Nova);

    }

    public void HistoricoMovimentacoes()
    {
        for(int i = 0 ; i < Movimentacoes.size(); i++)
        {
            this.Movimentacoes.get(i).ImprimeMovimentacoes();
        }
    }



    //////////////////////////////////
    ////       Avaliar Acesso
    ////                           ///
    ////        Validar Conta
    //////////////////////////////////

    public boolean verificaSenha(int senha){         
        if(this.Senha_Conta == senha){
            return true;
        }
        else{
            return false;
        }
    }

    public void verifica(){
        if(this.conjunta){

        }
    }

    public void desativarConta(int senha){
        if(this.verificaSenha(senha) && this.StatusDaConta == true){
            this.setStatusDaConta(false);
            System.out.println("Conta desativada com sucesso");
        }
    }

    /////////////////////////////////
    ////
    ////    Saida de Dados       ///
    ////
    ////////////////////////////////
 
    public String SaidaArquivo(){
        String CPF_SegundoTitular = "";

        if(conjunta)
            CPF_SegundoTitular=Cliente_secundario.getCPF();
        
        String Data = Num_Conta + ";" +
                    Senha_Conta + ";" +
                    saldo + ";" +
                    StatusDaConta + ";" +
                    conjunta + ";" +
                    Cliente_primario.getCPF() + ";" + 
                    CPF_SegundoTitular + ";" +
                    Num_Agencia + ";" +
                    Abertura_de_Conta.DadosData() + ";" +
                    Ultima_Movimentacao.DadosData() ;
        
        return  Data; 
                
    } 
 
    public void Imprime()
    {
        System.out.println("Agencia: "+this.Num_Agencia+" Conta: "+this.Num_Conta+" Senha: "+this.Senha_Conta);
    }
    
    /////////////////////////////////
    ////                          
    ////    Salvar e Carregar    ////
    ////
    ////////////////////////////////

    public void CarregarMovimentacoes()
    {
        this.Movimentacoes=GerenArquivos.carregar_Movimentacoes(Num_Conta, Num_Agencia);
        AtualizarContas();
    }

    public void SalvarMovimentacoes()
    {
        GerenArquivos.SalvarArquivoMovimentacoes(Num_Agencia, Num_Conta, Movimentacoes);
    }

    public void AtualizarContas()
    {
        this.saldo=0;
        for(int i =0;i<Movimentacoes.size();i++)
        {
            Movimentacoes Percorre = Movimentacoes.get(i);
            if(Percorre.getTipo_transacao().equals("Deposito"))
            {
                this.saldo+=Percorre.getValor();
                this.Ultima_Movimentacao=Percorre.getData_transacao();
            }
            else if(Percorre.getTipo_transacao().equals("Sacar"))
            {
                this.saldo-=Percorre.getValor();
                this.Ultima_Movimentacao=Percorre.getData_transacao();
            }
            else if(Percorre.getTipo_transacao().equals("Tranferir"))
            {
                this.saldo-=Percorre.getValor();
                this.Ultima_Movimentacao=Percorre.getData_transacao();
            }
            else if(Percorre.getTipo_transacao().equals("Pagamento"))
            {
                this.saldo-=Percorre.getValor();
                this.Ultima_Movimentacao=Percorre.getData_transacao();
            }
            else if(Percorre.getTipo_transacao().equals("Receber Transferencia"))
            {
                this.saldo+=Percorre.getValor();
                this.Ultima_Movimentacao=Percorre.getData_transacao();
            }
            else if(Percorre.getTipo_pagamento().equals("Rendimento"))
            {
                this.saldo+=Percorre.getValor();

            }
        }
    }

}