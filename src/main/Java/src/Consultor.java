public class Consultor extends Colaborador{
    private  double valorHora;
    private long horasTrabalhadas;
    public Consultor(String nome, long cpf, double valorHora, long horasTrabalhadas) {
        super(nome, cpf);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    double CalcularSalario() {
        return this.valorHora * this.horasTrabalhadas;
    }
}
