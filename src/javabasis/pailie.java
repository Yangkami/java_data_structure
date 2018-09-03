package javabasis;


class paillie{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("456");
		pailie("ABCD", "");
	}

	public static void pailie(String a, String result) {
		if (a.length() == result.length()) {
			System.out.println(result);
		} else {
			for (int i = 0; i < a.length(); i++) {
				pailie(a, result + a.charAt(i));
			}
		}
	}

	
}