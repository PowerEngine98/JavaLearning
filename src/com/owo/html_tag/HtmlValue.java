package com.owo.html_tag;

public class HtmlValue extends Html {

	private String valor;

	public HtmlValue(String nombre, String valor){
		super(nombre);
		this.valor = valor;
	} 

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		if (valor == null) {
			throw new IllegalArgumentException("El valor no puede ser null");
		}
		this.valor = valor;
	}

	@Override
	public String toString() {
		return toHtml();
	}

	@Override
	public String toHtml() {
		return getTab() + getOpening() + valor + getEnding(); 
	}

}
