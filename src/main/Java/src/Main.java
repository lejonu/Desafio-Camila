public class Main {

    public static void main(String[] args) {
        Vendedor vendedor01 = new Vendedor("Célia", 123456789, .05, 20);
        double salarioVendedor = vendedor01.CalcularSalario();
        System.out.printf("Salário do vendedor(a) %s é %.2f\n", vendedor01.getNome(), salarioVendedor);

        Consultor consultor01 = new Consultor("Joaquim", 7654321, 125.00, 20);
        double salarioConsultor = consultor01.CalcularSalario();
        System.out.printf("Salário do consultor(a) %s é %.2f\n", consultor01.getNome(), salarioConsultor);
    }

}