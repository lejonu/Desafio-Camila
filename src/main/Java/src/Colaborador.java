public abstract class Colaborador {
    String nome;
    long cpf;

    public String getNome() {
        return nome;
    }

    public Colaborador(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    abstract double CalcularSalario();
}
