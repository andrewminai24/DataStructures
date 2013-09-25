
public class WrittenProblem {
		public static boolean isSorted(int[] a){
			//Error checking
			if (a == null) throw new IllegalArgumentException();
			//if (a.length == 0 || a.length == 1) return true;
			for (int i = 0;i<a.length-1; i++){
				if(a[i] > a[i+1]) return false;
			}
			return true;
		}
		
		public static int mostFrequentValue(int[] a){
			int finalMFI = 0;
			int curHighFrq = 1;
			int finalHighFrq = 1;
			for(int i = 0; i<a.length; i++){
				if (i == a.length-1){
					if(curHighFrq > finalHighFrq){
						finalHighFrq = curHighFrq;
						finalMFI = i;
					}
					curHighFrq = 1;
				}
				else if (a[i] != a[i+1]){
					if(curHighFrq > finalHighFrq){
						finalHighFrq = curHighFrq;
						finalMFI = i;
					}
					curHighFrq = 1;
				}
					else curHighFrq++;
				}
			return a[finalMFI];
		}
		public static int mystery(int a, int b) {
			if (a < 0)
			return 1;
			else
			return 2 + mystery(a - b, b);
			}
		
		public static boolean search(int item, Object[] arr) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == (Object)item) {
					return true;
				}
			}
			return false;
		}
		public static boolean recursiveSearch(int item, int[] arr, int position) {
			if (position == arr.length) return false;
			if (arr[position] == item) return true;
			else return recursiveSearch(item, arr, position+1);
		}
		
		public static void main(String args[]){
			int[] list = {3,1,5,3,5};
			System.out.println("Is the given array of integer sorted? " + isSorted(list));
			int[] firstSortedList = {1,2,2,3,4,4,4,4,4,4,5,8,8,8,8,8,8};
			System.out.println("Most frequent value is: " + mostFrequentValue(firstSortedList));
			int[] secondSortedList = {6,25,25,25,25,52,56,63,63,75,84};
			System.out.println("Most frequent value is: " + mostFrequentValue(secondSortedList));
			int[] thirdSortedList = {6};
			System.out.println("Most frequent value is: " + mostFrequentValue(thirdSortedList));
			System.out.println(mystery(20,-214748381));
			int[] a = {2, 4, 6, 8, 10, 12};
			//int[] b = new int[6];
			int[] c = new int[6];
			//b = a;
			for (int i = 0; i < a.length; i++)
			c[i] = a[i];
			a[2] = c[5];
			c[2]++;
		//	System.out.println(a[2] + " " + b[2] + " " + c[2]);
			Lagrange L = new Lagrange(4);
			Lagrange M = new Lagrange(4);
			Lagrange N = new Lagrange(4);
			Lagrange b[]  = {L, M};
			Integer d[] = {1,2,3,4,5};
		
			System.out.println(search(10,d));
			System.out.println(recursiveSearch(4,a,3));
		}
	}

