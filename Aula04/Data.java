public class Data {

    private int dia;
    private int mes;
    private int ano;
    
    public Data() {
        this.dia = 0;
        this.mes = 0;
        this.ano = 0;
    }
    
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public int getDia() {
        return dia;
    }
    
    public int getMes() {
        return mes;
    }
    
    public int getAno() {
        return ano;
    }
    
    public String obtemDataPadrao() {
        return dia + "/" + mes + "/" + ano;
    }
    
    public int obtemDataInvertida() {
        return (ano * 10000) + (mes * 100) + dia;
    }

    public static void main(String[] args) {
        Data d = new Data(3,7,1997);
        System.out.println(d.obtemDataPadrao());
        System.out.println(d.obtemDataInvertida());
    }
}