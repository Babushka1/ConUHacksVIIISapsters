
public class Schedule {
	public static Bay [][] baySchedule = new Bay[61][10];
	
	public void baySchedule()
	{	
		for (int i = 0; i < baySchedule.length; i++)
		{
			for (int j = i; j < baySchedule.length; j++)
			if (j > 4)
			{
				baySchedule [i][j] = new Bay(5);
			}
			else
			{
				baySchedule[i][j] = new Bay(j);
			}
		}
    }
    }

}
