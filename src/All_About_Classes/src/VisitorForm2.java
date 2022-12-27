public class VisitorForm2 {
    static int DSACourse=3000; //shareable data member/variable
    /*We can create Shared variables inside a class, It will not take space from any object’s activation record. It will take space from stack memory itself but it would be outside of any object’s activation record. Hence, it is a shared variable for all the objects, All objects of that class can do read/write operations into it. We use this kind of shared variable in the case if we have to use a standard value for my objects, so instead of defining it separately in all the object's Activation records (which will cost a lot of ram space wastage)
      We can define a sharable variable in a class with a static keyword*/
    private int age;
    private int phone;
    private String name;

    public void setAge(int a){
        if(a>0){
            age=a;
        }
        else{
            System.out.println("Age can't be negative");
        }
    }

    public int getAge() {
        return age;
    }
}
