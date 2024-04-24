package oops.shipment;
import oops.weight.*;

public class Shipment extends BoxWeight {
	private double cost;
	public Shipment(){
		this.cost = 0.0;
	}
	public Shipment(double width,double height,double depth,double weight,double cost){
		super(width,height,depth,weight);
		this.cost = cost;
	}
	public Shipment(double height,double weight,double cost){
		super(height,weight);
		this.cost = 0.0;
	}
}
