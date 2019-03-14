package com.owo.html_tag;

public class Test {

	public static void main(String[] args) {
		System.out.println(getTag().toHtml());
	}
	
	public static HtmlTag getTag(){
		HtmlParent westeros = new HtmlParent("Westeros");
		HtmlParent starks = new HtmlParent("Starks");
		HtmlParent ned = new HtmlParent("Eddard Stark");
		ned.addHijo(new HtmlValue("Robb", "The king in the nort!"));
		ned.addHijo(new HtmlValue("Sansa", "<3"));
		ned.addHijo(new HtmlValue("Arya", "Sticking with the pointy end"));
		ned.addHijo(new HtmlValue("Brandon", "The three eye raven"));
		ned.addHijo(new HtmlValue("Rickon", "Running straight to the grave"));
		starks.addHijo(ned);
		westeros.addHijo(starks);
		return westeros;
	}
	
}
