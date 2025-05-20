public class StrdecMemory {
    public static void main(String args[]) {
        String s = "Akarsh";
        String s1 = "Akarsh";  // Points to the same object in the String Constant Pool

        String s2 = new String("Jha");  // New object in heap + "Jha" in pool (if not already)
        String s3 = new String("Jha");  // Another new object in heap

        System.out.println(s == s1);  // true, same reference from pool
        System.out.println(s2 == s3); // false, different heap objects
    }
}
