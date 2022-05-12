package model.entities;

public class Disciplina {
	
	private int iddisciplina;
	private String nomedisciplina;
	private int cargahoraria;
	
	public Disciplina() {
	}
		
	public Disciplina(int iddisciplina, String nomedisciplina, int cargahoraria) {
		this.iddisciplina = iddisciplina;
		this.nomedisciplina = nomedisciplina;
		this.cargahoraria = cargahoraria;
	}
	
	public int getIddisciplina() {
		return iddisciplina;
	}
	public void setIddisciplina(int iddisciplina) {
		this.iddisciplina = iddisciplina;
	}
	public String getNomedisciplina() {
		return nomedisciplina;
	}
	public void setNomedisciplina(String nomedisciplina) {
		this.nomedisciplina = nomedisciplina;
	}
	public int getCargahoraria() {
		return cargahoraria;
	}
	public void setCargahoraria(int cargahoraria) {
		this.cargahoraria = cargahoraria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cargahoraria;
		result = prime * result + iddisciplina;
		result = prime * result + ((nomedisciplina == null) ? 0 : nomedisciplina.hashCode());
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
		Disciplina other = (Disciplina) obj;
		if (cargahoraria != other.cargahoraria)
			return false;
		if (iddisciplina != other.iddisciplina)
			return false;
		if (nomedisciplina == null) {
			if (other.nomedisciplina != null)
				return false;
		} else if (!nomedisciplina.equals(other.nomedisciplina))
			return false;
		return true;
	}
	
}
