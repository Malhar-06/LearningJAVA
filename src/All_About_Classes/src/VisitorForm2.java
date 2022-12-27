public class VisitorForm2 {
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
