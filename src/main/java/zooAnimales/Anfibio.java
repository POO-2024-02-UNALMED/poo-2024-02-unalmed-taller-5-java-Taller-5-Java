package zooAnimales;

public class Anfibio extends Animal {
    private Anfibio[] listado = new Anfibio[0];
    public int ranas = 0;
    public int salamandras = 0; 
    private String colorPiel;
    private Boolean venenoso;

    public Anfibio() {
        agregarAlListado(this);
    }

    public Anfibio(String nombre, String habitat, String genero, String colorPiel, Boolean venenoso) {
        super(nombre, habitat, genero, null);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        agregarAlListado(this);
    }

    public String movimiento() {
        return "saltar";
    }

    public int cantidadAnfibios() {
        return listado.length;
    }

    public Anfibio crearRana(String nombre, String genero) {
        Anfibio rana = new Anfibio(nombre, "selva", genero, "rojo", true);
        agregarAlListado(rana);
        ranas++; 
        return rana;
    }

    public Anfibio crearSalamandra(String nombre, String genero) {
        Anfibio salamandra = new Anfibio(nombre, "selva", genero, "negro y amarillo", false);
        agregarAlListado(salamandra);
        salamandras++; 
        return salamandra;
    }

    private void agregarAlListado(Anfibio anfibio) {
        Anfibio[] nuevoListado = new Anfibio[listado.length + 1];
        for (int i = 0; i < listado.length; i++) {
            nuevoListado[i] = listado[i];
        }
        nuevoListado[listado.length] = anfibio;
        listado = nuevoListado;
    }
  // Getters y Setters
    public Anfibio[] getListado() {
        return listado;
    }

    public void setListado(Anfibio[] listado) {
        this.listado = listado;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public Boolean getVenenoso() {
        return venenoso;
    }

    public void setVenenoso(Boolean venenoso) {
        this.venenoso = venenoso;
    }
}
