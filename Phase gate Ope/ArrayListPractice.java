import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


	public class ArrayListPractice {
public static void main(String[] args)  {


	/* ArrayList<Integer> a = new ArrayList<Integer>();

	a.add(1);
	a.add(2);
	a.add(3);
System.out.println(a); 

	ArrayList<String> al =  new ArrayList<>();
		al.add("Geeks");
		al.add("Geeks");
System.out.println("Orignal List : "+al);
	al.add(1, "For");
        System.out.println("After Adding element at index 1 : "+ al);
al.remove(0);
      	System.out.println("Element removed from index 0 : "+ al);

      	al.remove("Geeks");
      
      	System.out.println("Element Geeks removed : "+ al);
      	al.set(0, "GFG");
 System.out.println("List after updation of value : "+al);   */

        List<String> l = new ArrayList<>();
          l.add("Shoes");
          l.add("Toys");
        Collections.addAll(l, "Fruits", "Bat", "Ball");
        Collections.sort(l);
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }
	System.out.println();

        Collections.sort(l, Collections.reverseOrder());

        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }

    }
        }
public double transfer(String fromName, int pin, String toName, double amount) {
    Account from = findAccountByFullName(fromName);
    Account to = findAccountByFullName(toName);
    if (from != null && to != null && from.verifyPin(pin) && from.getBalance() >= amount) {
        from.withdraw(amount);
        to.deposit(amount);
        return amount;
    }
    return 0;
}

public double withdraw(String fullName, double amount, int enteredPin) {
    Account acc = findAccountByFullName(fullName);
    if (acc != null && acc.verifyPin(enteredPin)) {
        boolean success = acc.withdraw(amount);
        return success ? amount : 0;
    }
    return 0;
}
