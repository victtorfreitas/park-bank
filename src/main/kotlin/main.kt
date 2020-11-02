fun main() {
    println("Bem vindo ao ParkBank")

    val funVicttor = Funcionario("Victtor", "027.322.121-94", 1000.0)
    println("Nome: ${funVicttor.nome}")
    println("CPF: ${funVicttor.cpf}")
    println("Salario: ${funVicttor.salario}")
    println("Bonificação: ${funVicttor.bonificacao()}")

    val gerenteFabia = Gerente("Fabia", "125.297.121-94", 2000.0, 123)
    println("Nome: ${gerenteFabia.nome}")
    println("CPF: ${gerenteFabia.cpf}")
    println("Salario: ${gerenteFabia.salario}")
    println("Bonificação: ${gerenteFabia.bonificacao()}")

    println("Autenticado: ${if (gerenteFabia.autentica(1233)) "Sim" else "Não"}")
}
