package OOPs;
// copy constructor use in oops
public class Oops4 {
    public static void main(String[] args) {
        car c1 =new car();// hya la define karnya sathi navin default contructor taka
        c1.price=400000;
        c1.name="Maruti";

        car c2 = new car(c1);
        c2.carInfo();
    }

}
class car{
int price;
String name;
// copy constructor
car(car c2){
    this.name=c2.name;
    this.price=c2.price;
}
//method
void carInfo(){
    System.out.println(this.name);
    System.out.println(this.price);
}
//default constructor for c1
    car(){

    }
}