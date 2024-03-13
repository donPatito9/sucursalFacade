/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expansionmasiva;

/**
 *
 * @author Robinson
 */
public class facadeEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    SistemaSnf snf = new SistemaSnf();
    
    System.out.println("Systema Implementando nuevas sucursales");
    System.out.println("******************************************");
    snf.implementarSucursalUno();
    System.out.println("******************************************");
    snf.implementarSucursalDos();
    System.out.println("******************************************");
    snf.implementarSucursalTres();
  
  
  }
  
}
    

