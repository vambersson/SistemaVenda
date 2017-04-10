package classe.cliente;

import classe.base.Pessoa;

public class Cliente extends Pessoa {

	private Integer codigo;

	private char tipo; // J = Jurica F = Física

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

}
