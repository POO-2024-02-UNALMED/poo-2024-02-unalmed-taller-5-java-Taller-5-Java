package zooAnimales;

public class Pez extends Animal {

    private static Pez[] listado = new Pez[0];  
    public static int salmones = 0;  
    public static int bacalaos = 0;  
    private String colorEscamas;
    private int cantidadAletas;

    public Pez() {
        agregarAlListado(this);
    }

    public Pez(String nombre, Integer edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero, null);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        agregarAlListado(this);
    }

    public static int cantidadPeces() {
        return listado.length;
    }

    public static Pez crearSalmon(String nombre, Integer edad, String genero) {
        Pez salmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
        salmones++;
        agregarAlListado(salmon);
        return salmon;
    }

    public static Pez crearBacalao(String nombre, Integer edad, String genero) {
        Pez bacalao = new Pez(nombre, edad, "oceano", genero, "gris", 6);
        bacalaos++;
        agregarAlListado(bacalao);
        return bacalao;
    }

    private static void agregarAlListado(Pez pez) {
        Pez[] nuevoListado = new Pez[listado.length + 1];
        for (int i = 0; i < listado.length; i++) {
            nuevoListado[i] = listado[i];
        }
        nuevoListado[listado.length] = pez;
        listado = nuevoListado;
    }

    public static String movimiento() {
        return "nadar";
    }

    // Getters y Setters
    public static Pez[] getListado() {
        return listado;
    }

    public static void setListado(Pez[] listado) {
        Pez.listado = listado;
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
