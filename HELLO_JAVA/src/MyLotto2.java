
public class MyLotto2 {
	public static void main(String[] args) {
		int arr[] = new int[6];
		for(int i=0; i<6; i++) {
			int rand = (int) (Math.random()*45)+1;
			arr[i]=rand;
		}
		System.out.println(arr[0]+","+arr[1]+","+arr[2]+","+arr[3]+","+arr[4]+","+arr[5]);
	}
}
