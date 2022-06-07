package md.utm.isa.faf.gen.md.utm.isa.faf.dsl.enums;


import java.util.Arrays;

public enum FinTypes {
    SRL, Individual;

    public static boolean contains(String test) {

        for (FinTypes c : FinTypes.values()) {
            if (c.name().equals(test)) {
                return true;
            }
        }

        return false;
    }

    public static FinTypes getFinTypeByName(String name) {
        return Arrays.stream(FinTypes.values()).filter(f -> f.name().equalsIgnoreCase(name)).findFirst().orElse(null);
    }
}
