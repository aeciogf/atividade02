package modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "SEQ_VEICULO", initialValue=1, allocationSize=1, sequenceName="seq_veiculo")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_veiculo", discriminatorType = DiscriminatorType.INTEGER)
@DiscriminatorValue("0")
public class Veiculo implements Serializable {
	@Id
	@Column(name="id_veiculo")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="SEQ_VEICULO")
	private int id;
	private String placa;
	private String modelo;
	private int ano;
	private String cor;
	private Date dataFabricacao;
	private int valorDiaria;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Date getDataFabricacao() {
		return dataFabricacao;
	}
	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	public int getValorDiaria() {
		return valorDiaria;
	}
	public void setValorDiaria(int valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
}
