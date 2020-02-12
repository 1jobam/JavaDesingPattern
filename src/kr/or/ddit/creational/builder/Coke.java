package kr.or.ddit.creational.builder;

public class Coke extends ColdDrink{

	@Override
	public String name() {
		return "코크";
	}

	@Override
	public float price() {
		return 1.5f;
	}

}
