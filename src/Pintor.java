
public class Pintor extends Thread{

	private Dibujo dibujo;
	private int velocidad;
	
	public Pintor(Dibujo dibujo, int velocidad) {
		this.dibujo = dibujo;
		this.velocidad = velocidad;
	}
	
	public void run() {
		for(int i=0 ; i<100;i++)
		{
			pinta();
			try {
				sleep(velocidad);
			} catch (InterruptedException e) {}
		}
	}
	private void pinta() {
		dibujo.pinta();
	}
}
