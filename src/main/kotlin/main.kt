fun main() {
    println("Bem vindo ao Bytebank")

    val funVicttor = Funcionario("Victtor", "027.297.121-94", 1000.0, 3)
    println("Nome: ${funVicttor.nome}")
    println("CPF: ${funVicttor.cpf}")
    println("Salario: ${funVicttor.salario}")
    println("Bonificação: ${funVicttor.bonificacao()}")
}
