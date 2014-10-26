package example;

public interface Visitor {

	public double visit(Liquor liquorItem);
	public double visit(Tobacco TobaccoItem);
	public double visit(Necessity necessityItem);

}
