package zooAnimales;
public class Ave extends Animal{
  
  private Ave[] listado;
  public Integer halcones;
  public Integer aguilas;
  private String colorPlumas;

  public Ave() {
    }
  public Ave(Ave[] listado, Integer halcones, Integer aguilas, String colorPlumas) {
        this.listado = listado;
        this.halcones = halcones;
        this.aguilas = aguilas;
        this.colorPlumas = colorPlumas;
    }
  
  public void cantidadAves(){
    
  }
  public String movimiento(){
    return "volar";
  }

  public void crearHalcon(){
    
  }
  public void crearAguila(){
    
  }
}
