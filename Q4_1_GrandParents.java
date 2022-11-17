class GrandParents
{
    String GrandFatherName;
    String GrandMotherName;

    public GrandParents(String grandFatherName, String grandMotherName) {
        GrandFatherName = grandFatherName;
        GrandMotherName = grandMotherName;
        System.out.println("GrandFatherName: "+grandFatherName);
        System.out.println("GrandMotherName: "+grandMotherName);
    }
}
public class Q4_1_GrandParents
{
    public static void main(String[] args) {
        GrandParents gp = new GrandParents("Uttreshwar","Ganga");
    }
}
