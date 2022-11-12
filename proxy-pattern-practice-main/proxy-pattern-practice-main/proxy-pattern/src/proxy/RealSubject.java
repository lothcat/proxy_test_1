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
        System.out.println("Permission allowed");
        System.out.println("Secret Recipe: " + "\nDragon Liver" + "\nMouse eyes");
    }
}
