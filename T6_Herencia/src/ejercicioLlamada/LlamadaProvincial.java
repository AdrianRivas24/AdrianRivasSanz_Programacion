package ejercicioLlamada;

public class LlamadaProvincial extends Llamada{
	
	public LlamadaProvincial(long nOrigen, long nDestino, int duracion){
        super();
    }

    @Override
    protected void calcularCoste() {
        this.coste = this.duracion *0.15;
    }

}
