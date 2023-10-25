
public class PessoaJuridica extends Pessoa {

	private String cnpj;
	private String RazaoSocial;
	private int renda;
	private String Insccmunicipal;
	private String InscEstadual;
	private int CapitalSocial;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return RazaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		RazaoSocial = razaoSocial;
	}

	public int getRenda() {
		return renda;
	}

	public void setRenda(int renda) {
		this.renda = renda;
	}

	public String getInsccmunicipal() {
		return Insccmunicipal;
	}

	public void setInsccmunicipal(String insccmunicipal) {
		Insccmunicipal = insccmunicipal;
	}

	public String getInscEstadual() {
		return InscEstadual;
	}

	public void setInscEstadual(String inscEstadual) {
		InscEstadual = inscEstadual;
	}

	public int getCapitalSocial() {
		return CapitalSocial;
	}

	public void setCapitalSocial(int capitalSocial) {
		CapitalSocial = capitalSocial;
	}

}
