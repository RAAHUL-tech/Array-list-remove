package arraylistremove;

import java.util.ArrayList;
import java.util.Scanner;

public class remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int removedElement,index;
		ArrayList<Integer> numbers = new ArrayList<>();
		Scanner s=new Scanner(System.in);
	    numbers.add(0);   //0 index
	    numbers.add(2);   //1 index
	    numbers.add(4);  //2 index
	    System.out.println("ArrayList: " + numbers);
        System.out.println("Enter the index of element to be removed ");
        index=s.nextInt();
	    removedElement = numbers.remove(index);  //2 is index

	    System.out.println("Removed Element: " + removedElement);

	}

}
