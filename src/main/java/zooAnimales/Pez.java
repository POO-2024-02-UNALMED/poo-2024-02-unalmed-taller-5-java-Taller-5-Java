package zooAnimales;

public class Pez extends Animal {
  
    private Pez[] listado = new Pez[0];
    public int salmones = 0;
    public int bacalaos = 0;
    private String colorEscamas;
    private int cantidadAletas;
  
    public Pez() {
        agregarAlListado(this);
    }

    public Pez(String nombre, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, habitat, genero, null);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        agregarAlListado(this);
    }

    public int cantidadPeces() {
        return listado.length;
    }


    public Pez crearSalmon(String nombre, String genero) {
        Pez salmon = new Pez(nombre, "oceano", genero, "rojo", 6);
        salmones++;
        agregarAlListado(salmon);
        return salmon;
    }
    public Pez crearBacalao(String nombre, String genero) {
        Pez bacalao = new Pez(nombre, "oceano", genero, "gris", 6);
        bacalaos++;
        agregarAlListado(bacalao);
        return bacalao;
    }

    private void agregarAlListado(Pez pez) {
        Pez[] nuevoListado = new Pez[listado.length + 1];
        for (int i = 0; i < listado.length; i++) {
            nuevoListado[i] = listado[i];
        }
        nuevoListado[listado.length] = pez;
        listado = nuevoListado;
    }

    public String movimiento() {
        return "nadar";
    }

    // Getters y Setters
    public Pez[] getListado() {
        return listado;
    }

    public void setListado(Pez[] listado) {
        this.listado = listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }
}
