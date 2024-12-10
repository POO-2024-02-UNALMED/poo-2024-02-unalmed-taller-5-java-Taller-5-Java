package zooAnimales;
public class Pez extends Animal{
  private Pez[] listado;
  public Integer salmones;
  public Integer bacalaos;
  private String colorEscamas;
  private Integer cantidadAletas;

  public Pez() {
    }
  public Pez(Pez[] listado, Integer salmones, Integer bacalaos, String colorEscamas, Integer cantidadAletas) {
        this.listado = listado;
        this.salmones = salmones;
        this.bacalaos = bacalaos;
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
    }

  
  public void cantidadPeces(){
    
  }
  public String movimiento(){
    return "nadar";
  }
  public void crearSalmon(){
    
  }
  public void crearBacalao(){
    
  }
}
