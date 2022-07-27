package Instituição.Contas;

import Personas.Clientes.Clientes;

public abstract class Conta
{
    protected String Nome;
    protected int CPF;
    protected int Num_Conta;
    protected int Senha_Conta;
    protected float saldo;
    protected int StatusDaConta;
    protected boolean conjunta;
    protected Clientes Cliente_primario;
    protected Clientes[] Clientes;
    



}