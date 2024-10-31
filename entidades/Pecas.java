package entidades;

public class Pecas {

    private int codPeca;
    private int numeroPecas;
    private double valorUnitario;

   

    public int getCodPeca() {
        return codPeca;
    }

    public int getNumeroPecas() {
        return numeroPecas;
    }
    
    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setCodPeca(int codPeca) {
        this.codPeca = codPeca;
    }

    public void setNumeroPecas(int numeroPecas) {
        this.numeroPecas = numeroPecas;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
    public static double somarTotal(double totalPeca1, double totalPeca2){
        return totalPeca1 + totalPeca2;

    }

    public static double valorAPagar(int num, double valor){
        return num * valor;
    }
    
    
    
}