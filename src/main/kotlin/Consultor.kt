class Consultor(nome: String, cpf: Long, val horasTrabalhadas: Long): Colaborador(nome, cpf) {
    val valorHora = 125.00

    override fun CalcularSalario(): Double {
        return this.horasTrabalhadas * valorHora
    }
}