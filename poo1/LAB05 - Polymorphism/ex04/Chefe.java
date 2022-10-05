public class Chefe extends Funcionario {
private float salarioFixo;
private float predefinido;

    public Chefe(float salarioFixo, float predefinido) {
        this.salarioFixo = salarioFixo;
        this.predefinido = predefinido;
    }

    public float getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(float salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public float getPredefinido() {
        return predefinido;
    }

    public void setPredefinido(float predefinido) {
        this.predefinido = predefinido;
    }

    public float salario_chefe(float salario) {
        this.setSalario(this.salarioFixo + this.predefinido);
        return this.getSalario();
    }
}
