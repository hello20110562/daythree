public class EqualTest{
	public static void main(String args[]){
		String greeting ="Hello";
		if(greeting=="Hello")
		System.out.println("true");
		if(greeting.substring(0,3)=="Hel");
		System.out.println("false");
		int n =greeting.length();//length ����UTF_16�����ʾ�����ַ�����Ҫ�Ĵ��뵥λ����
		System.out.println(""+n);
		String sentence ="Never say goodbye";
		int i=0;
		int cp =sentence.codePointAt(i);
		System.out.println(""+cp);
		if(Character.isSupplementaryCodePoint(cp)) 
		i+=2;
		else
		i++;
		
		
		
	}
}