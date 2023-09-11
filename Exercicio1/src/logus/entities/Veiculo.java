package logus.entities;

/**
 * Objeto Veiculo será alimentado com os dados do arquivo veiculos.csv
 * @author Georges do Carmo Pereira
 *
 */
public class Veiculo extends Modelo {
	private String placa;

	/**
	 * @param nome Nome Veiculo
	 * @param placa Placa Veiculo
	 */
	public Veiculo(String nome, String placa) {
		super(nome);
		this.placa = placa;
	}

	/**
	 * @return placa veiculo
	 */
	public String getPlaca() {
		return placa;
	}

	/**
	 * @param placa settar 
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}

}
