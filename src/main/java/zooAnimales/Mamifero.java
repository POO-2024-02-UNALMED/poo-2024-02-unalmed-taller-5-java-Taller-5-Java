package zooAnimales;

public class Mamifero extends Animal {

    private Mamifero[] listado = new Mamifero[0];
    public int caballos = 0;
    public int leones = 0;
    private Boolean pelaje;
    private Integer patas;

    public Mamifero() {
        agregarAlListado(this);
    }
    public Mamifero(String nombre, String habitat, String genero, Boolean pelaje, Integer patas) {
        super(nombre, habitat, genero, null);
        this.pelaje = pelaje;
        this.patas = patas;
        agregarAlListado(this);
    }
    public int cantidadMamiferos() {
        return listado.length;
    }

    public Mamifero crearCaballo(String nombre, String genero) {
        Mamifero caballo = new Mamifero(nombre, "pradera", genero, true, 4);
        caballos++;
        agregarAlListado(caballo);
        return caballo;
    }

    public Mamifero crearLeon(String nombre, String genero) {
        Mamifero leon = new Mamifero(nombre, "selva", genero, true, 4);
        leones++;
        agregarAlListado(leon);
        return leon;
    }
    private void agregarAlListado(Mamifero mamifero) {
        Mamifero[] nuevoListado = new Mamifero[listado.length + 1];
        for (int i = 0; i < listado.length; i++) {
            nuevoListado[i] = listado[i];
        }
        nuevoListado[listado.length] = mamifero;
        listado = nuevoListado;
    }

    // Getters y Setters
    public Mamifero[] getListado() {
        return listado;
    }

    public void setListado(Mamifero[] listado) {
        this.listado = listado;
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

