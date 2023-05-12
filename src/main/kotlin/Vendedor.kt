import Colaborador as Colaborador1

class Vendedor(nome: String, cpf: Long, comissao: Double, ) : Colaborador1(nome, cpf) {
    val comissao = comissao
    val salarioMinimo = 1320.00

    override fun CalcularSalario(): Double {
        return salarioMinimo + (this.salarioMinimo + this.comissao)
    }

}