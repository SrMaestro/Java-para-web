package src;

public class Operadores {
    public static void main(String[] args) {
        int soma = 20 + 10; // 30
        int subtracao = 20 - 18; // 10
        int multiplicacao = 20 * 10; // 200
        int divisao = 20 / 10; // 2
        int modulo = 21 % 10;

// operador de atribuição
        boolean a = true;
        boolean b = false;

// operadores de comparação ou relacionais
        boolean igual = (10 == 20); // false
        boolean diferente = (10 != 20); // true
        boolean maior = (10 > 20); // false
        boolean maiorOuIgual = (10 >= 20); // false
        boolean menor = (10 < 20); // true
        boolean menorOuIgual = (10 <= 20); // true

// operadores lógicos
        boolean resultadoE = (a && b); // false
        boolean resultadoOU = (a || b); // true
        boolean resultadoNaoA = !a; // false
        boolean resultadoNaoB = !b; // true
    }
}
