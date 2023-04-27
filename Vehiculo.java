package Ejemplo2;

import javax.swing.plaf.PanelUI;

public interface Vehiculo {
    // Se pueden reutilizar estas variables
    public static final int VELOCIDAD_MAXIMA = 160;
    public static final char CLASIFICACION_EFICIENCIA = 'A';

    public boolean encender();
    public boolean apagar();
    public void avanzar();
    public void frenar();
    // se implementa en otras coases, no metodos
}
