fun main() {
    val vendedo01 = Vendedor("Mário", 123456789, .5)
    val salarioVendedor = vendedo01.CalcularSalario()
    println("O salário do vendedor01 ${vendedo01.nome} é $salarioVendedor")

    val consultor01 = Consultor("Joana", 12345678, 10 )
    val salarioConsultor = consultor01.CalcularSalario()
    println("O salário do consutor01 ${consultor01.nome} é $salarioConsultor")
}