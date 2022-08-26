package d;

	public class JavaStringBuffer {

		public static void main(String[] args) {
			StringBuffer sb = new StringBuffer("java test");	
			String str = sb.toString();
			char[] ch = str.toCharArray();
			display(ch);
		}//end main()
		
		public static void display(char[ ] data){
			for(char cn: data)
				System.out.println(cn);
	  }//end display()
}