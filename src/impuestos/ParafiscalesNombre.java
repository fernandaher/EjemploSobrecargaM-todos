package impuestos;


import constantes.ParafiscalesEnteros;

//clase hija heredar parafiscales
public class ParafiscalesNombre extends Parafiscales{

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
