package clases;

public class Rectangulo {
	private int base;
	private int altura;
	
	/**
	 * Constructor que crea un rectangulo dadas la base y la altura
	 * @param base	la base del rectangulo
	 * @param altura	la base del rectangulo
	 */
	public Rectangulo(int base, int altura) {
		this.base=base;
		this.altura=altura;
	}
	
	/**
	 * Calcula el area del rectangulo
	 * @return	el area del rectangulo
	 */
	public int area() {
		return base * altura;
	}
	
	/**
	 * Calcula el perimetro del rectangulo
	 * @return	el perimetro del rectangulo
	 */
	public int perimetro() {
		return 2*base + 2*altura;
	}
}
