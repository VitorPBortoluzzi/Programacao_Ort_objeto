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
	
//	Para usar vários sócios
//   private ArrayList<Pessoa> socios;
//	 public PessoaJuridica(String nome, int idade, String CNPJ, String dtAbertura) {
//	        this.nome = nome;
//	        this.idade = idade;
//	        this.CNPJ = CNPJ;
//	        this.dtAbertura = dtAbertura;
//	        this.socios = new ArrayList<>();
//	    }
//	// Adicionar sócio
//    public void addSocio(Pessoa p) {
//        socios.add(p);
//    }
//
//    // Listar sócios
//    public ArrayList<Pessoa> getSocios() {
//        return socios;
//    }
//
//    @Override
//    public String toString() {
//        return "Empresa: " + nome +
//               "\nCNPJ: " + CNPJ +
//               "\nSócios: " + socios;
//    }
}
