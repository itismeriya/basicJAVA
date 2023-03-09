import java.util.*;

class Room {
    public int length;
    public int height;
    public int width;

    public int volume() {
        return this.height * this.width * this.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length: ");
        int length = sc.nextInt();
        System.out.print("enter width: ");
        int width = sc.nextInt();
        System.out.print("enter height: ");
        int height = sc.nextInt();
        sc.close();

        Room myroom = new DemoRoom();
        myroom.length = length;
        myroom.width = width;
        myroom.height = height;
        int vol = myroom.volume();

        System.out.println("Volume of myroom is " + vol);

    }
}

class DemoRoom extends Room {
}
