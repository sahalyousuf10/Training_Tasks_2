public class Test_String_Buffer_Reader {

    public static void main(String[] args) {

        long starttime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("Java ");
        buffer.append("is ");
        buffer.append("an ");
        buffer.append("Object ");
        buffer.append("Oriented ");
        buffer.append("Language");

        System.out.println(buffer);

        System.out.println("Time taken by StringBuffer is: "+(System.currentTimeMillis()-starttime)+" millisecond"); // StringBuffer is slower than StringBuilder

        long starttime1 = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("Java ");
        builder.append("is ");
        builder.append("an ");
        builder.append("Object ");
        builder.append("Oriented ");
        builder.append("Language");

        System.out.println(builder);

        System.out.println("Time taken by StringBuilder is: "+(System.currentTimeMillis()-starttime1)+" millisecond"); //StringBuilder is faster than StringBuffer

        //StringBuilder is more efficient than StringBuffer
        //Because StringBuffer is thread safe it's making control of one thread at a time and StringBuilder is thread unsafe
        //StringBuilder is accessed through single thread and StringBuilder can be accessed through multiple threads

    }
}
