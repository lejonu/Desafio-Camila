class Vendedor extends Colaborador{
    private double comissao;
    private final double salarioMinimo = 1320.00;
    private long numeroDeVendas;

    public Vendedor(String nome, long cpf, double comissao, long numeroDeVendas) {
        super(nome, cpf);
        this.comissao = comissao;
        this.numeroDeVendas = numeroDeVendas;
    }

    @Override
    public double CalcularSalario() {
        return this.salarioMinimo + (this.salarioMinimo * this.comissao);
    }
}
