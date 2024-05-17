import java.util.Scanner;
class Add{
	public static void main(String[] args){
		int x, y;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		int z = x+y;
		System.out.println("Sum=" +z);
	}
}