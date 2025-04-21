package Threads;

class Agents extends Thread{
    private String name;

    public void setAgentName(String name){
        this.name = name;
    }
    
    public String getname(){
        return name;
    }

    public void run(){
        System.out.println(getname() + " is processing ticket");

    }
}


public class TicketCounter {
    public static void main(String[] args) {
        Agents agent1 = new Agents();
        Agents agent2 = new Agents();
        Agents agent3 = new Agents();
        Agents agent4 = new Agents();
        Agents agent5 = new Agents();

        agent1.setAgentName("Rafin");
        agent2.setAgentName("Rafinnmnn");
        agent3.setAgentName("Ra");
        agent4.setAgentName("Rafi");
        agent5.setAgentName("R");



        agent1.start();
        try {
            // agent1.join();
            Thread.sleep(2000);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        agent2.start();

        try {
            // agent2.join();
            Thread.sleep(2000);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        
        agent3.start();

        try {
            // agent3.join();
            Thread.sleep(2000);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        agent4.start();
        try {
            // agent4.join();
            Thread.sleep(2000);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        agent5.start();

        try {
            // agent5.join();
            Thread.sleep(2000);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }


    }
}
