public class Horista extends Funcionario{
    private float valorHoras;
    private float totalHoras;

    public Horista(float valorHoras, float totalHoras) {
        this.valorHoras = valorHoras;
        this.totalHoras = totalHoras;
    }

    public float getValorHoras() {
        return valorHoras;
    }

    public void setValorHoras(float valorHoras) {
        this.valorHoras = valorHoras;
    }

    public float getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(float totalHoras) {
        this.totalHoras = totalHoras;
    }

    public float salario_horista(float salario) {
        setSalario(valorHoras*totalHoras);
        return getSalario();
    }
}
