interface Mammal {
    void feedYoungWithMilk();
}
interface Bird {
    void layEggs();
}
 class Platypus implements Mammal, Bird {
    public void feedYoungWithMilk() {
        System.out.println("Platypus is feeding its young with milk.");
    }
    public void layEggs() {
        System.out.println("Platypus is laying eggs.");
    }
    public static void main(String[] args) {
        Platypus platypus = new Platypus();
        platypus.feedYoungWithMilk();
        platypus.layEggs();
    }
}
