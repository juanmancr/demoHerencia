
package demoherencia;

/**
 *
 * @author juanm
 */
public class CuentaDeCheques {
    
    private int numeroDeCuenta;
    private String cliente;
    private double saldo;
    private int chequesEmitidos;
    private int chequesRebotados;
    
    public CuentaDeCheques (int numeroDeCuenta, String cliente){
        this.cliente = cliente;
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = 2000.0;
        this.chequesEmitidos = 0;
        this.chequesRebotados = 0;
    }
    
    public void Depositar(double cantidad){
        if (this.puedeDepositar(cantidad)){
            this.saldo = saldo + cantidad;
        }
        else {
            System.out.println("El depósito no se ha podido realizar.");
        }
    }
    
    public void Retirar(double cantidad){
        if (this.puedeRetirar(cantidad)){
            this.chequesEmitidos = chequesEmitidos +1;
            this.saldo = saldo - cantidad;
            if (chequesEmitidos > 5){
                saldo = saldo -5;
            }
        }
        else {
            this.chequesRebotados ++;
            this.saldo = saldo -100;
            System.out.println ("El retiro no se ha podido realizar, se descontará $100.");           
        }
    }
    
    public boolean puedeDepositar(double cantidad){
        boolean siPuedeDepositar = false;
        if (cantidad > 0) {
            siPuedeDepositar = true;
        }
        return siPuedeDepositar;
    }
    
    public boolean puedeRetirar(double cantidad){
        boolean siPuedeRetirar = false;
        if (cantidad < this.saldo){
            siPuedeRetirar = true;
        }
        return siPuedeRetirar;
    }
    
    
    public double calcularInteresPorChequesEmitidos() {
        double comision = (chequesEmitidos - 5.0) * 5.0;
        return comision;
    }    
    
    public double calcularComisionPorChequesRebotados() {
        return chequesRebotados * 100.0;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
}
