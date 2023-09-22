import java.util.Timer;

public class SimulaciónVehiculos {

	public static void main(String[] args) {
		Dibujo maqueta = new Dibujo("Practica 2 Actividad 4",800,600);
		
		Pintor pintor = new Pintor(maqueta, 145);
		pintor.setPriority(9);
		
		pintor.start();
		
		Circuito c1 = new Circuito(100,50,60,25,10);
		Circuito c2 = new Circuito(250,100,30,20,10);
		Circuito c3 = new Circuito(50,300,70,25,10);
		Circuito c4 = new Circuito(200,300,40,20,10);
        
        c1.pinta(maqueta,ColorFig.azul);
        c2.pinta(maqueta,ColorFig.azul);
        c3.pinta(maqueta,ColorFig.azul);
        c4.pinta(maqueta,ColorFig.azul);
      
        
        Vehiculo v1 = new Vehiculo(c1,true,0,450,ColorFig.rojo,ColorFig.azul,maqueta);
        Vehiculo v2 = new Vehiculo(c2,true,0,1350,ColorFig.naranja,ColorFig.azul,maqueta);
        Vehiculo v3 = new Vehiculo(c3,true,0,2700,ColorFig.amarillo,ColorFig.azul,maqueta);
        Vehiculo v4 = new Vehiculo(c4,true,0,5400,ColorFig.verde,ColorFig.azul,maqueta);
        
        Vehiculo v5 = new Vehiculo(c1,false,0,290,ColorFig.rosa,ColorFig.azul,maqueta);
        Vehiculo v6 = new Vehiculo(c2,false,0,1010,ColorFig.gris,ColorFig.azul,maqueta);
        Vehiculo v7 = new Vehiculo(c3,false,0,2170,ColorFig.magenta,ColorFig.azul,maqueta);
        Vehiculo v8 = new Vehiculo(c4,false,0,5130,ColorFig.negro,ColorFig.azul,maqueta);

        Timer timer = new Timer();
        
        timer.scheduleAtFixedRate(v1,0,45);
        timer.scheduleAtFixedRate(v2,0,1350);
        timer.scheduleAtFixedRate(v3,0,2700);
        timer.scheduleAtFixedRate(v4,0,5400);
        timer.scheduleAtFixedRate(v5,0,290);
        timer.scheduleAtFixedRate(v6,0,1010);
        timer.scheduleAtFixedRate(v7,0,2170);
        timer.scheduleAtFixedRate(v8,0,5130);
		 
	}
}
