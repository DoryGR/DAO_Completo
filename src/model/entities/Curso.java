package model.entities;

public class Curso {
	
	private Integer idcurso;
	private String nomeCurso;
	
	public Curso() {

	}
	
	public Curso(Integer idcurso, String nomecurso) {
		this.idcurso = idcurso;
		this.nomeCurso = nomecurso;
	}

	public Integer getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(Integer idcurso) {
		this.idcurso = idcurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomecurso) {
		this.nomeCurso = nomecurso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idcurso == null) ? 0 : idcurso.hashCode());
		result = prime * result + ((nomeCurso == null) ? 0 : nomeCurso.hashCode());
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
		Curso other = (Curso) obj;
		if (idcurso == null) {
			if (other.idcurso != null)
				return false;
		} else if (!idcurso.equals(other.idcurso))
			return false;
		if (nomeCurso == null) {
			if (other.nomeCurso != null)
				return false;
		} else if (!nomeCurso.equals(other.nomeCurso))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Curso [idcurso=" + idcurso + ", nomecurso=" + nomeCurso + "]";
	}
	
}
