class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magicPower, int transgress, int nobility, int honor, int bravery) {
        super(name, magicPower, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int sumOfGryffindorAbilities() {
        return nobility + bravery + honor;
    }

    public int compareGryffindorStudent(Gryffindor student) {
        if (sumOfGryffindorAbilities() > student.sumOfGryffindorAbilities()) {
            System.out.println(getName() + " лучше, чем " + student.getName());
        } else {
            System.out.println(student.getName() + " лучше, чем " + getName());
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString()+
        "Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
