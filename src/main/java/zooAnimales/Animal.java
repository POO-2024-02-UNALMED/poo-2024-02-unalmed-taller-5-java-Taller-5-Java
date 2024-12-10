package zooAnimales;

import gestion.Zona;

public class Animal {
  private integer totalAnimales;
  private String nombre;
  private String habitat;
  private String genero;
  private Zona[] zona = new Zona[1];

  public Animal() {
     totalAnimales++;
    }

  public Animal(Integer totalAnimales, String nombre, String habitat, String genero, Zona[] zona) {
        this.totalAnimales = totalAnimales;
        this.nombre = nombre;
        this.habitat = habitat;
        this.genero = genero;
        this.zona = zona;
        totalAnimales++;
    }
  
  public String movimiento(){
    return "desplazarse";
  }
public String totalPorTipo(Animal[] animales) {
    int mamiferos = 0;
    int aves = 0;
    int reptiles = 0;
    int peces = 0;
    int anfibios = 0;

    for (Animal animal : animales) {
        if (animal != null) {
            if (animal instanceof Mamifero) {
                mamiferos++;
            } else if (animal instanceof Ave) {
                aves++;
            } else if (animal instanceof Reptil) {
                reptiles++;
            } else if (animal instanceof Pez) {
                peces++;
            } else if (animal instanceof Anfibio) {
                anfibios++;
            }
        }
    }
    return "Mamíferos: " + mamiferos + "\n" +
           "Aves: " + aves + "\n" +
           "Reptiles: " + reptiles + "\n" +
           "Peces: " + peces + "\n" +
           "Anfibios: " + anfibios;
}

  @Override
  public String toString() {
        String resultado = "Mi nombre es " + nombre +
                           ", tengo una edad de desconocida, habito en " + habitat +
                           " y mi género es " + genero;
        if (zona != null && zona[0] != null) {
            resultado += ", la zona en la que me ubico es " + zona[0].getNombre() +
                         ", en el " + (zona[0].getZoo()[0] != null ? zona[0].getZoo()[0].getNombre() : "zoo desconocido");
        }
        return resultado;
    }
}
