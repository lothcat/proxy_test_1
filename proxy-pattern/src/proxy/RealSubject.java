package proxy;

public class RealSubject implements Subject {
    private int id;

    public RealSubject(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public void getPermission() {
        System.out.println("Magic use allowed.");
        System.out.println("You have successfully made:");
    }
}
