Algoritmo DiaDaSemana

// Declaração da lista com os dias da semana
diasDaSemana <- ["Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"]

Escreva("Digite um valor entre 1 e 7: ")
Leia(valor)

Se valor >= 1 E valor <= 7 Então
    diaSemana <- diasDaSemana[valor - 1]
    Escreva("O dia da semana correspondente é: ", diaSemana)
Senão
    Escreva("Valor inválido. Digite um valor entre 1 e 7.")
FimSe

FimAlgoritmo