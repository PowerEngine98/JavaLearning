package com.owo.html_tag;

import java.util.LinkedList;
import java.util.List;

public class HtmlParent extends Html{

	private List<HtmlTag> hijos;
	
	public HtmlParent(String nombre) {
		super(nombre);
		hijos = new LinkedList<>();
	}

	public void addHijo(HtmlTag hijo) {
		hijo.setParent(this);
		hijos.add(hijo);
	}
	
	public List<HtmlTag> getHijos(){
		return hijos;
	}
	
	@Override
	public String toString() {
		return toHtml();
	}
	
	@Override
	public String toHtml() {
		String html = getTab() + getOpening() + "\n";
		for (HtmlTag htmlTag : hijos) {
			html += getTab() + htmlTag.toHtml() + "\n";
		}
		html += getTab() + getEnding();
		return html; 
	}
	
}
