

class GrandParent
{
    String grandFatherName;
    String grandMotherName;

    //Constructor of class GrandParent
    public GrandParent(String grandFatherName, String grandMotherName)
    {
        this.grandFatherName=grandFatherName;
        this.grandMotherName=grandMotherName;

        System.out.println("Name of Grand Father is : "+grandFatherName);
        System.out.println("Name of Grand Mother is : "+grandMotherName);
    }
}


class Parent extends GrandParent
{
    String FatherName;
    String MotherName;


    public Parent(String FatherName,String MotherName,String grandFatherName, String grandMotherName)
    {
        super(grandFatherName, grandMotherName);
        this.FatherName=FatherName;
        this.MotherName=MotherName;

        System.out.println("Name of Father is : "+FatherName);
        System.out.println("Name of Mother is : "+MotherName);
    }


    public Parent(String grandFatherName, String grandMotherName) {
        super(grandFatherName, grandMotherName);
    }
}

public class Child extends Parent {
    public Child(String FatherName, String MotherName, String grandFatherName, String grandMotherName) {
        super(FatherName, MotherName, grandFatherName, grandMotherName);
    }

    public static void main(String args[]) {
        Child c = new Child("Rajendra", "Ayodhya", "Uttreshwar", "Ganga");
        //System.out.println(c.FatherName+ " "+c.MotherName+ " "+c.grandFatherName+ " "+c.grandMotherName);

    }
}