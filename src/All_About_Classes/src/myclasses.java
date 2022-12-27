public class myclasses {
    static int DSACourse=3000;
    static double afterTax(int tax){//shareable method | static method
        return DSACourse+DSACourse*tax/100;
    }
}
/*We can also create static methods in classes,
The best practice is, inside a static method, use only static variables, and inside non-static methods use non-static variables.
From static methods, we can’t access non-static data members.*/