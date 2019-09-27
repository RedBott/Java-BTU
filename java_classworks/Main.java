package java_classworks;
/**
 * Week_3_1
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        TestStudent student1 = new TestStudent();
        student1.name = "Andrei";
        student1.lastName = "Tsitsvidze";
        TestStudent student2 = new TestStudent();
        student2.name = "Edvard";
        student2.lastName = "Gogidze";
        student1.printData();
        student2.printData();
    }
}