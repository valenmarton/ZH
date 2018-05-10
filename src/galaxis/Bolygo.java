package galaxis;

public class Bolygo extends Egitest{
	public float keringesiIdo;
	public int atmero;
	public float [] konstansArray = {(float) 0.1, (float) 0.2 , (float) 0.5, (float) 0.33};
	
	public Bolygo(String name, float kI, int atmero) {
		super(name);
		this.keringesiIdo = kI;
		this.atmero = atmero;
	}
	
	public float getKeringesiIdo() {
		return keringesiIdo;
	}
	@Override
	public String toString() {
		return "Bolygo [keringesiIdo=" + keringesiIdo + ", atmero=" + atmero + ", neve=" + super.name + "]";
	}
	public boolean hosszabbKeringesiIdo(Bolygo b1) {
		if(this.getAtmero()>b1.getAtmero()) {
			return true;
		}
		else return false;
	}
	
	public static Bolygo getKisebbKeringesiIdo(Bolygo b1, Bolygo b2) {
		if(b1.getKeringesiIdo() < b2.getKeringesiIdo()) {
			return b1;
		}
		else return b2;
	}

	public int getAtmero() {
		return atmero;
	}

	@Override
	public float convertTomegToFloat(int tomeg, int index) {
		return tomeg * konstansArray[index];
	}
	
	
	
}
