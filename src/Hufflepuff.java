class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int magicPower, int transgress, int hardworking, int loyal, int honest) {
        super(name, magicPower, transgress);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public int sumOfHufflepuffAbilities() {
        return hardworking + loyal + honest;
    }
    public int compareHufflepuffStudent(Hufflepuff student) {
        if (sumOfHufflepuffAbilities() > student.sumOfHufflepuffAbilities()) {
            System.out.println(getName() + " лучше, чем" + student.getName());
        } else {
            System.out.println(student.getName() + " лучше, чем " + getName());
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Hufflepuff{" +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                '}';
    }
}
