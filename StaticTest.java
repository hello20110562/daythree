//public class StaticTset
class Value{
	static int c=0;
	static void inc(){
		c++;
		}
}
class Count{
	public static void prt(String s){
	System.out.println(s);
	}
	public static void main(String[] args){
	
	Value v1,v2;
	v1=new Value();
	v2=new Value();
	prt("v1.c="+v1.c+"v2.c"+v2.c);
	v1.inc();
	prt("v1.c="+v1.c+"v2.c"+v2.c);
	}
}


