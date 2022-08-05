public class Test_compareTo {

    public static void main(String[] args) {

        String a = "sahal";
        String b = "sahal";
        String c = "SAHAL";
        String d = "sahalyousuf";
        String e = "aahal";
        String f = "xahal";
        String g = "name";
        String h = "";


        System.out.println(a.compareTo(b)); // Result will be 0 because both are equal
        System.out.println(b.compareTo(c)); // Result will be 32 because the compareTo() method take care of the case sensitiveness of characters String b is in lower case and the String c is in Uppercase
        System.out.println(c.compareTo(b)); // Result will be -32 because the compareTo() method take care of the case sensitiveness of characters String c is in Uppercase and the String b is in Lowercase
        System.out.println(b.compareTo(d)); // Result will be -6 because String b have 6 less characters as compare to String d
        System.out.println(d.compareTo(b)); // Result will be 6 because String d have 6 more characters as compare to String b
        System.out.println(a.compareTo(e)); // Result will be 18 because in String a, s is 18 times greater than a in String e
        System.out.println(a.compareTo(f)); // Result will be -5 because in String a, s is 5 times lesser than x in String f
        System.out.println(a.compareTo(g)); // Result will be 5 because s is 5 times greater than n
        System.out.println(g.compareTo(h)); //Result will be 4 because String h is null string and String g have 4 more characters as compare to String h
        System.out.println(h.compareTo(g)); //Result will be -4 because String h is null string and String g have 4 more characters as compare to String h

    }
}
