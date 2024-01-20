public class Car {
	
	final int COMPACT = 0;
	final int MEDIUM = 1;
	final int FULLSIZE = 2;
	final int CLASS1 = 3;
	final int CLASS2 = 4;
	
	int type;
	int [] serviceTime = {30, 30, 30, 60, 120};
	int [] servicePrice = {150, 150, 150, 250, 700};	
	
	public Car (int num)
	{
		type = num;
	}
	
    public String toString(){
        return ""+type;
    }
	
}
