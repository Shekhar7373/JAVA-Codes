package oops.weight;
import oops.box.*;
public class BoxWeight extends Box{
	private double weight;
	protected BoxWeight(){
		 this.weight = 0.0;
	}
	protected BoxWeight(double width,double height,double depth,double weight){
		super(width, height,depth);
		this.weight = weight;
	}
	protected BoxWeight(double x, double y){
		super(x);
		this.weight = y;
	}
}
