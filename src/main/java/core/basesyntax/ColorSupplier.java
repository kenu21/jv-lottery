package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private static final Random random = new Random(47);

    public String getRandomColor() {
        Color[] colors = Color.values();
        return colors[random.nextInt(colors.length)].toString();
    }
}
