class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val prl: Double
) : Funcionario(nome, cpf, salario) {

    override val bonificacao: Double get() = super.bonificacao + salario + prl

    fun autentica(senha: Int): Boolean = this.senha == senha
}
