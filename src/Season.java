public enum Season {
    SPRING(16) {
        @Override
        public void theColdestSeason() {
            System.out.println("I like spring,cause the weather is really nice");
        }
    },
    SUMMER(22) {
        @Override
        public void theColdestSeason() {
            System.out.println("I don't like summer,cause I don't like the hot weather");
        }
    },
    AUTUMN(-10) {
        @Override
        public void theColdestSeason() {
            System.out.println("I like autumn,cause the weather is like fairy tale");
        }
    },
    WINTER(-5) {
        @Override
        public void theColdestSeason() {
            System.out.println("I like winter for snow,but don't like very cold weather");
        }
    };
    private double temperature;

    Season(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return ""+temperature ;
    }
    public  abstract void theColdestSeason();

    }


