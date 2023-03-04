public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor ("Гарри Поттер", 100, 90, 90, 95, 90);
        Gryffindor germionaGreindger = new Gryffindor("Гермиона Грейнджер", 90, 80, 80, 90, 75);
        Gryffindor ronWisley = new Gryffindor("Рон Уизли", 70, 70,80, 80, 85);
        Slytherin dracjMalfoy = new Slytherin("Драко Малфой", 85,80,90, 70,90, 80,90);
        Slytherin grehemMontegue = new Slytherin("Грэхэм Монтегю", 60, 50, 65, 70, 55, 40, 30);
        Slytherin gregoryGoil = new Slytherin("Грегори Гойл", 60, 50,50, 46, 55,40, 34);
        Hufflepuff zahariaSmith = new Hufflepuff("Захария Смит", 75, 40, 70, 60, 60);
        Hufflepuff cedrickDigory = new Hufflepuff("Седрик Диггори", 90, 70, 80, 90, 90);
        Hufflepuff jastinFinchFletchly = new Hufflepuff("Джастин Финч-Флетчли", 80, 60, 70,70, 75);
        Ravenclaw chjouChang = new Ravenclaw("Чжоу Чанг", 60, 50, 70, 75,70, 80);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 50, 50, 60, 55,45, 40);
        Ravenclaw marcusBelbi = new Ravenclaw("Маркус Белби", 50, 40, 55, 55,60, 30);

        printStudentAbilities(padmaPatil);
        System.out.println();
        harryPotter.compareGryffindorStudent(germionaGreindger);
        marcusBelbi.compareRavenclawStudent(chjouChang);
        jastinFinchFletchly.compareHufflepuffStudent(cedrickDigory);
        gregoryGoil.compareSlytherinStudent(grehemMontegue);
        System.out.println();
        harryPotter.compareGenralAbilities(dracjMalfoy);

    }

    // Метод печати характеристик студента
    public static void printStudentAbilities(Hogwarts student) {
        System.out.println(student);
    }

}