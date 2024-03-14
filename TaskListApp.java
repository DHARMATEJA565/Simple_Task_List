import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class TaskListApp {

	static Scanner sc = new Scanner(System.in);
	

		static List<String> task = new ArrayList<>();
		
		public static void addTask(String name ) {
			task.add(name);
			System.out.println(" **** TASK ADDED ****");
		}
		public static void dltTask(int number) {
			task.remove(number-1);
			System.out.println(" **** TASK REMOVED ****");
		}
		public static void show() {
			int i =1;
			for(String t : task) {
				System.out.println((i++) + ". " + t);
			}
		}
	
static void TaskApp(int n ) {
		switch (n) {
		case 1 : System.out.println("Enter Task Name : ");
				 String s = sc.next();
		         addTask(s);
		         break;
		case 2 : if(task.size() == 0) {
						System.out.println("NO TASKS TO DO");
						}else {
							show();
							System.out.println("Enter Task Number :");
							 int num = sc.nextInt();
							 if (num < 1 || num > task.size()) {
								 System.out.println("INVALID NUMBER");
							 }else {
								 dltTask(num);
							 }
						}
		 			
				 
				 break;
				 
		case 3 : if (task.size() == 0) System.out.println("LIST IS EMPTY");
				 else show();		         
		}
	}

	public static void  main(String [] args) {
		
		System.out.println("******** TASK LIST APPLICATION ***********");
		int x = 0;
		while (true) {
			System.out.println("1.Add a Task    2. Remove a Task   3. Task List   4. Quit");
			System.out.println(" Select an option : ");
			x = sc.nextInt();
			if(x >4 || x <1) {
				System.out.println("Enter Valid Number");
			}else if (x ==4){
				break;
			}else {
				TaskApp(x);
			}
			System.out.println();
		}
	}
}
