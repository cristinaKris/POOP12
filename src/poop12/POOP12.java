/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop12;

/**
 *
 * @author crist
 */
public class POOP12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*HiloT primero=new HiloT("Primer hilo");
        primero.start();
        new HiloT("segundo Hilo").start();
        
        new Thread(new HiloR(),"Tercer Hilo").start();
        new Thread(new HiloR(), "Cuarto Hilo").start();*/
        Cuenta cuenta1=new Cuenta("Retiro 1");
        /*Cuenta cuenta2=new Cuenta("Retiro 2");
        Cuenta cuenta1=new Cuenta("Retiro 1");
        Cuenta cuenta=new Cuenta("Retiro 2");*/
        cuenta1.start();
        new Cuenta("Retiro 2").start();
        new Cuenta("Deposito 1").start();
        new Cuenta("Deposito 2").start();

        for (int i = 0; i < 50; i+=2) {
            new Cuenta("Retiro 1-"+(i+1)).start();
            new Cuenta("Retiro 2-"+(i+2)).start();
            new Cuenta("Deposito 1-"+(i+1)).start();
            new Cuenta("Deposito 2-"+(i+2)).start();
        }
        
        
    }
    
    }
    

