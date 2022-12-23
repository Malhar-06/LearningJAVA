public class combination {
    public static void main(String[] args){
        int x = 5;
        byte y = 10;
        //To get the datatype class of any variable
        System.out.println(((Object) x).getClass());
        //To get just the datatype of any variable - use getsimpleName()
        System.out.println(((Object) x).getClass().getSimpleName());

        System.out.println(x+y);

        char i='A';
        char j='B';
        System.out.println(i+j);
        /*Here the output will be 131, char datatype in java comes from the number family so when we do an arithmetic expression between two characters, then “char” automatically does type casting to integer and then start behaving like int.*/

        String h = "Hello";
        String w= " world";
        System.out.println(h+w);
        /*Polymorphism - The word polymorphism means having many forms. In simple words, we can define polymorphism as the ability of a message to be displayed in more than one form. So for example in the above example, we can see, everywhere we are using the “+” operator but its behavior changes with the datatype, If we use the “+” operator between integers then it just adds them, but if we do between two strings it just shows both the strings together and so on.*/
        /*Type coercion is the automatic or implicit conversion of values from one data type to another (such as strings to integers), for example when we try to add int data with byte data then their result will automatically become “int”*/
        /*In JAVA we declare a char value with a single inverted comma(‘’) and for string, we use the double inverted comma(“”), the vice-versa will not work
            char i =’ a’;
            String j=” hello”;
        */
    }
}
