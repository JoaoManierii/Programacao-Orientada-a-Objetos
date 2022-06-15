public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(int numConta, String tipo, String dono, float saldo, boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = 0;
        this.status = false;

    }



    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void estadoAtual() {
        System.out.println("-----------------------------------");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.isStatus());
    }


    public void abrirConta(String tipo) {

        this.setTipo(tipo);    // this.tipo = tipo
        this.setStatus(true); // this.status = true
        if(tipo.equals("CC")) {
            this.setSaldo(50); //this.saldo = 50;
        }
        if(tipo.equals("CP")) {
            this.setSaldo(150); //this.saldo = 150;
        }
        System.out.println("Sua conta foi aberta com sucesso");
    }

    public void fecharConta() {
        if(this.getSaldo() < 0.0f){                                                                    //this.saldo < 0
            System.out.println("Voce ainda tem contas a pagar");
        }
        if(this.getSaldo() > 0.0f) {                                                                 //this.saldo > 0
            System.out.println("Saque o valor restante antes de encerrar a conta");
        }
        if (this.getSaldo() == 0.0f) {                                                               //this.saldo == 0
            this.status = false;
            System.out.println("Sua conta foi fechada com sucesso");
        }
    }

    public void depositar(float valor) {
        if(this.status == true) {
        this.setSaldo(this.getSaldo()+valor); //pega o valor do saldo e adiciona com o valor digitado
            System.out.println("Deposito realizado com sucesso");
        }
        else {
            System.out.println("Impossivel depositar");
        }
    }

    public void sacar(float valor) {
        if (this.status == true){
            if(this.getSaldo() >= valor) {  // saldo >= valor
                this.setSaldo(this.getSaldo() - valor);                   // saldo = saldo - valor
            System.out.println("Saque realizado na conta de "+this.getDono());
            } else{
                System.out.println("Saldo insuficiente");
            }
        }
    }
    public void pagarMensal() {
        int mensal = 0;
    if(this.getTipo()=="CC") {
        mensal = 12;
    }
    if(this.getTipo()=="CP") {
        mensal = 20;
        }
    if(this.status== true) if (this.getSaldo() > mensal) {
        setSaldo(getSaldo() - mensal);
        System.out.println("Mensalidade paga com sucesso por "+this.getDono());
    } else {
        System.out.println("Saldo insuficiente");
    }
    }
}

