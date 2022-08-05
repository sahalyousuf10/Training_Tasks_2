public class Capitalise_Word {

    public static void main(String[] args) {

        String a= "mohammad";
        String b= "sahal";
        String c= "yousuf";
        String name, name1;

        String firstletter = a.substring(0,1);
        String remainingLetters = a.substring(1, a.length());

        String firstletter1 = b.substring(0,1);
        String remainingLetters1 = b.substring(1, b.length());

        String firstletter2 = c.substring(0,1);
        String remainingLetters2 = c.substring(1, c.length());

        firstletter = firstletter.toUpperCase();
        firstletter1 = firstletter1.toUpperCase();
        firstletter2 = firstletter2.toUpperCase();
        name = a+" "+b+" "+c;
        name1 = firstletter+remainingLetters+" "+firstletter1+remainingLetters1+" "+firstletter2+remainingLetters2;

        System.out.println("Original String: "+name);
        System.out.println();
        System.out.println("After capitalise each word in String: "+name1);

        System.out.println();

    }
}
