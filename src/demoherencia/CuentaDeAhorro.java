
package demoherencia;

/**
 *
 * @author juanm
 */
public class CuentaDeAhorro {
    
    private int numeroDeCuenta;
    private String cliente;
    private double saldo;
    private double tasaDeInteres;
    private double comisionPorSaldo;
    
     public CuentaDeAhorro(int numeroDeCuenta, String cliente){
        this.cliente = cliente;
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = 1000.0;
        this.tasaDeInteres = .25;
        this.comisionPorSaldo = 50;
    }
     
     
     public double getSaldo(){
         return this.saldo;
     }
    
     
    public void Depositar(double cantidad){
        if (this.puedeDepositar(cantidad)){
            this.saldo = saldo + cantidad;
        }
        else {
            System.out.println("El depósito no se puede realizar.");
        }
    }
     
    public boolean puedeDepositar(double cantidad){
        boolean siPuedeDepositar = false;
        if (cantidad > 0) {
            siPuedeDepositar = true;
        }
        return siPuedeDepositar;
    }
    
    public void Retirar(double cantidad){
        if (this.puedeRetirar(cantidad)){
            this.saldo = saldo - cantidad;
        }
        else {
            System.out.println("El retiro no se ha realizado.");
        }
    }
    
    public boolean puedeRetirar(double cantidad){
        boolean siPuedeRetirar = false;
        if (cantidad < this.saldo){
            siPuedeRetirar = true;
        }
        return siPuedeRetirar;
    }
    
    public double tasaDeInteres(){
        double interes = 0;
        interes  = ( (saldo * this.tasaDeInteres) /100 );
        return interes;
    }
     
    public double comisionPorSaldo() {
        double comisionPorSaldo = 0;
        if (saldo < 1000.0) {
            comisionPorSaldo = 50;
        }
        else {
            comisionPorSaldo = 0.0;
        }
        return comisionPorSaldo;
    }
    
    public void corteMensual(){
        this.saldo = (saldo + this.tasaDeInteres()) - this.comisionPorSaldo();
    }
         
}
