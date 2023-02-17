import java.util.Random;

public class OperaArraysDebugger {
	
	public static int tamano = 10;
	public static int[] uno = new int[tamano];
	public static int[] dos = new int[tamano];
	public static int[] tres = new int[tamano];

	public static void main(String[] args) {
		rellena(uno);
		rellena(dos);
		muestra(uno);
		muestra(dos);
		tres = suma(uno,dos);
		muestra(tres);
		tres = resta(uno,dos);
		muestra(tres);
		tres = multiplica(uno,dos);
		muestra(tres);
		tres = divide(uno,dos);
		muestra(tres);
	}
	
	public static void rellena(int[] a) {
		Random r = new Random();
		for(int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(20);
		}
	}
	
	public static void muestra(int[] a) {
		System.out.print("[");
		for(int i = 0; i < a.length-1; i++) {
			System.out.print(a[i]+",");
		}
		System.out.println(a[a.length-1]+"]");
	}
	
	public static int[] suma(int[] a, int[] b) {
		int[] c = new int[tamano];
		for(int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
		}
		return c;
	}
	public static int[] resta(int[] a, int[] b) {
		int[] c = new int[tamano];
		for(int i = 0; i < a.length; i++) {
			c[i] = a[i] - b[i];
		}
		return c;
	}
	public static int[] multiplica(int[] a, int[] b) {
		int[] c = new int[tamano];
		for(int i = 0; i < a.length; i++) {
			c[i] = a[i] * b[i];
		}
		return c;
	}
	public static int[] divide(int[] a, int[] b) {
		int[] c = new int[tamano];
		for(int i = 0; i < a.length; i++) {
			c[i] = a[i] / b[i];
		}
		return c;
	}

}
