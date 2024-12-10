package gestion;
public class Zoologico {

  private String nombre;
  private String ubicacion;
  private Zona[] zonas;

  public Zoologico() {
    }

  public Zoologico(String nombre, String ubicacion, Zona[] zonas) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.zonas = zonas;
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
