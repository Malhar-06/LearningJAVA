public class Myapp{
    public static void main (String[] args){
        VisitorForm Jay = new VisitorForm();//instantiation, Jay object created.
        VisitorForm Tushar = new VisitorForm();// Created a new object. Object Jay and Tushar are independent of each other.
        //The new keyword here is a signal to java that our object needs the space from heap memory.
        /*Now, As a good practice of management, We should create all of our classes in a separate file and our main business logic code in a separate file. Now if your custom classes file and the main app file is in the same directory then your Java compiler will automatically load those class in our main app file. When we compile our main app java file, Then behind the scene, it also compiles our custom class file (VisitorForm) because this class is used in the app file, so to run it they will have to compile it once.*/
    }
}

