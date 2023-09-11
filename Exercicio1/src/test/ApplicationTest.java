package test;

import java.util.List;
import java.util.Scanner;
import logus.entities.Modelo;
import logus.entities.Posto;
import logus.entities.Veiculo;
import services.GasolinaEtanol;
import services.ReadFiles;

/**
 * @author Georges do Carmo Pereira
 *
 */
public class ApplicationTest {
	/**
	 * @param args - Método principal que vai solicitar os diretórios de veiculos.csv e modelos.csv.
	 * Vai criar uma lista do tipo Veiculo e uma lista do tipo Modelo
	 * Criar uma lista do tipo Posto com os dados de veiculo e posto
	 * Faz uma iteração de posto e imprimi os dados
	 * Cria uma String resumo para receber os dados do método somaValores e passa o a lista do tipo Posto
	 */
	public static void main(String[] args) {

		System.out.print("Entre com o diretório do arquivo VEICULOS: ");
		Scanner scanVeiculo = new Scanner(System.in);
		List<Veiculo> veiculos = ReadFiles.listarVeiculos(scanVeiculo.nextLine());

		System.out.print("Entre com o diretório do arquivo MODELOS: ");
		Scanner scanModelo = new Scanner(System.in);
		List<Modelo> modelos = ReadFiles.listarModelos(scanModelo.nextLine());

		System.out.println();

		List<Posto> posto = GasolinaEtanol.gasolinaOuEtanol(veiculos, modelos);

		System.out.println();
		System.out.print("Resultado da simulação:\n--------------------\n");

		for (Posto p : posto) {
			System.out.println(p);
		}

		String resumo = GasolinaEtanol.somaValores(posto);
		System.out.println();
		System.out.println(resumo);
	}

}
