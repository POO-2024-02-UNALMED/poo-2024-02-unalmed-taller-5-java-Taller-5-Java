package gestion;
import zooAnimales.Animal;
public class Zona {
  private String nombre;
  private Zoologico[] zoo = new Zoologico[1];
  private Animal[] animales;

  public Zona() {
    }

  public Zona(String nombre, Zoologico[] zoo, Animal[] animales) {
        this.nombre = nombre;
        this.zoo = zoo;
        this.animales = animales;
    }

public void agregarAnimales(Animal animal) {

    for (int i = 0; i < animales.length; i++) {
      if (animales[i] == null) {
        animales[i] = animal; 
        return; 
      }
    }
}
  public int cantidadAnimales() {
    int total = 0;

    for (int i = 0; i < animales.length; i++) {
      if (animales[i] != null) {
        total++;
      }
    }

    return total; // Retorna el total de animales en la zona
  }
}
