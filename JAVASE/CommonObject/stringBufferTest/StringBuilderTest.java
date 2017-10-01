package stringBufferTest;

public class StringBuilderTest {
	public static void main(String[] args){
		int[] arr={2,4,43,5,98,3};
		System.out.println(arrayToString_2(arr));
	}
	public static String arrayToString_2(int[] arr) {
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if(i!=arr.length-1){
				sb.append(arr[i]+", ");
			}else{
				sb.append(arr[i]+"]");
			}
		}
		return sb.toString();
	}
	public static String arrayToString(int[] arr){
		String str="]";
		for (int i = 0; i < arr.length; i++) {
			if(i!=arr.length-1){
				str+=arr[i]+", ";
			}else{
				str+=arr[i]+"]";
			}
		}
		return str;
	}
}
