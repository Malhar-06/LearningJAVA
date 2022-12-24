public class array {
    public static void main (String[] args) {

        int x[] = {1,2,3,4,5};
        System.out.println(x);/*The array is one of the data structures that stores similar data types of values in a continuous manner in RAM. Here in the above example, we have created an array “x” which stores five integer values in a continuous manner inside RAM. But when we print the “x” with help of the System.out function, we get some physical address. Hence, here our array variable “x” is storing the address of the first element of the array.*/
                              /*As we know in JAVA we can’t interact with the hardware directly, we have JVM in between so here the address will show in output when you run this code in your computer is not the real physical address of RAM, It is the virtual address provided by JVM, but in reality, JVM knows the real physical address of the first element of the array. Hence, JVM manages pointers in JAVA, but we as developers can’t manage pointers because we don’t know the real physical address of our variables.*/
        System.out.println(x[3]);//by giving index no. we can access the data in the array.



        //Stack and Heap Memory

        //1.STACK
        /*Whenever a program is run, It becomes a process in RAM, Now in a process, we have mainly 3 parts Code Section, Stack memory, And Heap memory, Now Code section stores the code/instructions we have created in our java code file. Stack and Heap memory provides space for our variables in RAM.*/
        /*Primitive datatypes take space normally from the Stack memory(Primitive data types include byte, short, int, long, float, double, boolean, and char), All the Primitive data types take space from stack memory.*/
        int a = 10;
        /*Here a will get 4 bytes of space from stack memory Because here we know the size of “x” is not gonna change. It's value can change but its size is static.*/

        //2.HEAP
        /*Dynamic arrays take space from heap memory, Heap memory gives us functionality that while runtime also we can get more space, Now arrays whose size normally changed while runtime gets the space from heap memory.*/
        int b[]=new int[10];
        /*lets whenever we write "new" keyword while declaration so that variable gets stored in heap memory.*/
        /*Here we have declared our array “b” which can store 10 integer values, now this array will take space from heap memory, size of this array would be 10*4= 40 bytes.*/

        //In JAVA, JVM manages heap memory and stack memory for us, IN CPP, Developer have to manage them.
    }
}

