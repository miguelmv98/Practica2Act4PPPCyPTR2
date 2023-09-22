import java.util.TimerTask;

public class Vehiculo extends TimerTask{
	
	private Circuito circuito;
	// true para horario false para antihoriario
	private boolean sentidoHorario;
	private int posicionActual;
	//en milisegundos
	private int velocidad;
	private ColorFig color;
	private ColorFig colorCircuito;
	private Dibujo dibujo;

	public Vehiculo(Circuito circuito, boolean sentidoHorario, int posicionActual, int velocidad, ColorFig color,
			ColorFig colorCircuito, Dibujo dibujo) {
		super();
		this.circuito = circuito;
		this.sentidoHorario = sentidoHorario;
		this.posicionActual = posicionActual;
		this.velocidad = velocidad;
		this.color = color;
		this.colorCircuito = colorCircuito;
		this.dibujo = dibujo;
		
		ActualizarColorPosActual(color);
	}
	
	public void run() {
			Avanza();
	}
	
	public void Avanza() 
	{
		ActualizarColorPosActual(colorCircuito);
		posicionActual = SiguientePosicion();
		ActualizarColorPosActual(color);
	}
	
	private void ActualizarColorPosActual(ColorFig color) {
		circuito.punto(posicionActual).pinta(dibujo, color);
	}
	
	private int SiguientePosicion() {
		int longitudCircuito = circuito.longitud();
		int nuevaPosicion;
		
		if(sentidoHorario) {
			nuevaPosicion = posicionActual+1;
			if(nuevaPosicion >= longitudCircuito) {
				nuevaPosicion = 0;
			}
		}else {
			nuevaPosicion = posicionActual-1;
			if(nuevaPosicion < 0) {
				nuevaPosicion = longitudCircuito-1;
			}
		}
		
		return nuevaPosicion;
	}

}
