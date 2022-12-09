package AV1POO;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

/**
 * 
 * @author Valdemiro Garcia
 *
 */

public class Atividade {

	public static void main(String[] args) {
		temperatureSensor();
		humiditySensor();
		carbonicSensor();
	}

	public static void temperatureSensor() {
		Calendar now = Calendar.getInstance();
		int line = 24;
		int l, x, assist;
		int[] matriz = new int[line];
		System.out.println("Leituras de Temperatura");

		for (l = 0; l < line; l++) {
			Random random = new Random();
			Integer insert = random.nextInt(15, 41);
			Format format = new SimpleDateFormat("HH:mm");
			now.add(Calendar.MINUTE, 30);
			format = new SimpleDateFormat("HH:mm");
			System.out.print(l + 1 + " - Hora Medição: " + format.format(now.getTime())
					+ " - Temperatura: ");
			matriz[l] = insert.intValue();
			System.out.print(matriz[l] + "°C\n");
		}

		for (l = 0; l < line; l++) {
			for (x = 0; x < line; x++) {
				if (matriz[l] < matriz[x]) {
					assist = matriz[l];
					matriz[l] = matriz[x];
					matriz[x] = assist;
				}
			}
		}
		System.out.println("\n---------- \nRelatório de medição - Temperatura \n");

		for (l = 0; l < line; l++) {
			System.out.printf("Temperatura: " + matriz[l] + "°C\n");
		}
	}

	public static void humiditySensor() {
		Calendar now = Calendar.getInstance();
		int line = 24;
		int l, x;
		int assist;
		int[] matriz = new int[line];
		System.out.println("\n---------- \nLeituras de Umidade");

		for (l = 0; l < line; l++) {
			Random random = new Random();
			Integer insert = random.nextInt(100);
			Format format = new SimpleDateFormat("HH:mm");
			now.add(Calendar.MINUTE, 30);
			format = new SimpleDateFormat("HH:mm");
			System.out.println(" ");
			System.out.print(l + 1 + " - Hora Medição: " + format.format(now.getTime())
					+ " - Umidade atual: ");
			// insert.useLocale(Locale.US);
			matriz[l] = insert.intValue();
			System.out.print(matriz[l] + " %");
		}

		for (l = 0; l < line; l++) {
			for (x = 0; x < line; x++) {
				if (matriz[l] > matriz[x]) {
					assist = matriz[l];
					matriz[l] = matriz[x];
					matriz[x] = assist;
				}
			}
		}
		System.out.println("\n\n---------- \nRelatório de medição - Umidade");

		for (l = 0; l < line; l++) {

			System.out.print("\nUmidade: " + matriz[l] + " %");
		}
	}

	public static void carbonicSensor() {
		Calendar now = Calendar.getInstance();
		// Scanner insert = new Scanner(System.in);
		int line = 24;
		int l, x;
		float assist;
		float[] matriz = new float[line];
		System.out.println("\n\n---------- \nLeituras de quantidades de Gás Carbônico (CO2)");

		for (l = 0; l < line; l++) {
			Random random = new Random();
			Double insert = random.nextDouble(0.05);
			Format format = new SimpleDateFormat("HH:mm");
			now.add(Calendar.MINUTE, 30);
			format = new SimpleDateFormat("HH:mm");
			System.out.println(" ");
			System.out.print(l + 1 + " - Hora Medição: " + format.format(now.getTime())
					+ " - Gás Carbônico atual: ");
			matriz[l] = insert.floatValue();
			System.out.printf("%.2f CO2", matriz[l]);

		}

		for (l = 0; l < line; l++) {
			for (x = 0; x < line; x++) {
				if (matriz[l] < matriz[x]) {
					assist = matriz[l];
					matriz[l] = matriz[x];
					matriz[x] = assist;
				}
			}
		}
		System.out.println("\n\n---------- \nRelatório de medição - Gás Carbônico (CO2) \n");

		for (l = 0; l < line; l++) {
			System.out.printf("\nGás Carbônico: %.2f CO2", matriz[l]);
		}
		System.out.println("\n---------- \nFIM DA EXECUÇÃO DO PROGRAMA");
	}
}