package javastrings;

public class StringClassB 
{
	String s1=new String("myschool is good");
	//1
        void charAt()
        {
//        	String s1=new String("myschool");
        	char a1=s1.charAt(2);
        	System.out.println("The char at pos"+a1);
        	
        }
      //2  
        void stringLength()
        {
        	int a1=s1.length();
        	System.out.println("The length of the string"+a1);
        }
        //3
        void stringformat()
        {
        String mys=String.format("name is %s",s1);
        System.out.println(mys);
        }
        //4
        void substring()
        {
        	String mys=s1.substring(2,4);
        	System.out.println("the substring is "+mys);
        }
        //5
        void contains()
        {
        	boolean a1=s1.contains("is");
        	System.out.println(a1);
        }
        //6
        void StringJoin()
        {
//        	String s2 = null;
        	String s2=String.join(" java","helo"," this is uday");
        	System.out.println(s2);
        }
        //7
        void Equal()
        {
        	String s3="myschool";
        	boolean b1;
        	b1=s1.equals(s3);
        	System.out.println(b1);
        }
        //8
        void EqualSym()
        {
        	String s3="myschool";
        	System.out.println(s1==s3);
        }
        //9
        void Empty()
        {
        	boolean b1;
        	String s4="";
        	b1=s4.isEmpty();
        	System.out.println(b1);
        }
        //10
        void concate()
        {
        String s5=" hey";
        String s6=s1.concat(s5);
        System.out.println(s6);
        }
        //11
        void replace()
        {
        	String s7=s1.replace("my", "we");
        	System.out.println(s7);
        }
        //12
        void equalsIgnoreCases()
        {
        	String s8="MYSCHOOL";
        	System.out.println(s8.equalsIgnoreCase(s1));
        }
        //13
        void splitString()
        {
        	String[] words=s1.split("\\s");//splits the string based on whitespace
        	//using foreach loop to print elements of string array
        	for(String w:words)
        	{
        		System.out.println(w);
        	}
        }
        //14
        void split2()
        {
        	for(String w:s1.split("\\s",2))
        	{
        		System.out.println(w);
        	}
        }
        //15
        void intern()
        {
        	String s9= new String("hello");
        	String s10="hello";
        	String s11=s9.intern();//returns string from pool now it will be same as s10;
        	System.out.println(s11);
        	System.out.println(s9==s10);//false because reference variables are pointing to different instance
        	System.out.println(s10==s11);//true because reference variables are pointing to same instance
        	
        }
        //16
        void index()
        {
        	System.out.println(s1.indexOf("y"));//returns index value of the character which we are passsing here;
        	System.out.println(s1.indexOf("k"));//returns -1 if the character is not found
        }
        //17
        void subIndex()
        {
        	System.out.println(s1.indexOf("i"));
        }
        //18
        void ToLowerCase()
        {
        	String s12="UDAYKUMAR";
        	System.out.println(s12.toLowerCase());
        }
        //19
        void uppercase()
        {
        	String s13="mailaram";
        	System.out.println(s13.toUpperCase());
        }
        //20
        void trim()
        {
        	String s1="  hello string   ";  
        	System.out.println(s1+"javatpoint");//without trim()  
        	System.out.println(s1.trim()+" javatpoint");//with trim()  
        }
        void valueof()
        {
        	//for converting any data type into string we use valueof method
        	int value=30;  
        	String s1=String.valueOf(value);  
        	System.out.println(s1+10);//concatenating string with 10 
        }
	public static void main(String[] args) 
	{
		StringClassB str=new StringClassB();
//		str.charAt();
//		str.stringLength();
//		str.substring();
//		str.stringformat();
//		str.contains();
//		str.StringJoin();
//	    str.Equal();
//	    str.EqualSym();
//		str.Empty();
//		str.concate();
//		str.replace();
//		str.equalsIgnoreCases();
//		str.splitString();
//		str.split2();
//		str.intern();
//		str.index();
//		str.subIndex();
//		str.ToLowerCase();
//		str.uppercase();
		str.trim();
	}

}
