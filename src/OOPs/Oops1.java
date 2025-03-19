package OOPs;

 public class Oops1 {
    public static void main(String[] args) {
        student TenthStd = new student();
      TenthStd.name="Meena";
       TenthStd.RollNo=68;
       TenthStd.percentage=45.8;
        System.out.println(TenthStd.name);

        Dog Breed = new Dog();
        Breed.name="max";
        Breed.KillCount=10;
        System.out.println(Breed.name);


    }
//static class
     public static class student {

        private String name;
        private int RollNo;
       private  double percentage;


     }

}
//instance class
 class Dog{
    String name;
    int KillCount;



}
