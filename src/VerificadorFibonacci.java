//Questão 2
public class VerificadorFibonacci {

    public String verificaFibonacci(int numero) {
        int a = 0, b = 1;

//Faço um laço de repeticação para ele percorrer os numeros ate chegar ao numero ou passar

        while (b < numero) {
            int temp = b;
            b = a + b;
            a = temp;
        }
/*A logica e começar com numero no 0 e outro no 1, usei uma variavel temporaria pra armazenar
o novo valor e depois repetir o laço com novo valor mais o valor antigo*/

        if (b == numero) {
            return numero + " pertence à sequência de Fibonacci.";
        } else {
            return numero + " não pertence à sequência de Fibonacci.";
        }

/*Depois faço um if e else para determinar se pertence ou não a sequencia*/

    }

}
