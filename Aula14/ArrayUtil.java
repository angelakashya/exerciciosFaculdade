public class ArrayUtil {
    private int[] numeros;
    private int tamanho;

    public ArrayUtil(int tamanho) {
        this.numeros = new int[tamanho];
        this.tamanho = 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void inserir(int numero) {
        numeros[tamanho++] = numero; 
    }

    public int getNumero(int pos) {
        if(pos >= tamanho)
            return -1;
        else
            return numeros[pos];
    }

    public void inverte() {
        for(int i = 0; i < tamanho / 2; i++) {
            int aux = numeros[i];
            int auxTo = numeros[tamanho - 1 - i];

            numeros[i] = auxTo;
            numeros[tamanho - 1 - i] = aux;
        }
    }

    public void ordenaAsc() {
        int temp = 0;
        
        for(int i = 0; i < tamanho; i++) {     
            for(int j = 0; j < tamanho; j++) {

                if (numeros[i] < numeros[j]) {
                    temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }
    }

    public int obtemMaior() {
        int maior = numeros[0];
        for(int i = 1; i < tamanho; i++) {
            if(numeros[i] > maior)
                maior = numeros[i];
        }
        return maior;
    }
}