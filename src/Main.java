import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        GryffindorStudent harry = generateGryffindorStudent("Hary Potter");
        GryffindorStudent ron = generateGryffindorStudent("Ron Uizli");
        RavenclawStudent luna = generateRavenclawStudent();
        SlytherinStudent draco = generateSlytherinStudent("Drako Manfloy");
        HufflepuffStudent cedric = generateHufflepuffStudent("Sedrik Diggori");
        harry.print();
        ron.print();
        luna.print();
        draco.print();
        cedric.print();

        harry.compareHogwarts(draco);
        harry.compareGryffindor(ron);


    }

    private static HufflepuffStudent generateHufflepuffStudent(String name) {
        return new HufflepuffStudent(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static SlytherinStudent generateSlytherinStudent(String name) {
        return new SlytherinStudent(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static RavenclawStudent generateRavenclawStudent() {
        return new RavenclawStudent("Polumna Langud",
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static GryffindorStudent generateGryffindorStudent(String name) {
        return new GryffindorStudent(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
                );
    }
}
