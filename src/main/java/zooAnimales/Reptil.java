package zooAnimales;

public class Reptil extends Animal {

    private static Reptil[] listado = new Reptil[0];  
    public static int iguanas = 0;   
    public static int serpientes = 0; 
    private String colorEscamas;
    private int largoCola;

    public Reptil() {
        agregarAlListado(this);
    }

    public Reptil(String nombre, Integer edad, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero, null);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        agregarAlListado(this);
    }

    public static int cantidadReptiles() {  
        return listado.length;
    }

    public static Reptil crearIguana(String nombre, Integer edad, String genero) {
        Reptil iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
        iguanas++;
        agregarAlListado(iguana);
        return iguana;
    }

    public static Reptil crearSerpiente(String nombre, Integer edad, String genero) {  
        Reptil serpiente = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
        serpientes++;
        agregarAlListado(serpiente);
        return serpiente;
    }

    private static void agregarAlListado(Reptil reptil) { 
        Reptil[] nuevoListado = new Reptil[listado.length + 1];
        for (int i = 0; i < listado.length; i++) {
            nuevoListado[i] = listado[i];
        }
        nuevoListado[listado.length] = reptil;
        listado = nuevoListado;
    }

    public static String movimiento() {  
        return "reptar";
    }

    // Getters y Setters
    public static Reptil[] getListado() { 
        return listado;
    }

    public static void setListado(Reptil[] listado) { 
        Reptil.listado = listado;
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
