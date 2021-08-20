package Week2Day1;

public class compareStrings {

	public static void main(String[] args) {
		String s1 = "welcome";
		String s2 = "welcome";

		String s3 = new String("welcome");

		if (s1 == s2) {
			System.out.println("They have the same memory");
		} else {
			System.out.println("They dont have the same memory");
		}
		if (s1 == s3) {
			System.out.println("s1 and s3 are same");

		} else {
			System.out.println("s1 and s3 are not same");
		}
        // Substring
		String str2 = "I am new to selenium";
		String str1 = str2.substring(8);
		System.out.println("Substring :"+str1);
		
		//Substring with starting and ending index
		String str4 = str2.substring(5,20);
		System.out.println("Substring with start and end index : "+str4);
		
		//replace
		String rep = "Rajashri@28";
		String rep1 = rep.replace('a', 'A');
		System.out.println(rep1);
		
		//replaceAll
		String repall = "rajashrimani@28";
		String repall1 = repall.replaceAll("\\D", " ");
		System.out.println("Replace all  1: " + repall1);
		
		//ReplaceAll1
		String repall2 = "rajashrimani@28";
		String repall3 = repall2.replaceAll("\\d", " ");
		System.out.println("Replace all  1: " + repall3);
       
		//Split() not working
		String str3 = "I am loving Selenium";
		str3.split(" ");
		System.out.println(str3);
		
		//convert String to integer
		String stin = "Rs.200";
		String stin1 = stin.replaceAll("\\D", "");
		System.out.println(stin1);
		int parseInt = Integer.parseInt(stin1);
		int a = parseInt + 10 ;
		System.out.println(a);

	}

	

}
