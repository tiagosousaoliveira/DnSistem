package CamadaModel;

public class Usuario {
	
	private int	   	Id; 
	private String	data;
	private String 	nome; 	
	private String 	endereco; 
	private String 	telefone; 	
	private String 	codigo_loja; 	
	private String 	loja; 		
	private String 	funcao; 		
	private String 	logon; 		
	private String 	senha;		
	private String 	comissao; 	
	private String 	vendas; 		
	private String 	metas; 	
	private String 	cpf; 
	private String 	rg; 
	private boolean	inativo;

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCodigo_loja() {
		return codigo_loja;
	}
	public void setCodigo_loja(String codigo_loja) {
		this.codigo_loja = codigo_loja;
	}
	public String getLoja() {
		return loja;
	}
	public void setLoja(String loja) {
		this.loja = loja;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public String getLogon() {
		return logon;
	}
	public void setLogon(String logon) {
		this.logon = logon;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getComissao() {
		return comissao;
	}
	public void setComissao(String comissao) {
		this.comissao = comissao;
	}
	public String getVendas() {
		return vendas;
	}
	public void setVendas(String vendas) {
		this.vendas = vendas;
	}
	public String getMetas() {
		return metas;
	}
	public void setMetas(String metas) {
		this.metas = metas;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public boolean getInativo() {
		return inativo;
	}
	public void setInativo(boolean b) {
		this.inativo = b;
	}


}
