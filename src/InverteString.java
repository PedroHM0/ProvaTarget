public class InverteString {

    public static String inverteString(String input) {
        char[] charArray = input.toCharArray();

        int esquerda = 0;
        int direita = charArray.length - 1;

/*Dois índices esquerda e direita são usados para trocar os caracteres opostos no
array até que os índices se encontrem no meio do array
temp que é uma variavel temporaria é usada para efetuar as trocas.*/

        while (esquerda < direita) {
            char temp = charArray[esquerda];
            charArray[esquerda] = charArray[direita];
            charArray[direita] = temp;

            esquerda++;
            direita--;
        }

        return new String(charArray);
    }

}
