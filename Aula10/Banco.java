public class Banco {
    private Dinheiro saldo;

    public Banco(Dinheiro saldo) {
        this.saldo = saldo;
    }

    public Banco() {
        this.saldo = new Dinheiro(0.0);
    }
    
    public void setSaldo(Dinheiro saldo) {
        this.saldo = saldo;
    }
    
    public Dinheiro getSaldo() {
        return this.saldo;
    }
    
    public void deposita(Dinheiro dinheiro) {
        double saldo;
        saldo = this.saldo.getDinheiro() + dinheiro.getDinheiro();
        this.saldo.setDinheiro(saldo);
    }
    
    public String toString() {
        return "Saldo: " + saldo.getDinheiro() + "\n" + "Euro: " + saldo.converteParaEuro() + "\n" + "Dólar: " + saldo.converteParaDolar();
    }
}
