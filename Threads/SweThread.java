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

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}


public class SweThread {
    public static void main(String[] args) {
        Agents agent1 = new Agents();
        Agents agent2 = new Agents();

        agent1.setAgentName("Rafin");
        agent2.setAgentName("Rafinnmnn");

        agent1.start();
        try {
            agent1.join();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        agent2.start();

    }
}
