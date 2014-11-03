public class QuicksortChar
	{
	static void qsort(char items[])
		{
		qs(items, 0, items.length - 1);
		}
	
	private static void qs(char items[], int left, int right)
		{
		int i, j;
		char pivot, y;
		
		i = left;
		j = right;
		pivot = items [(left + right) / 2];
		
		do
			{
			while ((items [i] < pivot) && (i < right))
				{
				i++;
				}
			
			while ((pivot < items [j]) && (j > left))
				{
				j--;
				}
				
			if (i <= j)
				{
				y = items [i];
				items [i] = items [j];
				items [j] = y;
				i++;
				j--;
				}
			}
		while (i <= j);
		
		if (left < j)
			{
			qs (items, left, j);
			}
		if (i < right)
			{
			qs (items, i, right);
			}
		}	
	}
	
	
	
