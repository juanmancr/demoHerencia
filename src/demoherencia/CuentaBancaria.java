
package demoherencia;

/**
 *
 * @author juanm
 */
public class CuentaBancaria {
    
    private int numeroDeCuenta;
    private String cliente;
    private double saldo;
    
    
    
    public CuentaBancaria (int numeroDeCuenta, String cliente) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.cliente = cliente;
        this.saldo = 0.0;
    }
    
    
    
    private void NumeroDeCuenta (int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }
    
     public double getNumeroDeCuenta() {
    return numeroDeCuenta;
    }
    
    private void cliente (String cliente) {
        this.cliente = cliente;
    }
    
    public boolean depositar (double cantidad) {
        boolean seRealizoDeposito;
        if (cantidad > 0.0) {
            saldo = saldo + cantidad;
            seRealizoDeposito = true;
        }
        else {
            seRealizoDeposito = false;
        }
        return seRealizoDeposito;
    }
    
    
    public boolean retirar (double cantidad) {
        boolean seRealizoRetiro;
        if (cantidad <= getSaldo()) {
            saldo = saldo - cantidad;
            seRealizoRetiro = true;
        }
        else {
            seRealizoRetiro = false;
        }
        return seRealizoRetiro;
    }
    
    
    public double getSaldo() {
    return saldo;
    }
    
}
