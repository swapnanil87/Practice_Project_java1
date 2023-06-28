package demo1;

public class AccessModifiersExample {
    public static void main(String[] args) {
        
        MyClass myobj = new MyClass();

        
        myobj.publicMthd();
        System.out.println("Public variable: " + myobj.publicVrbl);

        myobj.protectedMthd();
        System.out.println("Protected variable: " + myobj.protectedVrbl);

        myobj.defaultMthd();
        System.out.println("Default variable: " + myobj.defaultVrbl);
        
       
        
    }
}

class MyClass {
    public int publicVrbl = 10;
    protected int protectedVrbl = 20;
    int defaultVrbl = 30;
    private int privateVrbl = 40;

    public void publicMthd() {
        System.out.println("This is a public method.");
    }

    protected void protectedMthd() {
        System.out.println("This is a protected method.");
    }

    void defaultMthd() {
        System.out.println("This is a default (package-private) method.");
    }

    private void privateMthd() {
        System.out.println("This is a private method.");
    }
}
