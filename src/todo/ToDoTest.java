package todo;

public class ToDoTest {
    public static void main(String[] args) {

        Person person = new Person("Jan", "Kowalski", 25);

        ToDo zadanie1 = new ToDo("Zadanie1", "Zrobić zadanie domowe", 1.4, person);
        ToDo zadanie2 = new ToDo("Zadanie1", "Zrobić zadanie domowe", -0.3, person);
        ToDo zadanie3 = new ToDo("Zadanie2", "Posprzątać", 0);
        ToDo zadanie4 = new ToDo("Zadanie3", "Zrobić zakupy");

        System.out.println("Zadanie 1 - highPriority (" + zadanie1.highPriority() + ")");
        System.out.println("Zadanie 1 - mediumPriority (" + zadanie1.mediumPriority() + ")");
        System.out.println("Zadanie 1 - lowPriority (" + zadanie1.lowPriority() + ")");

        System.out.println("Zadanie 2 - highPriority (" + zadanie2.highPriority() + ")");
        System.out.println("Zadanie 2 - mediumPriority (" + zadanie2.mediumPriority() + ")");
        System.out.println("Zadanie 2 - lowPriority (" + zadanie2.lowPriority() + ")");

        System.out.println("Zadanie 3 - highPriority (" + zadanie3.highPriority() + ")");
        System.out.println("Zadanie 3 - mediumPriority (" + zadanie3.mediumPriority() + ")");
        System.out.println("Zadanie 3 - lowPriority (" + zadanie3.lowPriority() + ")");

        System.out.println("Zadanie 4 - highPriority (" + zadanie4.highPriority() + ")");
        System.out.println("Zadanie 4 - mediumPriority (" + zadanie4.mediumPriority() + ")");
        System.out.println("Zadanie 4 - lowPriority (" + zadanie4.lowPriority() + ")");
    }
}
