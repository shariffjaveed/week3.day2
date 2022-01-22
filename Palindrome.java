package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int num=121;
		int temp = num;
		int rev= 0,rem;
		while(temp!=0)
		{
			rem=temp%10; //121%10->1->rem->1   // 1 = 12%10->2  // 1=1%10->1
			rev=rev*10+rem;//0*10+1->1->rev->1  //1= 1*10+2->12  //12=12*10+1->121
			temp=temp/10;//121/10->12->temp     //12=12/10->1    //1=1/10->0
		}
		if(num==rev)
		{
		System.out.println("is a palindrome");
		}
		else
		{
			System.out.println("is not an palindrome");
		}

	}

}
