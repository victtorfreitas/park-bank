fun main() {
    println("Bem vindo ao ParkBank")

    val funVicttor = Funcionario("Victtor", "027.322.121-94", 1000.0)
    println("Nome: ${funVicttor.nome}")
    println("CPF: ${funVicttor.cpf}")
    println("Salario: ${funVicttor.salario}")
    println("Bonificação: ${funVicttor.bonificacao}")

    val gerenteFabia = Gerente("Fabia", "125.297.121-94", 2000.0, 123)
    println("Nome: ${gerenteFabia.nome}")
    println("CPF: ${gerenteFabia.cpf}")
    println("Salario: ${gerenteFabia.salario}")
    println("Bonificação: ${gerenteFabia.bonificacao}")

    println("Autenticado: ${if (gerenteFabia.autentica(1233)) "Sim" else "Não"}")

    val juniorDiretor = Diretor("Júnior", "000.111.121-94", 4000.0, 123,450.0)
    println("Nome: ${juniorDiretor.nome}")
    println("CPF: ${juniorDiretor.cpf}")
    println("Salario: ${juniorDiretor.salario}")
    println("Bonificação: ${juniorDiretor.bonificacao}")

    val calculadora = CalculadoraBonificacao()

    calculadora.registra(funVicttor)
    calculadora.registra(gerenteFabia)
    calculadora.registra(juniorDiretor)

    println("O valor total pago de bonificação será: ${calculadora.total}")

}
