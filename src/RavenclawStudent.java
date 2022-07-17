public class RavenclawStudent extends HogwartsStudent {
    private int cleverness;
    private int wisdom;
    private int wit;
    private int creativety;

    public RavenclawStudent(String name, int magic, int transgression, int cleverness, int wisdom, int wit) {
        super(name, magic, transgression);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativety = creativety;
    }

    public int getCleverness() {
        return cleverness;
    }

    public void setCleverness(int cleverness) {
        this.cleverness = cleverness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativety() {
        return creativety;
    }

    public void setCreativety(int creativety) {
        this.creativety = creativety;
    }

    private int ability() {
        return cleverness + wisdom + wit + creativety;
    }

    public void compareRavenclaw(RavenclawStudent ravenclawStudent) {
        int ability1 = ability();
        int ability2 = ravenclawStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Student %s better than student %s: %d VS %d%n", getName(), ravenclawStudent.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Student %s better than student %s: %d VS %d%n", getName(), ravenclawStudent.getName(), ability2, ability1);
        }
        else{
            System.out.printf("Student %s same as a student %s: %d VS %d%n", getName(), ravenclawStudent.getName(), ability2, ability1);
        }
    }

    @Override
    public String toString(){
        return String.format("%s; cleverness: %d; wisdom: %d; wit: %d; creativety: %d",super.toString(),cleverness, wisdom,wit,creativety);
    }
}
