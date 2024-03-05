//Questão 1
public class SomaLoop {
//Inicio as variaveis e faço os getters e setters delas
    private int indice;
    private int soma;
    private int k;

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

//Usei a logica dada no execicio
    public void calcularSoma() {
        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }
    }
}
