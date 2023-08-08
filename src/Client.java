package src;

import java.util.LinkedList;
import java.util.Queue;

public class Client {
        private Queue<String> clients;

        public Client(String[] temporaryClient) {
            this.clients = new LinkedList<>();
            fillQueue(temporaryClient);
        }

        public void fillQueue(String[] temporaryClient) {
            for (String client : temporaryClient) {
                clients.offer(client);
            }
        }

        public void modifyQueue(String elementModify, String newValue) {
            Queue<String> tempQueue = new LinkedList<>();

            while (!this.clients.isEmpty()) {
                String element = this.clients.poll();
                String modifiedElement = element.replace(elementModify, newValue);
                tempQueue.offer(modifiedElement);
            }

            this.clients.addAll(tempQueue);
        }

        public String findElementQueue(String element) {
            Queue<String> tempQueue = new LinkedList<>(this.clients);

            String elementoEncontrado = null;

            while (!tempQueue.isEmpty()) {
                String elemento = tempQueue.poll();
                if (elemento.contains(element)) {
                    elementoEncontrado = elemento;
                    break;
                }
            }

            return elementoEncontrado;
        }

        public void showQueue() {
            Queue<String> tempQueue = new LinkedList<>(this.clients);

            for (String element : tempQueue) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(element);
            }
        }
    }


