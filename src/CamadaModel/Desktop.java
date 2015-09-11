package CamadaModel;

public class Desktop {

	private int	   Id;
	private int    Registro;
	private String local_estoque;
	private String cores;
	private String observacao;
	private String quantidade;
	private String modelo;
	private String combo;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getRegistro() {
		return Registro;
	}
	public void setRegistro(int registro) {
		Registro = registro;
	}
	public String getLocal_estoque() {
		return local_estoque;
	}
	public void setLocal_estoque(String local_estoque) {
		this.local_estoque = local_estoque;
	}
	public String getCores() {
		return cores;
	}
	public void setCores(String cores) {
		this.cores = cores;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCombo() {
		return combo;
	}
	public void setCombo(String combo) {
		this.combo = combo;
	}
}
