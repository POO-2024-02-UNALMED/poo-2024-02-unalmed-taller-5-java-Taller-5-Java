package zooAnimales;

import gestion.Zona;

public class Animal {
  private Integer totalAnimales;
  private String nombre;
  private Integer edad;
  private String habitat;
  private String genero;
  private Zona[] zona = new Zona[1];

  public Animal() {
     totalAnimales++;
  }

  public Animal(Integer totalAnimales, String nombre,Integer edad, String habitat, String genero, Zona[] zona) {
        this.totalAnimales = totalAnimales;
        this.nombre = nombre;
        this.edad= edad;
        this.habitat = habitat;
        this.genero = genero;
        this.zona = zona;
        totalAnimales++;
  }
      
  public Animal(String nombre, Integer edad,String habitat, String genero, Zona[] zona) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.zona = zona;
      }
  static public String movimiento(){
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
    return "Mamiferos: " + mamiferos + "\n" +
           "Aves: " + aves + "\n" +
           "Reptiles: " + reptiles + "\n" +
           "Peces: " + peces + "\n" +
           "Anfibios: " + anfibios;
}

   // Getters y Setters

    public Integer getTotalAnimales() {
        return totalAnimales;
    }

    public void setTotalAnimales(Integer totalAnimales) {
        this.totalAnimales = totalAnimales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getEdad() {  
      return edad;
  }

    public void setEdad(Integer edad) {  
      this.edad = edad;
  }
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Zona[] getZona() {
        return zona;
    }

    public void setZona(Zona[] zona) {
        this.zona = zona;
    }
  
@Override
public String toString() {
    String resultado = "Mi nombre es " + nombre +
                       ", tengo " + (edad != null ? edad + " anos" : "una edad desconocida") + 
                       ", habito en " + habitat + 
                       " y mi genero es " + genero;
    if (zona != null && zona[0] != null) {
        resultado += ", la zona en la que me ubico es " + zona[0].getNombre() +
                     ", en el " + (zona[0].getZoo()[0] != null ? zona[0].getZoo()[0].getNombre() : "zoo desconocido");
    }
    return resultado; 
}

}
