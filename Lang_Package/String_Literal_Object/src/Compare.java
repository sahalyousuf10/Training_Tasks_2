//Write a java program to understand the difference between String literal and String Object. Also use "equals()" method and "==" operator to compare these Strings.

public class Compare {

    public static void main(String[] args) {

        String a = "Mohammad Sahal Yousuf"; // String Literal 1
        String b = "Mohammad Sahal Yousuf"; // string Literal 2
        String c = new String("Mohammad Sahal Yousuf"); // String Object 1
        String d = new String("Mohammad Sahal Yousuf"); // String Object 2
        boolean e = a == b; // Compare bw string literal 1 and 2
        boolean f = c == d; // Compare bw string Object 1 and 2
        boolean g = a == c; // Compare bw String literal and String object
        boolean h = a.equals(b); // Compare bw string literal 1 and 2 through .equals() method
        boolean i = c.equals(d); // Compare bw string Object 1 and 2 through .equals() method

        System.out.println("Compare bw both string literals: " + e); // The result will be true because a and b refers to same content in string pool
        System.out.println("\nCompare bw both string objects: " + f); // The result will be false because there is two different objects and c and d are reference variable that refers to separate string objects
        System.out.println("\nCompare bw String literal and String object: " + g); // The result will be false because the reference is different in string literal and string object
        System.out.println("\nCompare bw both string literals using .equals() method: " + h);// The result will be true because .equals() method refers to content comparison;
        System.out.println("\nCompare bw both string objects using .equals() method: " + i);// The result will be true because .equals() method refers to content comparison;
        //String object will take more time for execution because it will create new string everytime.

    }
}















