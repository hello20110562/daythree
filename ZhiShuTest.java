public class ZhiShuTest{
	public static void main(String args[]){
	/*for(int i=101;i<200;i++){
		boolean f=true;
		for(int j=2;j<i;j++){
			if(i%j==0){
				f=false;
				break;
			}
		}
		if(f)System.out.println(""+i);
	}*/
		for(int i=101;i<200;i++)
		{
		int sum=0;//sum用于计算整除的个数
		for(int j=2;j<i;j++){
			//i除以j的余数
			if (i%j==0){   //当j
			sum +=sum;
			break;
			}
			}
			if(sum==0)
		System.out.println(""+i);
		}
	}
}