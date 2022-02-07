public class HelloWorld{
	public static void main(String[] args){

		String name = "Michael";
		int numberOfChampionships = 4;
		System.out.println("hello world! My name is " + name);
		System.out.println("My address is " + numberOfChampionships);
		System.out.println("My age is infinite");
		System.out.printf("How is it going %s, your jersey number is %s \n", name, numberOfChampionships);
		if(numberOfChampionships <= 6){
			System.out.println("oh you still have some time to get there");
		}else{
			System.out.println("no like Mike");
		}
	}
}