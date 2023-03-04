class Ravenclaw extends Hogwarts{
    private int smart;
    private int wise;
    private int witty;
    private int creative;

    public Ravenclaw(String name, int magicPower, int transgress, int smart, int wise, int witty, int creative) {
        super(name, magicPower, transgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    public int sumOfRavenclawAbilities() {
        return smart + wise + witty + creative;
    }
    public int compareRavenclawStudent(Ravenclaw student) {
        if (sumOfRavenclawAbilities() > student.sumOfRavenclawAbilities()) {
            System.out.println(getName() + " лучше, чем" + student.getName());
        } else {
            System.out.println(student.getName() + " лучше, чем " + getName());
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Ravenclaw{" +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creative=" + creative +
                '}';
    }
}
