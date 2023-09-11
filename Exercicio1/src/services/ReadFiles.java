package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

import logus.entities.Modelo;
import logus.entities.Veiculo;

/**
 * Essa classe vai receber os diretórios de veiculos.csv e modelos.csv vindos da classe Application, vai ler os arquivos,
 * criar os objetos Veiculo e Modelo e inserir os objetos em suas determinadas listas
 * @author Georges do Carmo Pereira
 *
 */
public class ReadFiles {

	/**
	 * @param pathVeiculos - diretório do arquivo veiculos.csv vindo da classe Application
	 * @return - (listVeiculos): Lista de veiculos apos a leitura do arquivo veiculos.csv 
	 */
	public static List<Veiculo> listarVeiculos (String pathVeiculos){
		List<Veiculo> listVeiculos = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(pathVeiculos))) {
			String line = br.readLine();
			line = br.readLine();
			while(line != null) {
				String[] vetor = line.split(";");
				
				String nome = vetor[0];
				String placa = vetor[1];
				
				Veiculo veiculo = new Veiculo(nome, placa);
				listVeiculos.add(veiculo);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Erro: "+e.getMessage());
		}
		
		return listVeiculos;
	}

	/**
	 * @param pathModelo - diretório do arquivo modelos.csv vindo da classe Application
	 * @return - (listModelos): Lista de modelos apos a leitura do arquivo modelos.csv
	 */
	public static List<Modelo> listarModelos(String pathModelo) {
		List<Modelo> listModelos = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(pathModelo))) {
			String line = br.readLine();
			line = br.readLine();
			while (line != null) {
				String[] vetor = line.split(";");

				String nome = vetor[0];
				Double consumoEtanol;
				if (!Objects.equals(vetor[1], "")) {
					consumoEtanol = Double.valueOf(vetor[1].replace(",", "."));
				} else {
					consumoEtanol = null;
				}
				Double consumoGasolina = Double.valueOf(vetor[2].replace(",", "."));
				Integer capacidadeTanque = Integer.parseInt(vetor[3]);

				Modelo modelo = new Modelo(nome, consumoEtanol, consumoGasolina, capacidadeTanque);

				listModelos.add(modelo);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		return listModelos;
	}
}
