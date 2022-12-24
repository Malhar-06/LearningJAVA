public class function {
    public static void main (String[] args) {

        int sumValue=myfun();
        System.out.println(sumValue);
    }

    static int myfun(){
        int x = 10;
        int y = 20;
        int z = x+y;
        return z;
    /*Here we have created a function named “myfun” which adds two values and return the sum of them. Now here as we are returning “z”(an int value) that’s why while defining the function we have mentioned its return data type. Now we can call this function from our main() function(entry point) and we can store the return value in a different variable.*/
    }
}
/*Function/Method - A method is a block of code that only runs when it is called. Now, this block of code we can call at any number of times according to our use. Functions are a good way to manage our code, For each different functionality that we think we will use multiple times, we can create a function for that.*/

//JAVA will always call the main() function because main function is the entry point of our complete code.