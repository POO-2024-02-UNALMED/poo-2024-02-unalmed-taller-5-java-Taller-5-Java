package zooAnimales;

public class Anfibio extends Animal {
    private static Anfibio[] listado = new Anfibio[0];
    public static int ranas = 0;
    public static int salamandras = 0; 
    private String colorPiel;
    private Boolean venenoso;

    public Anfibio() {
        agregarAlListado(this);
    }

    public Anfibio(String nombre, Integer edad, String habitat, String genero, String colorPiel, Boolean venenoso) {
        super(nombre, edad, habitat, genero, null);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        agregarAlListado(this);
    }

    public static String movimiento() {
        return "saltar";
    }

    public static int cantidadAnfibios() {
        return listado.length;
    }

    public static Anfibio crearRana(String nombre, Integer edad, String genero) {
        Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
        agregarAlListado(rana);
        ranas++; 
        return rana;
    }

    public static Anfibio crearSalamandra(String nombre, Integer edad, String genero) {
        Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
        agregarAlListado(salamandra);
        salamandras++; 
        return salamandra;
    }

    private static void agregarAlListado(Anfibio anfibio) {
        Anfibio[] nuevoListado = new Anfibio[listado.length + 1];
        for (int i = 0; i < listado.length; i++) {
            nuevoListado[i] = listado[i];
        }
        nuevoListado[listado.length] = anfibio;
        listado = nuevoListado;
    }

    // Getters y Setters
    public static Anfibio[] getListado() {
        return listado;
    }

    public static void setListado(Anfibio[] listado) {
        Anfibio.listado = listado;
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

