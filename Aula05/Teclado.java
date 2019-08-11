import java.util.*;
import java.lang.*;
import java.io.*;

public class Teclado {
    private Scanner scanner;

    public Teclado() {
        this.scanner = new Scanner (System.in);
    }

    public int leInt() {
        return this.scanner.nextInt();
    }

    public double leDouble () {
        return this.scanner.nextDouble();
    }

    public String leString (){
        return this.scanner.next();
    }
}