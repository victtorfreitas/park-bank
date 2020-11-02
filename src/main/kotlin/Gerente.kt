class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(nome, cpf, salario) {

    override val bonificacao: Double get() = salario * 0.2

    fun autentica(senha: Int): Boolean = this.senha == senha

}
