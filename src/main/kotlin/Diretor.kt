class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val prl: Double
) : Funcionario(nome, cpf, salario) {

    override val bonificacao: Double get() = salario * 0.4

    fun autentica(senha: Int): Boolean = this.senha == senha
}
