package example1;
public class Person {
    private String name;
    private String idNumber;
    
    public Person(String name, String idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    public String toString() {
        String idNumberX = idNumber.substring(0, 7) + "XXXX";
        return "Name: " + name + ", Id number: " + idNumberX;
    } 

    
    
}
