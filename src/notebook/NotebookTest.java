package notebook;

public class NotebookTest {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("Dell","1230", 16384, 2.4, true );

        Notebook notebook2 = new Notebook("Toshiba", "AA12", 3.4, true );
        notebook2.memory = 12228;

        Notebook notebook3 = new Notebook("Samsung", "999", 16384, 2.6);
        notebook3.hasOperatingSystem = false;

        System.out.println(notebook1.producer + " " + notebook1.memory + " " + notebook1.model + " " +
                notebook1.processorClock + " " + notebook1.hasOperatingSystem);

        System.out.println(notebook2.producer + " " + notebook2.memory + " " + notebook2.model + " " +
                notebook2.processorClock + " " + notebook2.hasOperatingSystem);

        System.out.println(notebook3.producer + " " + notebook3.memory + " " + notebook3.model + " " +
                notebook3.processorClock + " " + notebook3.hasOperatingSystem);
    }
}
