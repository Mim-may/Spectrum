package recursion;

public class Length_String {
	
	public static int recursive_Length(String s) {
	    if (s.equals("")) {
	    	return 0;
	    }
	    else {
	    	return(recursive_Length(s.substring(1)) + 1);
	    }
		
	}

	public static void main(String[] args) {
		String str = "ILoveSEN2211";
		System.out.println(recursive_Length(str));
        System.out.println("fj".matches("[^abc]"));
        System.out.println("999-333-111".matches("[\\d{3}]$"));
        System.out.println("f*j".matches("\\*"));
	}

}
