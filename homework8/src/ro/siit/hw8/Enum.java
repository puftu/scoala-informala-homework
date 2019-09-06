package ro.siit.hw8;

public class Enum {

    public enum Gender {
        MALE, FEMALE;

        public static Gender getGender(String a) {
            Gender i = null;
            if (a.equals("male")) {
                i = MALE;
            } else if (a.equals("female")) {
                i = FEMALE;
            }
            return i;
        }

        public static Gender getGender(int a) {
            Gender i = null;
            if (a == 0) {
                i = MALE;
            } else if (a == 1) {
                i = FEMALE;
            }
            return i;
        }

    }
}
