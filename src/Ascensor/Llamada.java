package Ascensor;

/**
 *
 * @author abiga
 */
public class Llamada {
    private classPiso piso;
    private direccionEnum direccion;

    public Llamada(classPiso piso, direccionEnum direccion) {
        this.piso = piso;
        this.direccion = direccion;
    }

    public classPiso getPiso() {
        return piso;
    }

    public direccionEnum getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Llamada desde " + piso + " para ir hacia " + direccion;
    }
}

