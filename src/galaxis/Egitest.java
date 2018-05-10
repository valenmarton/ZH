package galaxis;

public abstract class Egitest {
	public String name;
	public Egitest (String name) {
		this.name = name;

	}
	public abstract float convertTomegToFloat (int tomeg, int index);
}
