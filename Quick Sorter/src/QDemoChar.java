
	class QSDemo
		{
		static char a[] = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};
		
		public static void main (String args[])
			{
			System.out.println("Original array: ");
			displayArray();
			QuicksortChar.qsort(a);
			System.out.println();
			System.out.println("\nSorted array: ");
			displayArray();
			}
		
		public static void displayArray()
			{
			for (char fred : a)
				{
				System.out.print(fred);
				}
			}
		
	}
	