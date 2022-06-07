package md.utm.isa.faf.gen.md.utm.isa.faf.dsl.enums;

import java.util.Arrays;

public enum Currency {
    USD, EUR, MDL, RON, RUB, UAH;

    public static boolean contains(String test) {

        for (Currency c : Currency.values()) {
            if (c.name().equals(test)) {
                return true;
            }
        }

        return false;
    }

    public static Currency getCurrencyByName(String name) {
        return Arrays.stream(Currency.values()).filter(f -> f.name().equalsIgnoreCase(name)).findFirst().orElse(null);
    }
}
