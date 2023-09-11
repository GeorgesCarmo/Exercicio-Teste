package logus.entities;

/**
 * Objeto modelo será alimetado com os dados recebidos do arquivo modelos.csv
 * @author Georges do Carmo Pereira
 *
 */
public class Modelo {
	private String nome;
	private Double consumoEtanol;
	private Double consumoGasolina;
	private Integer capacidadeTanque;

	/**
	 * @param nome - Nome Modelo
	 * @param consumoEtanol - Consumo Etanol
	 * @param consumoGasolina - Consumo Gasolina
	 * @param capacidadeTanque - Capacidade Tanque
	 */
	public Modelo(String nome, Double consumoEtanol, Double consumoGasolina, Integer capacidadeTanque) {
		this.nome = nome;
		this.consumoEtanol = consumoEtanol;
		this.consumoGasolina = consumoGasolina;
		this.capacidadeTanque = capacidadeTanque;
	}


/**
 * @param nome do construtor 
 */
	public Modelo(String nome) {
		this.nome = nome;
	}

	/**
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome - nome modelo
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return consumo etanol
	 */
	public Double getConsumoEtanol() {
		return consumoEtanol;
	}

	/**
	 * @param consumoEtanol settar consumo etanol
	 */
	public void setConsumoEtanol(Double consumoEtanol) {
		this.consumoEtanol = consumoEtanol;
	}

	/**
	 * @return consumo gasolina
	 */
	public Double getConsumoGasolina() {
		return consumoGasolina;
	}

	/**
	 * @param consumoGasolina settar consumo gasolina
	 */
	public void setConsumoGasolina(Double consumoGasolina) {
		this.consumoGasolina = consumoGasolina;
	}

	/**
	 * @return capacidade do tanque
	 */
	public Integer getCapacidadeTanque() {
		return capacidadeTanque;
	}

	/**
	 * @param capacidadeTanque settar a capacidade do tanque de combustivel
	 */
	public void setCapacidadeTanque(Integer capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

}
