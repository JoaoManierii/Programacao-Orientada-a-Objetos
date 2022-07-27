package Personas;

public class Data {
    private int Dia;
    private int Mes;
    private int Ano;


    public Data(int Dia, int Mes, int Ano) {
        this.Dia = Dia;
        this.Mes = Mes;
        this.Ano = Ano;
    }

    public int getDia() {
        return this.Dia;
    }

    public void setDia(int Dia) {
        this.Dia = Dia;
    }

    public int getMes() {
        return this.Mes;
    }

    public void setMes(int Mes) {
        this.Mes = Mes;
    }

    public int getAno() {
        return this.Ano;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }


}
