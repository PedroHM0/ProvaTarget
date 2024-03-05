import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SomaLoop somaLoop = new SomaLoop();

        somaLoop.setIndice(13);
        somaLoop.setSoma(0);
        somaLoop.setK(0);
        somaLoop.calcularSoma();

        System.out.println("A soma deu: " + somaLoop.getSoma() + "\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numeroInput = scanner.nextInt();

        VerificadorFibonacci verificador = new VerificadorFibonacci();

        String resultado = verificador.verificaFibonacci(numeroInput);

        System.out.println(resultado);


        String inputString = "Pedro";
        String invertedString = InverteString.inverteString(inputString);
        System.out.println("String invertida: " + invertedString);

    }

}
