package todo;

class ToDo {
    private String name;
    private String description;
    private double priority;
    private Person person;

    ToDo(String name, String description, double priority, Person person) {
        this(name, description, priority);
        this.person = person;
    }

    ToDo(String name, String description, double priority) {
        this(name, description);
        this.priority = priority;
    }

    ToDo(String name, String description) {
        this.name = name;
        this.description = description;
    }

    boolean highPriority() {
        return priority > 0;
    }

    boolean mediumPriority() {
        return priority == 0;
    }

    boolean lowPriority() {
        return priority < 0;
    }
}
