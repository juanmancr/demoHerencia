
package demoherencia;

import java.util.Scanner;

/**
 *
 * @author juanm
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Bienvenido, ¿Qué cuenta desea iniciar?");
        System.out.println("Selecciones una opción");
        System.out.println("Cuenta Bancaria = 1");
        System.out.println("Cuenta de Ahorro = 2");
        System.out.println("Cuenta de Cheques = 3");
        
        int cuenta = entrada.nextInt();
        
        if (cuenta == 1){
            System.out.println("Proporcione el número de la cuenta.");
            int numeroDeCuenta = entrada.nextInt();
            System.out.println("Proporcione el nombre del cliente.");
            String nombre = entrada.next();
            System.out.println("Propocione los apellidos del cliente");
            String apellidos = entrada.next();
            Cliente cliente = new Cliente(nombre, apellidos);
        
        
            CuentaBancaria CuentaBancaria = new CuentaBancaria (numeroDeCuenta, cliente);
            int contador = 0;
        
         while (contador == 0){
                System.out.println("¿Qué acción desea realizar?: ");
                System.out.println("1 = Introducir datos del cliente.");
                System.out.println("2 = Proporcionar los datos del cliente.");
                System.out.println("3 = Depositar.");
                System.out.println("4 = Retirar.");
                System.out.println("5 = Finalizar.");
                int accionARealizar = entrada.nextInt();
                
                
                if (accionARealizar == 1){
                    String fechaDeNacimiento;
                    System.out.println("Porporcione la fecha de nacimiento.");
                    fechaDeNacimiento = entrada.nextLine();
                    System.out.println("Porporcione su direccion: ");
                    String direccion = entrada.nextLine();
                    System.out.println("Porporcione su acupacion: ");
                    String ocupacion = entrada.nextLine();                
                    System.out.println("Proporcione su telefono: ");
                    String numeroDeTelefonico = entrada.nextLine();                
                    System.out.println("Proporcione su email: ");
                    String emailDelCliente = entrada.nextLine();
                }
                 else if (accionARealizar == 2){
                    System.out.println("Datos personales del Cliente...");
                    System.out.println ("El número de cuenta: " + CuentaBancaria.getNumeroDeCuenta());
                    System.out.println ("El nombre del cliente: " + cliente.getNombreDelCliente() 
                            + " " + cliente.getApellidosDelCliente());
                    System.out.println("Fecha de nacimiento: " + cliente.getFechaDeNacimiento());
                    System.out.println ("Domicilio: " + cliente.getDireccionDelCliente());
                    System.out.println("Ocupación: " + cliente.getOcupacionDelCliente());
                    System.out.println("Número telefónico: " + cliente.getNumeroDeTelefono());
                    System.out.println("Email: " + cliente.getEmailDelCliente());
                 }
                if (accionARealizar == 3){
                System.out.println("Â¿Cuanto dinero deseas depositar?");
                double cantidad = entrada.nextDouble();
                CuentaBancaria.depositar(cantidad);
                }
                if (accionARealizar == 4){
                    System.out.println("Â¿Cuanto dinero deseas retirar?");
                    double cantidad = entrada.nextDouble();
                    CuentaBancaria.retirar(cantidad);
                }
                if (accionARealizar == 5){
                    System.out.println("Fin");
                    contador = 1;
                }
                double saldo = CuentaBancaria.getSaldo();
                System.out.println(+saldo);
            }   
        }
        else if (cuenta == 2){
           System.out.println("Proporcione el numero de la cuenta.");
            int numeroDeCuenta = entrada.nextInt();
            System.out.println("Proporcione el nombre del cliente.");
            String cliente = entrada.next();
            CuentaDeAhorro nuevaCuenta = new CuentaDeAhorro(numeroDeCuenta,cliente);
            
            System.out.println(nuevaCuenta.getSaldo());
            nuevaCuenta.Depositar(200);
            System.out.println(nuevaCuenta.getSaldo());
            nuevaCuenta.corteMensual();
            System.out.println(nuevaCuenta.getSaldo());
            nuevaCuenta.Retirar(500);
        }
        if (cuenta == 3){
            int numeroDeCuenta;
            String cliente;
            int contador;
            int accionARealizar;
            System.out.println("Proporcione el número de la cuenta: ");
            numeroDeCuenta = entrada.nextInt();
            System.out.println("Proporcione el nombre del cliente: ");
            cliente = entrada.next();
            CuentaDeCheques cuentaDeCheques = new CuentaDeCheques(numeroDeCuenta, cliente);
            contador = 0;
            
            while (contador == 0){
            System.out.println("Â¿Que accion desea realizar?");
            System.out.println("1 = Depositar");
            System.out.println("2 = Retirar");
            System.out.println("3 = Finalizar");
            int accion = entrada.nextInt();
            if (accion == 1){
                System.out.println("Â¿Cuanto dinero deseas depositar?");
                double cantidad = entrada.nextDouble();
                cuentaDeCheques.Depositar(cantidad);
            }
            if (accion == 2){
                System.out.println("Â¿Cuanto dinero deseas retirar?");
                double cantidad = entrada.nextDouble();
                cuentaDeCheques.Retirar(cantidad);
            }
            if (accion == 3){
                System.out.println("Fin");
                contador = 1;
            }
            double saldo = cuentaDeCheques.getSaldo();
            System.out.println(+saldo);
            }   
        }
    }
}
    
    

