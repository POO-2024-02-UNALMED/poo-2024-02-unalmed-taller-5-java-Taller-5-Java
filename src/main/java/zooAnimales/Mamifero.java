package zooAnimales;

public class Mamifero extends Animal {

    private static Mamifero[] listado = new Mamifero[0]; 
    public static int caballos = 0; 
    public static int leones = 0;  
    private Boolean pelaje;
    private Integer patas;

    public Mamifero() {
        agregarAlListado(this);
    }

    public Mamifero(String nombre, Integer edad, String habitat, String genero, Boolean pelaje, Integer patas) {
        super(nombre, edad, habitat, genero, null);
        this.pelaje = pelaje;
        this.patas = patas;
        agregarAlListado(this);
    }

    public static int cantidadMamiferos() {
        return listado.length;
    }

    public static Mamifero crearCaballo(String nombre, Integer edad, String genero) {
        Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
        caballos++;
        agregarAlListado(caballo);
        return caballo;
    }

    public static Mamifero crearLeon(String nombre, Integer edad, String genero) {
        Mamifero leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
        leones++;
        agregarAlListado(leon);
        return leon;
    }

    private static void agregarAlListado(Mamifero mamifero) {
        Mamifero[] nuevoListado = new Mamifero[listado.length + 1];
        for (int i = 0; i < listado.length; i++) {
            nuevoListado[i] = listado[i];
        }
        nuevoListado[listado.length] = mamifero;
        listado = nuevoListado;
    }

    public static String movimiento() {
        return "caminar";
    }

    // Getters y Setters
    public static Mamifero[] getListado() {
        return listado;
    }

    public static void setListado(Mamifero[] listado) {
        Mamifero.listado = listado;
    }

    public Boolean getPelaje() {
        return pelaje;
    }

    public void setPelaje(Boolean pelaje) {
        this.pelaje = pelaje;
    }

    public Integer getPatas() {
        return patas;
    }

    public void setPatas(Integer patas) {
        this.patas = patas;
    }
}

