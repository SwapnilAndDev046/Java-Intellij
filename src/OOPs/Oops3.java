package OOPs;

// Parametrized constructor

class door{
  int size;
  String name;
    door (int size,String name){///parametrized constructor
        this.size=size;
        this.name=name;
    }

    //method for the object
    void printInfo(){
        System.out.println(this.size);
        System.out.println(this.name);
    }
}
public class Oops3 {
    public static void main(String[] args) {
        door d1 = new door(14,"darwaja");//this is constructor only
        d1.printInfo();// calling a constructor
    }
}