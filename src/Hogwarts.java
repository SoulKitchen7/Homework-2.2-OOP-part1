public class Hogwarts {
    private String name;
    private int magicPower;
    private int transgress;

    public Hogwarts(String name, int magicPower, int transgress) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    public int sumOfGeneralAbilities() {
        return magicPower + transgress;
    }
    public int compareGenralAbilities(Hogwarts student) {
        if (sumOfGeneralAbilities() > student.sumOfGeneralAbilities()) {
            System.out.println(getName() + " лучше, чем " + student.getName());
        } else {
            System.out.println(student.getName() + " лучше, чем " + getName());
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgress=" + transgress +
                '}';
    }
}
