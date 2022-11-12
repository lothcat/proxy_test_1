package proxy;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your id: ");
        int id = scanner.nextInt();
        Subject subject = new Proxy(new RealSubject(id));
        subject.getPermission();
    }
}
