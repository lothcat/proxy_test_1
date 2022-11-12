package proxy;

public class Proxy implements Subject {
    private RealSubject proxyTarget;

    public Proxy(RealSubject proxyTarget) {
        this.proxyTarget = proxyTarget;
    }

    @Override
    public void getPermission() {
        // Deny access unless ID is > 100
        if (this.proxyTarget.getId() > 100){
            this.proxyTarget.getPermission();
        } else {
            System.out.println("Permission denied");
        }
    }
}
