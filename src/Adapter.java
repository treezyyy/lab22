public class Adapter implements Charge {
    Socket socket;
    public Adapter (Socket socket){
        this.socket = socket;
    }


    @Override
    public void charge(Telephone telephone) {
        socket.charg();
        System.out.println("Новое напряжение");
        telephone.charg();
    }
}
