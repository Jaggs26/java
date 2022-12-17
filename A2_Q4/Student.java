import java.util.*;  

class Student {

    
    public String Name;
    public String University;
    public String Branch;
    public static String City;
    public static int PinCode;

    static {
        System.loadLibrary("Student");
    }

    public native void displayNative();

    public static void displayStatic() {
        System.out.println("\n** From Class Static Method **\n");
        System.out.println("City : "+City);
        System.out.println("Pin Code : " + PinCode);
    }

    public void display() {
        System.out.println("\n** From Object Method **\n");
        System.out.println("Name : "+Name);
        System.out.println("University : " + University);
        System.out.println("Branch : "+Branch);
    }

    public Student() {
        Name=University=Branch=City="";
        PinCode=-1;
    }

    public static void main(String[] args){

        Student student = new Student();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name : ");
        String name = sc.nextLine();
        System.out.println("Enter University: ");
        String univ = sc.nextLine();
        System.out.println("Enter Branch : ");
        String branch = sc.nextLine();
        System.out.println("Enter City : ");
        String city = sc.nextLine();
        System.out.println("Enter Pin Code : ");
        int pincode = sc.nextInt();

        student.Name = name;
        student.University = univ;
        student.City = city;
        student.Branch = branch;
        student.PinCode = pincode;

        student.displayNative();
        
    }
}
