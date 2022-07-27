public abstract class Contato {
    private String apelido;
    private String nome;
    private String email;
    private int aniversario;

    public Contato() {
    }

    public Contato(String apeido, String nome, String email, int aniversario) {
        this.apelido = apeido;
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApeido(String apeido) {
        this.apelido = apeido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAniversario() {
        return aniversario;
    }

    public void setAniversario(int aniversario) {
        this.aniversario = aniversario;
    }

    public String imprimirBasico() {
        System.out.println("Apelido: "+this.getApelido());
        System.out.println("Nome: "+this.getNome());
        System.out.println("Email: "+this.getEmail());
        System.out.println("Aniversario: "+this.getAniversario());
        return "";
    }
    public abstract void imprimeContato();
}
