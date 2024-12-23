package Practice_Fall23;

class Instruments {

    String name;

    public Instruments() {
        this.name = "Instruments";
    }

    public void play() {
        System.out.println("Playing the " + name);
    }

    public void tune() {
        System.out.println("Tuning the " + name);
    }

}

class Guiter extends Instruments {
    public Guiter() {
        System.out.println("Ukulele is the smallest form of Guiter");
    }

    @Override
    public void play() {
        System.out.println("Strumming the guiter");
    }

    public void tune(String tunning) {
        System.out.println("Tunning the guiter to " + tunning);
    }
}

class Piano extends Instruments {
    public Piano(String form) {
        System.out.println("Kalimba is also known as " + form + " piano");
    }

    public void tune(String tunning) {
        System.out.println("Tunning the piano to " + tunning);
    }

}

public class MusicStore {
    public static void main(String[] args) {
        Instruments instrumental = new Instruments();
        instrumental.play();
        instrumental.tune();

        Guiter ukulele = new Guiter();
        ukulele.play();
        ukulele.tune("Drop D");

        Piano kalimba = new Piano("Pocket");
        kalimba.tune("key 440");

    }
}
