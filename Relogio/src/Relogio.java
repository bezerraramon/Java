/*
* Excecoes:
* hora fora do intervalo permitido
* minuto fora do intervalo permitido
* segundo fora do intervalo permitido
*
* Metodos (regras)
* setHora/Minuto/Segundo -> validar
* getHora() -> retorna a hora definida no formato: 0-12(AM/PM) se formato12 == true // 0-24 se formato12 == false
* getTurno() -> retorno a String AM ou PM dependendo da hora
* isFormato12() = getFormato12()
* 
*/

public class Relogio {
	private int hora, minuto, segundo;
	private boolean formato12 = false;
	private String turno;

	public void setHora(int hora) {
		if (hora < 0 || hora > 24) {
			throw new IllegalArgumentException("hora fora do intervalo permitido");
		}
		this.hora = hora;
		setTurno();
		if(hora > 12 && formato12) {
			hora -= 12;
		}
		this.hora = hora;
		
	}

	public boolean getFormato12() {
		return formato12;
	}
	
	public void setMinuto(int minuto) {
		if (minuto < 0 || minuto > 60) {
			throw new IllegalArgumentException("hora fora do intervalo permitido");
		}
		this.minuto = minuto;
	}

	public void setSegundo(int segundo) {
		if (segundo < 0 || segundo > 60) {
			throw new IllegalArgumentException("hora fora do intervalo permitido");
		}
;		this.segundo = segundo;
	}

	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setTurno() {
		if(getHora() < 12 && getHora() > 0) {
			this.turno = "AM";
		} else
			this.turno = "PM";
	}
	
	
	public String getTurno() {
	/*	if (getHora() < 12 && getHora() > 0) {
			return "AM";
		} else
			return "PM"; */
		return this.turno;
	}

	public void setFormato12(boolean f) {
		this.formato12 = f;
	}

	public boolean isFormato12() {
		if (formato12) {
			return true;
		} else
			return false;
	}

}
