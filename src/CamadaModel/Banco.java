package CamadaModel;

public class Banco {
	
	private  int 	Id;	
	private  String nome ;	
	private  String agencia;
	private  String conta;	
	private  String obs	;
	private  String data_cadastro ;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	public String getData_cadastro() {
		return data_cadastro;
	}
	public void setData_cadastro(String data_cadastro) {
		this.data_cadastro = data_cadastro;
	}	

}
