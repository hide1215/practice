package codeex11_01;

public abstract class TangibleAsset{
	private String color;
	private int price;
	private String name;
	public TangibleAsset(String name, int price, String color) {
	this.color = color;
	this.price = price;
	this.name = name;
	}
	public String getColor() {return this.color;}
	public int getPrice(){return this.price;}
	public String getName(){return this.name;}
}
