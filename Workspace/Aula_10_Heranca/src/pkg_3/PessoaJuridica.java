package pkg_3;

public class PessoaJuridica extends Pessoa{
	private String CNPJ;
	private Pessoa socio;
	private String dtAbertura;
	
	public PessoaJuridica(String nome,int idade,String cnpj, Pessoa socio, String dtAbertura) {
		super(nome,idade);
		this.CNPJ = cnpj;
		this.socio = socio;
		this.dtAbertura = dtAbertura;
	}
	
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public Pessoa getSocio() {
		return socio;
	}

	public void setSocio(Pessoa socio) {
		this.socio = socio;
	}

	public String getDtAbertura() {
		return dtAbertura;
	}
	public void setDtAbertura(String dtAbertura) {
		this.dtAbertura = dtAbertura;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [CNPJ=" + CNPJ + ", socio=" + socio + ", dtAbertura=" + dtAbertura + "]";
	}
	
}
