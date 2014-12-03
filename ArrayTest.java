//数组：存放同种数据类型的与元素：下标范围【0，N-1】
public class ArrayTest{
	public static void main(String args[]){
		//声明数组,变量在栈空间
		int [] arr;//建议使用（实现类型和变量的分离）
		int arr1[];
		//int test[10];error
		//在java中声明数组不可以指定大小
		
		//初始化：在堆空间
		arr=new int [10];
		arr1={1,2,3,4};
		
		//声明加初始化同时进行
		String [] str =new String[5];//默认初始化
		int[] arrInt =new int[]{123,234,345};
		String [] IT= new String[]{"Java","C++","Android"};
		String [] IT1=            {"Java","C++","Android"};
	}
}