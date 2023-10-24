import java.util.Scanner;
public class CuentaBancaria {
    Scanner sc = new Scanner(System.in);
    private double Saldo;
    private int NumeroCuenta;
    private double retiro;
    public void cuenta(double s, int nC){
        Saldo=s;
        NumeroCuenta=nC;
    }

    public String datosCuenta() {

        return "Saldo Disponible: "+Saldo+" Num. De Cuenta"+NumeroCuenta;
    }
    public double ret(){
        retiro=sc.nextDouble();
        return retiro;
    }
    public double Saldo(){
        return Saldo-retiro;
    }
}
