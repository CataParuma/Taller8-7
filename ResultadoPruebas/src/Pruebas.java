import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {

		int prueba[] = new int[5];
		int promedio = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {

			System.out.println("Digite resultado prueba #" + (i + 1));
			prueba[i] = sc.nextInt();
		}

		promedio = (prueba[0] + prueba[1] + prueba[2] + prueba[3] + prueba[4]) / 5;
		System.out.println("El promedio de las pruebas es: " + promedio);
	}
}

