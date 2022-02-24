package ejercicioTrigonometria;

public class Triangulo extends Figura{
	
	private int base, altura;

    public Triangulo(int base, int altura){
        this.setAltura(altura);
        this.setBase(base);
    }

    public Triangulo(){}

    @Override
    public double calcularArea() {
        return 0;
    }

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

}
