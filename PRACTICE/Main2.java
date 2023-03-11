package PRACTICE;

class parent {
    int id;
    void add(){
        System.out.println("this is parent class");
    }
}
class child extends parent
{
    void add(){
        System.out.println("this is child class");
    }
    void add(int a){
        System.out.println("this is child another class");

    }
    void add(String a){
        System.out.println("this is child another  string class");

    }
    
}

public class Main2 {
    public static void main(String[] args) {
        child chi= new  child();
        // chi.add();
        // chi.add(5);
        chi.add("5");


    }
}


