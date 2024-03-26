class parent{
    public static void show(){
        System.out.println("in show of parent class...");
    }
    public void display(){
        System.out.println("in display of parent  class...");
    }
}
class child extends parent{
    public static void show(){
        System.out.println("in show of child class...");
    }
    public void display(){
        System.out.println("in display of child class...");
    }
}
public class usebinding {
    public static void main(String[] args) {
        parent p=new parent();
        //Early bbinding
        p.show();
        p.display();
        p=new child();
        // Late Binding
        p.show();
        p.display();
    }
    
}
