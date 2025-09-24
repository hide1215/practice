package codeex11_01;

public abstract class TangibleAsset{
	String color;
	public TangibleAsset(String name, int price, String color) {
	super(name, price);
	this.color = color;
	}
	public String color() {return this.color;}
}
