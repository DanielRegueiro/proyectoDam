package modeloVista;

public class ArmaSel {
	
	private String id;
	private int numeroIdArma;

	public ArmaSel() {
	}

	public ArmaSel(long id) {

		this.id = "";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getNumeroIdArma() {
		return numeroIdArma;
	}

	public void setNumeroIdArma(int numeroIdArma) {
		this.numeroIdArma = numeroIdArma;
	}

	@Override
	public String toString() {
		return "ArmaSel [id=" + id + ", numeroIdArma=" + numeroIdArma + "]";
	}

}
