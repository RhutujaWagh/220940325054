
class GrandParentss
{
    String grandFatherName;
    String grandMotherName;

    public GrandParentss(String grandFatherName, String grandMotherName)
    {
        this.grandFatherName=grandFatherName;
        this.grandMotherName=grandMotherName;

        System.out.println("Name of Grand Father is : "+grandFatherName);
        System.out.println("Name of Grand Mother is : "+grandMotherName);
    }
}


class Parentss extends GrandParent {
    String FatherName;
    String MotherName;


    public Parentss(String FatherName, String MotherName, String grandFatherName, String grandMotherName) {
        super(grandFatherName, grandMotherName);
        this.FatherName = FatherName;
        this.MotherName = MotherName;

        System.out.println("Name of Father is : " + FatherName);
        System.out.println("Name of Mother is : " + MotherName);
    }
}
public class Family
{
    public static void main(String[] args) {
        Parentss p = new Parentss("Rajendra","Ayodhya","Uttreshwar","Ganga");

    }
}