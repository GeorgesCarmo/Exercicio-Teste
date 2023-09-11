package services;

import java.util.List;
import logus.entities.Modelo;
import logus.entities.Posto;
import logus.entities.Veiculo;
import java.util.ArrayList;

/**
 * @author Georges do Carmo Pereira
 *
 */
public class GasolinaEtanol {
	/**
	 * @param veiculos - Lista de veiculos
	 * @param modelos - Lista de modelos
	 * @return - Bomba preenchida com os parametros recebidos de veiculos e modelos
	 */
	public static List<Posto> gasolinaOuEtanol(List<Veiculo> veiculos, List<Modelo> modelos) {

		List<Posto> bomba = new ArrayList<>();

		for (Veiculo veiculo : veiculos) {
			for (Modelo modelo : modelos) {
				if (veiculo.getNome().equals(modelo.getNome())) {
					Posto posto = new Posto();
					posto.setNomeCarro(veiculo.getNome());
					posto.setPlaca(veiculo.getPlaca());
					posto.setQuantoAbasteceu(modelo.getCapacidadeTanque());
					if (modelo.getConsumoEtanol() != null) {
						posto.setBomba("ETANOL");
						posto.setMinuto(modelo.getCapacidadeTanque() / 12);
					} else {
						posto.setBomba("GASOLINA");
						posto.setMinuto(modelo.getCapacidadeTanque() / 10);
					}
					bomba.add(posto);
				}
			}
		}

		return bomba;

	}

	/**
	 * @param posto - Lista do tipo Posto
	 * @return - (resumo): Soma dos valores recebidos de GASOLINA E ETANOL após a iteração com posto
	 */
	public static String somaValores(List<Posto> posto) {

		long gasolina = 0;
		long etanol = 0;

		for (int i = 0; i < posto.size(); i++) {

			if (posto.get(i).getBomba() == "ETANOL") {
				etanol = etanol + posto.get(i).getQuantoAbasteceu();
			}
			if (posto.get(i).getBomba() == "GASOLINA") {
				gasolina = gasolina + posto.get(i).getQuantoAbasteceu();
			}
		}

		StringBuilder resumo = new StringBuilder();
		resumo.append("Resumo da simulação\n");
		resumo.append("--------------------\n");
		resumo.append("Total abastecido na bomba 1 (GASOLINA): " + gasolina + " litros\n");
		resumo.append("Total abastecido na bomba 2 (ETANOL): " + etanol + " litros\n");
		resumo.append("Total geral abastecido de GASOLINA: " + gasolina + " litros\n");
		resumo.append("Total abastecido de ETANOL " + etanol + " litros\n");
		return resumo.toString();

	}

}
