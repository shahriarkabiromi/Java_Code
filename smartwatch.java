interface Smartphone {
    void makeCall();
    void accessApps();
}

interface Wristwatch {
    void tellTime();

    void trackFitness();

    class Smartwatch implements Smartphone, Wristwatch {

        public void makeCall() {
            System.out.println("Smartwatch is making a call.");
        }

        public void accessApps() {
            System.out.println("Smartwatch is accessing apps.");
        }

        public void tellTime() {
            System.out.println("Smartwatch is telling the time.");
        }

        public void trackFitness() {
            System.out.println("Smartwatch is tracking fitness.");
        }

        public static void main(String[] args) {
            Smartwatch smartwatch = new Smartwatch();
            smartwatch.makeCall();
            smartwatch.accessApps();
            smartwatch.tellTime();
            smartwatch.trackFitness();
        }
    }
}
