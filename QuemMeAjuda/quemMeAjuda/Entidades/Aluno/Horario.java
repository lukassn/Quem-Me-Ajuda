package quemMeAjuda.Entidades.Aluno;

import java.io.Serializable;

public class Horario implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8287375288579395764L;
	private String horario, dia;

	public Horario(String horario, String dia) {
		this.horario = horario;
		this.dia = dia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dia == null) ? 0 : dia.hashCode());
		result = prime * result + ((horario == null) ? 0 : horario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Horario other = (Horario) obj;
		if (dia == null) {
			if (other.dia != null)
				return false;
		} else if (!dia.equals(other.dia))
			return false;
		if (horario == null) {
			if (other.horario != null)
				return false;
		} else if (!horario.equals(other.horario))
			return false;
		return true;
	}

	public String getHorario() {
		return horario;
	}

	public String getDia() {
		return dia;
	}
}
