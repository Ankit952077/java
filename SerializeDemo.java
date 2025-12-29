import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.IOException;
import java.io.ObjectInputStream;

class Person implements Serializable{
     private int id;
    private String name;

    Person(int id,String name){
        this.id=id;
        this.name=name;

       
    }
    public int getId(){
            return id;
        }
        public String getName(){
            return name;
        }
    
}
public class SerializeDemo {

    public static void main(String[] args) {
        try(ObjectOutputStream out =new ObjectOutputStream(new FileOutputStream("Person.dat"))){
           Person p=new Person(1, "ankit");
            out.writeObject(p);
            System.out.println("Serializable");

        }catch(IOException e){
            e.printStackTrace();
        }

        try(ObjectInputStream in=new ObjectInputStream(new FileInputStream("Person.dat"))){
            Person p2=(Person)in.readObject();
            System.out.println("DeSerializable "+"||ID --"+p2.getId()+ "||Name -- "+p2.getName());
        }
        catch(IOException | ClassNotFoundException e){
            System.out.println("file not Find");
        }
    }
}