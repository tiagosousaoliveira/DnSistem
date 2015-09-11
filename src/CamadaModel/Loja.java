package CamadaModel;

public class Loja {
	
	private  int Id; 	
	private  String razao ;	
	private  String data_cadastro; 
	private  String endereco 	;
	private  String numero	;	
	private  String obs ;
	private  String complemento;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getRazao() {
		return razao;
	}
	public void setRazao(String razao) {
		this.razao = razao;
	}
	public String getData_cadastro() {
		return data_cadastro;
	}
	public void setData_cadastro(String data_cadastro) {
		this.data_cadastro = data_cadastro;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

}
