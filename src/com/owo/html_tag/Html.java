package com.owo.html_tag;

public abstract class Html implements HtmlTag {
	
	private static final String TAB = "   ";
	protected HtmlTag parent;
	protected String nombre;
	
	public Html(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public void setNombre(String nombre) {
		if (nombre == null) {
			throw new IllegalArgumentException("El nombre no puede ser null");
		}
		this.nombre = nombre;
	}
	
	@Override
	public HtmlTag getParent() {
		return parent;
	}
	
	@Override
	public void setParent(HtmlTag parent) {
		this.parent = parent;
	}
	
	@Override
	public int getLevel() {
		return parent == null ? 0 : parent.getLevel() + 1;
	}
	
	protected String getTab() {
		String tab = new String();
		for (int i = 0; i < getLevel(); i++) {
			tab += TAB;
		}
		return tab;
	}
	
	protected String getOpening() {
		return "<" + nombre + ">";
	}
	
	protected String getEnding() {
		return "</" + nombre + ">";
	}
	
}
