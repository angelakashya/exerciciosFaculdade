public class Matematica {
    private int numero;

    public Matematica() {
        this.numero = 0;
    }

    public Matematica(int numero) {
        this.numero = numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public int fatorial() {
        int result = 1;
        for(int i = 1; i <= numero; i++) {
            result *= i;
        }
        return numero == 0 ? 1 : result;
    }

    public double pow(int exp) {
        
        return Math.pow(numero, exp);
    }
}