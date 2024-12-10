package gestion;
public class Zoologico {

  private String nombre;
  private String ubicacion;
  private Zona[] zonas;

  public Zoologico() {
    }

  public Zoologico(String nombre, String ubicacion) {
    this.nombre = nombre;
    this.ubicacion = ubicacion;
    this.zonas = new Zona[0]; 
  }
  
    public void agregarZonas(Zona zona) {
        for (int i = 0; i < zonas.length; i++) {
            if (zonas[i] == null) {
                zonas[i] = zona;
                return;
            }
      }
    }

    public int cantidadTotalAnimales() {
        int totalAnimales = 0;
      
        for (int i = 0; i < zonas.length; i++) {
            if (zonas[i] != null) {
                totalAnimales += zonas[i].cantidadAnimales(); 
        }
      }
        return totalAnimales;
        
}
  // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

   public Zona[] getZona() {
        return zonas.toArray(new Zona[0]);
  }


    public void setZona(Zona[] zonas) {
        this.zonas = zonas;
    }
}
