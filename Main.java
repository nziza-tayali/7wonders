
class SevenWonders {
    public void displayInfo() {
        System.out.println("This is one of the New 7 Wonders of the World.");
    }
}

class GreatWall extends SevenWonders {
    @Override
    public void displayInfo() {
        System.out.println("1. Great Wall of China: Built to protect against invasions, stretching thousands of miles.");
    }
}

class ChichenItza extends SevenWonders {
    @Override
    public void displayInfo() {
        System.out.println("2. Chichen Itza: A massive Maya city in Mexico famous for its stepped pyramid, El Castillo.");
    }
}

class Petra extends SevenWonders {
    @Override
    public void displayInfo() {
        System.out.println("3. Petra: A famous archaeological site in Jordan's southwestern desert, carved directly into pink rock cliffs.");
    }
}

class MachuPicchu extends SevenWonders {
    @Override
    public void displayInfo() {
        System.out.println("4. Machu Picchu: An Incan citadel set high in the Andes Mountains in Peru, built in the 15th century.");
    }
}

class ChristRedeemer extends SevenWonders {
    @Override
    public void displayInfo() {
        System.out.println("5. Christ the Redeemer: An iconic Art Deco statue of Jesus Christ in Rio de Janeiro, Brazil.");
    }
}

class Colosseum extends SevenWonders {
    @Override
    public void displayInfo() {
        System.out.println("6. Colosseum: An oval amphitheater in the centre of the city of Rome, Italy, built of travertine limestone.");
    }
}

class TajMahal extends SevenWonders {
    @Override
    public void displayInfo() {
        System.out.println("7. Taj Mahal: An ivory-white marble mausoleum on the bank of the Yamuna river in Agra, India.");
    }
}

public class Main {
    public static void main(String[] args) {
        SevenWonders[] wonders = {
            new GreatWall(),
            new ChichenItza(),
            new Petra(),
            new MachuPicchu(),
            new ChristRedeemer(),
            new Colosseum(),
            new TajMahal()
        };

        System.out.println("--- The New 7 Wonders of the World (Java Polymorphism) ---\n");

        for (SevenWonders wonder : wonders) {
            wonder.displayInfo();
        }
    }
}