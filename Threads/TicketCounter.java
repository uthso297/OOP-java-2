package Threads;

class Agent extends Thread{
    private String name;

    public void setAgentName(String name){
        this.name = name;
    }

    public String getAgentName(){
        return name;
    }

    public void run(){
        System.out.println(getAgentName() +" is handling customer and ticket request");
    }
}

public class TicketCounter {
    public static void main(String[] args) {
        Agent agent1 = new Agent();
        Agent agent2 = new Agent();
        agent1.setAgentName("Uthso");
        agent1.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        agent2.setAgentName("Sihab");
        agent2.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
