package notebook;

class Notebook {
    String producer;
    String model;
    int memory;
    double processorClock;
    boolean hasOperatingSystem;

    Notebook(String producer, String model, int memory, double processorClock, boolean hasOperatingSystem) {
        this(producer, model, processorClock);
        this.memory = memory;
        this.hasOperatingSystem = hasOperatingSystem;
    }

    Notebook(String producer, String model, double processorClock, boolean hasOperatingSystem) {
        this(producer, model, processorClock);
        this.hasOperatingSystem = hasOperatingSystem;
    }

    Notebook(String producer, String model, int memory, double processorClock) {
        this(producer, model, processorClock);
        this.memory = memory;
    }

    private Notebook(String producer, String model, double processorClock) {
        this.producer = producer;
        this.model = model;
        this.processorClock = processorClock;
    }
}
