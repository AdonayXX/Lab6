package Ascensor;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Alejandra
 */
// 
public class Ascensor {
    private classPiso pisoActual;
    private direccionEnum direccion;
    private Queue<Llamada> llamadas;

    public Ascensor() {
        pisoActual = new classPiso(1);
        direccion = direccionEnum.INACTIVO;
        llamadas = new LinkedList<>();
    }

    public void llamar(classPiso piso, direccionEnum direccion) {
        llamadas.offer(new Llamada(piso, direccion));
        if (this.direccion == direccionEnum.INACTIVO) {
            this.direccion = direccion;
        }
    }

    public void mover() {
        if (llamadas.isEmpty()) {
            direccion = direccionEnum.INACTIVO;
            return;
        }

        Llamada siguienteLlamada = llamadas.poll();
        classPiso siguientePiso = siguienteLlamada.getPiso();
        direccion = siguienteLlamada.getDireccion();

        pisoActual = siguientePiso;
        System.out.println("El ascensor ha llegado a " + pisoActual);
    }

    public classPiso getPisoActual() {
        return pisoActual;
    }

    public direccionEnum getDireccion() {
        return direccion;
    }

    public Queue<Llamada> getLlamadas() {
        return llamadas;
    }
}
