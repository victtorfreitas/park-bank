class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val tipo: Int
) {
    fun bonificacao(): Double {
        return when (tipo) {
            0 -> salario * 0.1
            1 -> salario * 0.2
            else -> 0.0
        }

    }
}
