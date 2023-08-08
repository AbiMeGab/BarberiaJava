package src;

public class Main {
    public static void main(String[] args) {
        String[] arrayClients = new String[8];
        int count = 0;

        for (int i = 0; i < 8; i++) {
            count++;
            arrayClients[i] = "c" + count;
        }

        Client clients = new Client(arrayClients);
        count = 0;

        System.out.println();

        clients.showQueue();

        for (int i = 0; i < 8; i++) {
            count++;

            String newValue = "c" + count + ", en espera";
            clients.modifyQueue(arrayClients[i], newValue);
        }

        attention(clients, 0, ", en espera", ", en atencion");
        attention(clients, 0, ", en atencion", ", servido");
        attention(clients, 2, ", en espera", ", en atencion");
        attention(clients, 2, ", en atencion", ", servido");
        attention(clients, 4, ", en espera", ", en atencion");
    }

    public static void attention(Client clients, int count, String text1, String text2) {
        System.out.println();

        for (int i = 0; i < 2; i++) {
            count++;
            String find = clients.findElementQueue(text1);
            String value = "c" + count + text2;
            clients.modifyQueue(find, value);
        }

        clients.showQueue();

        System.out.println();
    }
}