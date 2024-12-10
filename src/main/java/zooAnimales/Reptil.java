package zooAnimales;

public class Reptil extends Animal {
  
    private Reptil[] listado = new Reptil[0];
    public int iguanas = 0;
    public int serpientes = 0;
    private String colorEscamas;
    private int largoCola;

    public Reptil() {
        agregarAlListado(this);
    }

    public Reptil(String nombre, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre, habitat, genero, null);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        agregarAlListado(this);
    }

    public int cantidadReptiles() {
        return listado.length;
    }
    public Reptil crearIguana(String nombre, String genero) {
        Reptil iguana = new Reptil(nombre, "humedal", genero, "verde", 3);
        iguanas++;
        agregarAlListado(iguana);
        return iguana;
    }
    public Reptil crearSerpiente(String nombre, String genero) {
        Reptil serpiente = new Reptil(nombre, "jungla", genero, "blanco", 1);
        serpientes++;
        agregarAlListado(serpiente);
        return serpiente;
    }
    private void agregarAlListado(Reptil reptil) {
        Reptil[] nuevoListado = new Reptil[listado.length + 1];
        for (int i = 0; i < listado.length; i++) {
            nuevoListado[i] = listado[i];
        }
        nuevoListado[listado.length] = reptil;
        listado = nuevoListado;
    }
    public String movimiento() {
        return "reptar";
    }

    // Getters y Setters
    public Reptil[] getListado() {
        return listado;
    }

    public void setListado(Reptil[] listado) {
        this.listado = listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }
}

}
