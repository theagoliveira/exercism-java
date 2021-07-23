class SpaceAge {
    private double seconds;
    private double[] ageOn = new double[8];
    private static final double[] ORBITAL_PERIODS = {0.2408467, 0.61519726, 1.0000000, 1.8808158,
            11.862615, 29.447498, 84.016846, 164.79132};

    enum Planet {
        MERCURY(0), VENUS(1), EARTH(2), MARS(3), JUPITER(4), SATURN(5), URANUS(6), NEPTUNE(7);

        private int pos;

        Planet(int i) {
            pos = i;
        }

        int getPos() {
            return pos;
        }
    }

    SpaceAge(double seconds) {
        double ref = seconds / 31557600;

        this.seconds = seconds;

        for (int i = 0; i < ageOn.length; i++) {
            ageOn[i] = ref / ORBITAL_PERIODS[i];
        }
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return ageOn[Planet.EARTH.getPos()];
    }

    double onMercury() {
        return ageOn[Planet.MERCURY.getPos()];
    }

    double onVenus() {
        return ageOn[Planet.VENUS.getPos()];
    }

    double onMars() {
        return ageOn[Planet.MARS.getPos()];
    }

    double onJupiter() {
        return ageOn[Planet.JUPITER.getPos()];
    }

    double onSaturn() {
        return ageOn[Planet.SATURN.getPos()];
    }

    double onUranus() {
        return ageOn[Planet.URANUS.getPos()];
    }

    double onNeptune() {
        return ageOn[Planet.NEPTUNE.getPos()];
    }
}
