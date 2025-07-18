package Arrays;

public class Array6 {
	public static void main(String[] args) {
		boolean majority=false;
		int[]arr= {5,3,6,6,3,2,6,3};
		int maxcount=0;
		int mostfrequent=arr[0];
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>maxcount) {
				maxcount=count;
				mostfrequent=arr[i];
			}
			
		}
		 System.out.println(mostfrequent);
	}

}
