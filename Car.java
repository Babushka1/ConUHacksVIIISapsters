
public class Car {
	
	final int COMPACT = 0;
	final int MEDIUM = 1;
	final int FULLSIZE = 2;
	final int CLASS1 = 3;
	final int CLASS2 = 4;
	
	int type;
	public final int [] serviceTime = {30, 30, 30, 60, 120};
	public final int [] servicePrice = {150, 150, 150, 250, 700};	
	
	
	
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Car (int num)
	{
		type = num;
	}
	
	
}
