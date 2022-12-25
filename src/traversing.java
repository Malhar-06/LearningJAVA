public class traversing {
    public static void main (String[] args){
        int i = 0;
        String arr[] = {"Malhar","Pranav","Pranit","Deep","Vedant"};
        for (System.out.println("Me and My friends");i<arr.length;++i){
            System.out.println(arr[i]);
        }

        System.out.println("Second Method Output:-->");
        //We have one more interesting and short way to traverse an array.
        for (String name:arr){
            System.out.println(name);
        }
    }
}
/*It will print all the elements of the array. It will go to the array, Pick the first element and store it in variable “name” and then print it, now it will pick the second element, print it, and so on.*/