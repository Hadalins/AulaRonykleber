
public class PessoaFisica extends Pessoa {

	private int Rg;
	private int cpf;
	private int altura;
	private String cor;
	private String sexo;
	private int cnh;
	private String EstadoCivil;
	private String Filhos;
	private String NomeMae;
	private String NomePai;

	public int getRg() {
		return Rg;
	}

	public void setRg(int rg) {
		Rg = rg;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getCnh() {
		return cnh;
	}

	public void setCnh(int cnh) {
		this.cnh = cnh;
	}

	public String getEstadoCivil() {
		return EstadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		EstadoCivil = estadoCivil;
	}

	public String getFilhos() {
		return Filhos;
	}

	public void setFilhos(String filhos) {
		Filhos = filhos;
	}

	public String getNomeMae() {
		return NomeMae;
	}

	public void setNomeMae(String nomeMae) {
		NomeMae = nomeMae;
	}

	public String getNomePai() {
		return NomePai;
	}

	public void setNomePai(String nomePai) {
		NomePai = nomePai;
	}

}
