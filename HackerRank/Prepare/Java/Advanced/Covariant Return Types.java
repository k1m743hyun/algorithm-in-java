import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Complete the classes below
class Flower {
    String whatsYourName() {
        return this.getClass().getSimpleName();
    }
}

class Jasmine extends Flower {}

class Lily extends Flower {}

class Region {
    Flower yourNationalFlower() {
        return new Flower();
    }
}

class WestBengal extends Region {
    @Override
    Jasmine yourNationalFlower() {
        return new Jasmine();
    }
}

class AndhraPradesh extends Region {
    @Override
    Lily yourNationalFlower() {
        return new Lily();
    }
}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        Region region = null;
        switch (s) {
            case "WestBengal":
                region = new WestBengal();
                break;
            case "AndhraPradesh":
                region = new AndhraPradesh();
                break;
        }
        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());
    }
}