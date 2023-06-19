class Employee  {
    int id;
    String name;

    public void printDeatails() {
        System.out.println("My id is" +id);
        System.out.println("My Name is" +name);
    }
}
public class Opps{
    public static void main(String[] args) {
        Employee harry=new Employee();
        Employee Ankit=new Employee();
        harry.id=10;
        harry.name="CodeWithHarry";
        Ankit.id=11;
        Ankit.name="Danav";
        harry.printDeatails();
        Ankit.printDeatails();
    }
}
