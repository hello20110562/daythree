public class ZhengchuTest{
	public static void main(String args[]){
	    int j=0,i=0,k;//1、用do while
		do{
		i=i+1;
		k=i%3;
		if(k==0)
		{
		j+=1;
		System.out.println("i="+i);
		}
		}
		while(j<=4);
		/*int i,j=0,k;//2、用for循环语句读数
		for (i=1;i<=100;i++){
		k=i%3;
		if(k==0)
		{
		j+=1;
		System.out.println("i="+i);
		if(j>4)
		break;
		}
		continue;*/
		}
	}
