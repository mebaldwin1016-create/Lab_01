public class main {

    public static void main(String[] args)
    {
        Person cody = new Person("00000001", "Cody", "Rhodes", "Mr.", 1985);
        System.out.println(cody);

        cody.setLastName("Rhodes");
        System.out.println(cody);
    }
}
