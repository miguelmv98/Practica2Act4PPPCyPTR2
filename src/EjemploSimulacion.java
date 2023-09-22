
/**
 * Clase principal con ejemplo de simulación de movimiento por un circuito
 * en el que se reccorren 100 posiciones sin llegar a completar una vuelta
 * 
 * @author (J. Javier Gutierrez) 
 * @version (Septiembre 2023)
 */


public class EjemploSimulacion
{
    
    public static void main(String[] args) {

        Dibujo maqueta=new Dibujo("Ejemplo de simulacion de movimiento",800,600);
        
        Circuito c=new Circuito(100,100,40,25,15);
        
        c.pinta(maqueta,ColorFig.azul);
        
        // Pinta posicion inicial
        c.punto(0).pinta(maqueta,ColorFig.rojo);
        
        // Recorre 100 posiciones en el circuito
        for (int i=1; i<=100; i++)
        {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
            c.punto(i-1).pinta(maqueta,ColorFig.azul);
            c.punto(i).pinta(maqueta,ColorFig.rojo);
            maqueta.pinta();
        }
    }
      
}
