package jdbcflusao;

public class Func {
	private int codigo;
	private String nome;
	private String cargo;
	private String end;
	
	public Func(int codigo, String nome, String cargo, String end) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cargo = cargo;
		this.end = end;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

}
