import java.util.Scanner;
class first_git{
	public static void main(String args[]){
		System.out.printf("Enter the number 5 times:\n");
     for(int i=1;i<=5;i++){
		   System.out.println("Enter a number:");
           Scanner input=new Scanner(System.in);
           int number=input.nextInt();
		   System.out.printf("The "+ i +" number is:%d\n",number);	
  	 }
	}
}