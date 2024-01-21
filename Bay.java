
public class Bay {
	private int type;
	final int COMPACT = 0;
	final int MEDIUM = 1;
	final int FULLSIZE = 2;
	final int CLASS1 = 3;
	final int CLASS2 = 4;
	final int WILD = 5;
	int [] schedule = new int [720];

    public Bay(int type){
        this.type=type;
    }

	public boolean isEmpty(int startTime, int serviceTime)
	{
		for (int i = startTime; i < serviceTime; i++)
		{
			if (startTime + serviceTime >= 720)
			{
				break;
			}
			if (schedule[i] == 0)
			{
				continue;
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	
	public void scheduleAppt (int startTime, int serviceTime)
	{
		for (int i = startTime; i < serviceTime; i++)
		{
			schedule [i] = 1;
		}
	}
	
}
