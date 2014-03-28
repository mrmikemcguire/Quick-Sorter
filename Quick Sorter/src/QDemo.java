
	class QSDemo
		{
		public static void main (String args[])
			{
			char a[] = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};
			int i;
			
			System.out.println("Original array: ");
			for (i = 0; i < a.length; i++)
				{
				System.out.print(a[i]);
				}
			
			Quicksort.qsort(a);
			System.out.println();
			
			System.out.println("Sorted array: ");
			for (i = 0; i < a.length; i++)
				{
				System.out.print(a[i]);
				}
		}
	}
	