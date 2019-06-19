package model;

public class Festa {
	String cliente, aniversariante, tema, data, horaInicio, horaTermino;

	public Festa(String cliente, String aniversariante, String tema, String data, String horaInicio,
			String horaTermino) {
		this.cliente = cliente;
		this.aniversariante = aniversariante;
		this.tema = tema;
		this.data = data;
		this.horaInicio = horaInicio;
		this.horaTermino = horaTermino;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getAniversariante() {
		return aniversariante;
	}

	public void setAniversariante(String aniversariante) {
		this.aniversariante = aniversariante;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraTermino() {
		return horaTermino;
	}

	public void setHoraTermino(String horaTermino) {
		this.horaTermino = horaTermino;
	}
	
	
}
