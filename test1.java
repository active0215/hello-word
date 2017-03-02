
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer("123");
		StringBuffer sb2 = new StringBuffer("456");
		StringBuffer sb3 = sb1.append(sb2);


		String s1 = "abc";
		String s2 = new String("11");
		String s3;
		s3 = s1 + s2;

		//String and StringBufferä‘ÇÃì]ä∑
		//StringÅ® StringBuffer
		String s5 = "987";
		StringBuffer sb5 = new StringBuffer(s5);

		//StringBufferÅ®String
		StringBuffer sb6= new StringBuffer("gkh");
		String s6 = sb5.toString();

		System.out.println(sb3);

	}

}