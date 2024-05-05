package introOfJava;

public class StringConcept {
    public static void main(String[] args) {

//    String is a class thats why the below format
        String name = new String("Payal");
        System.out.println(name);
        System.out.println(name.hashCode());

//    Since String is a class it will automatically create the object for the below format
        String s = "Dolly";


//    String constant pool concept - It says that whatever strings are created
//    they are kept in string constant pool inside heap


//    here in the below case only one "payal" will be there and then a and b points to same string inside pool
        String a = "Payal";
        String b = "Payal";


//    Here in the below case, the reference variable a does not gets changed but now it
//    points to the new string "HelloPayal" in the string pool and the String "Payal" if not in use
//    will be applied for garbage collection
        a = "Hello" + a;
        System.out.println(a);

//        Immutable strings - unchanged
//        Strings are immutable in java because of the Above String Pool concept


//        String Buffer and String Builder for immutable Strings
//        String Buffer creates an extra space of 16 bytes as in case continuous memory location no space is there
//        String Buffer is thread safe and String builder is not
        StringBuffer sb = new StringBuffer("Manya");
        System.out.println(sb.capacity());

//        StringBuffer objects are mutable, which means that you can modify the
//        contents of the object after it has been created. In contrast,
//        String objects are immutable, which means that you cannot change
//        the contents of a String once it has been created.

    }
}
