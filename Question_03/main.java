package Question_03;

public class main {

    public static void main(String args[]){

        Driver driver1 = new Driver("D1001", "John Smith", 10000.0, 5 );

        Driver driver2 = new Driver("D1002", "Emily Davis", 5000.0, 3);

        driver1.printDetails();
        driver2.printDetails();

        driver2.calculateBonus(4);




    }
}
