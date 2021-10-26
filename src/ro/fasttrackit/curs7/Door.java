package ro.fasttrackit.curs7;

public class Door {
    //STATE deschis/inchis
    private boolean open;

    public Door() {
        this.open = false;

    }

    public boolean isOpen() {
        return open;
    }

    public void close() {
        if (this.open) {
            System.out.println("The door is already closed");
        }
    }

    public void open() {
        if (this.open) {
            System.out.println("The door is already open");
        } else {
            this.open = true;
        }


    }

    //constructor
    //BEHAVIOR
    //getters/setters...
}