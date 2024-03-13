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
public class SistemaSnf {
  private ISucursal sucursalUno;
  private ISucursal sucursalDos;
  private ISucursal sucursalTres;

  public SistemaSnf() {
    sucursalUno = new SucursalUno();
    sucursalDos = new SucursalDos();
    sucursalTres = new SucursalTres();
  }
  public void implementarSucursalUno(){
    sucursalUno.implementar();
  }
  
  public void implementarSucursalDos(){
    sucursalDos.implementar();
  }
  
  public void implementarSucursalTres(){
    sucursalTres.implementar();
  }
  
}


