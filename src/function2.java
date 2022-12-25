public class function2 {
    public static void main (String[] args){
        float x1=4.5f;
        int x2=7;
        double x3=454545.67;
/////////Calling function with “int” input///////////////////
        int intOutput =myfun(x2);
        System.out.println(intOutput);
/////////////Calling function with float input///////////////////////
        float floatOutput =myfun(x1);
        System.out.println(floatOutput);
////////Calling function with Double input///////////////////////////
        double doubleOutput =myfun(x3);
        System.out.println(doubleOutput);
    }
    //////////////Defined Function with different parameters.////
    public static int myfun(int x){return x*x;}
    public static float myfun(float x){return x*x;}
    public static double myfun(double x){return x*x;}

}
/*Method Overloading - If a class has multiple methods having the same name but different parameters, it is known as Method Overloading. JAVA supports method overloading and for implementing this, we can create multiple functions with the same name but different parameters. This helps us in applying the function logic to all kinds of data types.*/
/*Functions get space for their variables from Stack memory, So whenever a function is called one Activation Record of that function is been created in Stack memory.*/