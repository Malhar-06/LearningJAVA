public class Myapp2 {
    public static void main(String args[]){
        VisitorForm2 Jay = new VisitorForm2();
        VisitorForm2 Tushar = new VisitorForm2();
        Jay.setAge(20);
        Tushar.DSACourse=2000;
        System.out.println(Jay.getAge());
        System.out.println(Tushar.DSACourse);

        myclasses Malhar = new myclasses();
        myclasses Ahilya = new myclasses();
        System.out.println(Malhar.afterTax(20));
        System.out.println(Ahilya.afterTax(16));
    }
}
    /*Now as here in the above code, Tushar has changed the value of the static variable hence this is been changed for all the objects, so if we create a new object and try to read the value in the DSACourse data member you will get the output as 2000 instead of 3000(initial declared value)*/