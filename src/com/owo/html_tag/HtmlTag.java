package com.owo.html_tag;

public interface HtmlTag {
	
	public String getNombre();
	public void setNombre(String nombre);
	public String toHtml();
	public HtmlTag getParent();
	public void setParent(HtmlTag parent);
	public int getLevel(); 
	
}
