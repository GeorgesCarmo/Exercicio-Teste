package logus.entities;

/**
 * Essa classe vai receber os dados após a iteração de veiculo e modelo conforme a lógica da classe
 * @author Georges do Carmo Pereira
 *
 */
public class Posto {
	private Integer minuto;
	private String nomeCarro;
	private String placa;
	private int quantoAbasteceu;
	private String bomba;

	/**
	 * @return
	 */
	public Integer getMinuto() {
		return minuto;
	}

	/**
	 * @param minuto
	 */
	public void setMinuto(Integer minuto) {
		this.minuto = minuto;
	}

	/**
	 * @return
	 */
	public String getNomeCarro() {
		return nomeCarro;
	}

	/**
	 * @param nomeCarro
	 */
	public void setNomeCarro(String nomeCarro) {
		this.nomeCarro = nomeCarro;
	}

	/**
	 * @return
	 */
	public String getPlaca() {
		return placa;
	}

	/**
	 * @param placa
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	/**
	 * @return
	 */
	public int getQuantoAbasteceu() {
		return quantoAbasteceu;
	}

	/**
	 * @param quantoAbasteceu
	 */
	public void setQuantoAbasteceu(int quantoAbasteceu) {
		this.quantoAbasteceu = quantoAbasteceu;
	}

	/**
	 * @return
	 */
	public String getBomba() {
		return bomba;
	}

	/**
	 * @param bomba
	 */
	public void setBomba(String bomba) {
		this.bomba = bomba;
	}
	
	/**
	 * Será chamado quando fizermos a iteração de posto
	 */
	@Override
	public String toString() {
		return "[" + String.format("00:0%d", minuto) + "] veiculo modelo " + nomeCarro + ", placa" + placa
				+ " foi abastecido com " + quantoAbasteceu + " litros de " + bomba;
	}

}
