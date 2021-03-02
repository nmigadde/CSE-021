
public class FindDuplicateCount {

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 4, 2, 4, 3, 0, 5, 3, 2};
		int len = arr.length;
		
		for (int i = 0; i < len; i++) {
			int dup = 0;
			int value = 0;
			int index = 0;
			value = arr[i];
			index = i;
			
			for (int j = i + 1; j < len; j++) {
				if (arr[i] == arr[j]) {
				dup = dup+1;
				}
			}
			
			if(dup>1) {
				System.out.println("There are " + dup + " more occurrences of value " + value + " starting at index " + index);
			
			}
			if(dup==1){
				System.out.println("There is only " + dup + " more occurence of value " + value + " starting at index " + index);
			} 
			if(dup==0){
				System.out.println("No duplicates with value " + value + " beyond Index " + index);
			}
		} 

	}
}