package application;

/**
 * Berechnet das Formelrad
 * @author Peter Rutschmann
 * @version 13.09.2018
 */
public class Calculator {
	private double leistung;
	private double spannung;
	private double strom;
	private double widerstand;
	
	public Calculator(double leistung, double spannung, double strom, double widerstand) {
		super();
		this.leistung = leistung;
		this.spannung = spannung;
		this.strom = strom;
		this.widerstand = widerstand;
	}
	
	public double getLeistung() {
		return leistung;
	}
	
	public double getSpannung() {
		return spannung;
	}

	public double getStrom() {
		return strom;
	}

	public double getWiderstand() {
		return widerstand;
	}

	@Override
	public String toString() {
		return "Calculator [leistung=" + leistung + 
				", spannung=" + spannung + 
				", strom=" + strom + 
				", widerstand="	+ widerstand + "]";
	}

	public void calculate() {
		
		//Lenny
		if(getStrom() == 0 && getLeistung() != 0 && getWiderstand() != 0 ){
			StromausLeistungundWiderstand();
		}
		
		if(getStrom() == 0 && getLeistung() != 0 && getSpannung() != 0 ){
			
			StromausLeistungundSpannung();
		}
		
		if(getStrom() == 0 && getSpannung() != 0 && getWiderstand() != 0 ){
			
			StromausSpannungundWiderstand();
		}
		
		if(getWiderstand() == 0 && getSpannung() != 0 && getLeistung() != 0 ){
			
			WiderstandausSpannungundLeistung();
		}
		
		if(getWiderstand() == 0 && getStrom() != 0 && getLeistung() != 0 ){
			
			WiderstandausStromundLeistung();
		}
		
		if(getWiderstand() == 0 && getSpannung() != 0 && getStrom() != 0 ){
			
			WiderstandausStromundSpannung();
		}
				
	}

	//Lenny
	public double StromausLeistungundWiderstand(){
		
		double zwischenres = getLeistung() / getWiderstand();
		double res = Math.sqrt(zwischenres);
		
		return res;		
	}
	
	public double StromausLeistungundSpannung(){
		
		double res = getLeistung() / getSpannung();
		
		return res;		
	}
	
	public double StromausSpannungundWiderstand(){
		
		double res = getSpannung() / getWiderstand();
		
		return res;		
	}
	
	public double WiderstandausSpannungundLeistung(){
		
		double res = (spannung * spannung) / leistung;
		
		return res;
	}	
	
	public double WiderstandausStromundLeistung(){
		
		double res = leistung / (strom * strom) ;
		
		return res;
	}
	
	public double WiderstandausStromundSpannung(){
		
		double res = spannung / strom ;
		
		return res;
	}
}
