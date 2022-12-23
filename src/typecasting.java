/*Typecasting is a method of converting one data type to another. If I create an int data type and store an integer value in it, and if I do “char” typecasting here, Then while reading this value, the CPU will read it as “char”, So in output, you will get the character “A” instead of 65 (Binary notation of A and 65 is same).*/

public class typecasting {
    public static void main(String[] args) {
        int x = 65;
        System.out.println(x);
        System.out.println((char)x);
    }
}
