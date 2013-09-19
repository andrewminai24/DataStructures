
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
		
		public static void main(String args[]){
			int[] list = {3,1,5,3,5};
			System.out.println("Is the given array of integer sorted? " + isSorted(list));
			int[] firstSortedList = {1,2,2,3,4,4,4,4,4,4,5,8,8,8,8,8,8};
			System.out.println("Most frequent value is: " + mostFrequentValue(firstSortedList));
			int[] secondSortedList = {6,25,25,25,25,52,56,63,63,75,84};
			System.out.println("Most frequent value is: " + mostFrequentValue(secondSortedList));
			int[] thirdSortedList = {6};
			System.out.println("Most frequent value is: " + mostFrequentValue(thirdSortedList));
		
		}
		
	}

