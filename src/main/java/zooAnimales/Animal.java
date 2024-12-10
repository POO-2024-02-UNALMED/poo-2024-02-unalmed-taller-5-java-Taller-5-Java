package zooAnimales;

import gestion.Zona;

public class Animal {
  private integer totalAnimales;
  private String nombre;
  private String habitat;
  private String genero;
  private Zona[] zona = new Zona[1];

  public Animal() {
    }

  public Animal(Integer totalAnimales, String nombre, String habitat, String genero, Zona[] zona) {
        this.totalAnimales = totalAnimales;
        this.nombre = nombre;
        this.habitat = habitat;
        this.genero = genero;
        this.zona = zona;
    }
  
  public void movimiento(){
    
  }
  public void totalPorTipo(){
    
  }
  @Override
  public String toString() {
    return "a";
}
