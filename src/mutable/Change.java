package mutable;
public class Change {
    public static void main(String[] args) {
        //Immutable
        String s1="Reza";
        System.out.println(s1);
        s1.concat(" Ahmadi");
        System.out.println(s1);
        //Mutable
        StringBuffer s2 = new StringBuffer("Mohammad ");
        System.out.println(s2);
        s2.append(s1);
        System.out.println(s2);
    }
}
