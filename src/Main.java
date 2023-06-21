public class Main {
    public static void main(String[] args) {
        Socket socket = new Socket();
        Telephone telephone = new Telephone();
        Charge adapter = new Adapter(socket);
        adapter.charge(telephone);
    }
}