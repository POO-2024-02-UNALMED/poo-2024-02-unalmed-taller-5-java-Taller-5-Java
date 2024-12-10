package gestion;
import zooAnimales.Animal;
public class Zona {
  private String nombre;
  private Zoologico[] zoo = new Zoologico[1];
  private Animal[] animales;

  public Zona() {
    }

public Zona(String nombre, Zoologico zoo) {
    this.nombre = nombre;
    this.zoo = new Zoologico[] { zoo };  
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
  // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Zoologico[] getZoo() {
        return zoo;
    }

    public void setZoo(Zoologico[] zoo) {
        this.zoo = zoo;
    }

    public Animal[] getAnimales() {
        return animales;
    }

    public void setAnimales(Animal[] animales) {
        this.animales = animales;
    }
}
