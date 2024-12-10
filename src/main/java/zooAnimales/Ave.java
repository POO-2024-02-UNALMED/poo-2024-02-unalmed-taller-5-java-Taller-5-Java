package zooAnimales;

public class Ave extends Animal {

    private Ave[] listado = new Ave[0];
    public int halcones = 0;
    public int aguilas = 0;
    private String colorPlumas;
    public Ave() {
        agregarAlListado(this);
    }


    public Ave(String nombre,Integer edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero, null);
        this.colorPlumas = colorPlumas;
        agregarAlListado(this);
    }

    public int cantidadAves() {
        return listado.length;
    }

    public Ave crearHalcon(String nombre,Integer edad, String genero) {
        Ave halcon = new Ave(nombre,edad, "montanas", genero, "cafe glorioso");
        halcones++;
        agregarAlListado(halcon);
        return halcon;
    }

    public Ave crearAguila(String nombre, Integer edad, String genero) {
        Ave aguila = new Ave(nombre,edad, "montanas", genero, "blanco y amarillo");
        aguilas++;
        agregarAlListado(aguila);
        return aguila;
    }
    private void agregarAlListado(Ave ave) {
        Ave[] nuevoListado = new Ave[listado.length + 1];
        for (int i = 0; i < listado.length; i++) {
            nuevoListado[i] = listado[i];
        }
        nuevoListado[listado.length] = ave;
        listado = nuevoListado;
    }

    public String movimiento() {
        return "volar";
    }

    // Getters y Setters
    public Ave[] getListado() {
        return listado;
    }

    public void setListado(Ave[] listado) {
        this.listado = listado;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
}

