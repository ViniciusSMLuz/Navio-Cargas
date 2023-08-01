import java.util.*;
public class Mercadoria {

	double peso;
	String cnpj;
	String nome;
	String destino;

	public Mercadoria() {

	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	@Override
	public String toString() {

		String aux = "";

		aux += "Empresa : " + getNome() + "\n";
		aux += "Cnpj : " + getCnpj() + "\n";
		aux += "Destino : " + getDestino() + "\n";
		aux += "Peso : " + getPeso() + "\n";
		return aux;
	}

	@Override
	public boolean equals(Object obj) {

		Mercadoria mercadoria = (Mercadoria) obj;

		if (mercadoria.getCnpj().equals(this.getCnpj())) {
			return true;
		}else {
			return false;
		}
	}

}

