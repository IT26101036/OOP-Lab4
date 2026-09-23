package Question_03;

public class Driver {

    private String driverID;
    private String driverName;
    private double baseSalary;
    private int performanceScore;

    public Driver(String driverName, String driverID){

        this.driverName = driverName;
        this.driverID = driverID;
    }

    public Driver(double baseSalary){

        this.baseSalary = baseSalary;

    }

    public Driver(String driverID, String driverName, double baseSalary, int performanceScore){

        this.driverName = driverName;
        this.driverID = driverID;
        this.baseSalary = baseSalary;
        this.performanceScore = performanceScore;

    }

    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public int getPerformanceScore() {
        return performanceScore;
    }

    public void setPerformanceScore(int performanceScore) {

        if(performanceScore <=5 && performanceScore>= 1){

            this.performanceScore = performanceScore;

        }
        else{

            this.performanceScore = 1;

        }

    }

    public double calculateBonus(){
        double bonus = 0;
        if (performanceScore == 1){

            bonus = 0;

        }
        else if(performanceScore == 2){

            bonus = 0.1;

        }
        else if(performanceScore == 3){

            bonus = 0.15;

        }
        else if(performanceScore == 4){

            bonus = 0.2;

        }
        else if(performanceScore == 5){

            bonus = 0.25;

        }
        return bonus;
    }

    public void calculateBonus(int customRating){

        double custom_Bonus = 0.0;
        double total_custom_bonus = 0;
        if(customRating == 5){

            custom_Bonus = 0.2;

        }
        else if(customRating ==4){

            custom_Bonus = 0.25;

        }
        else if(customRating == 3){

            custom_Bonus = 1.0/3;

        }
        else if(customRating == 2) {

            custom_Bonus = 0.5;

        }
        else if(customRating == 1){

            custom_Bonus = 0;

        }
        total_custom_bonus = custom_Bonus * baseSalary;


        System.out.println("Bonus for " + driverName + " with custom rating " + customRating + ": " + total_custom_bonus);

    }

    public double bonus_calculate(){

        double bonus_amount = baseSalary *calculateBonus();
        return bonus_amount;
    }

    public double calculateTotalSalary(){

        double total_salary = baseSalary + bonus_calculate();
        return total_salary;

    }
    public void printDetails(){

        System.out.println("Driver ID: " + driverID);
        System.out.println("Driver name: " + driverName);
        System.out.println("Base salary: " + baseSalary);
        System.out.println("Performance Score: " + getPerformanceScore());
        System.out.println("Bonus: " + bonus_calculate());
        System.out.println("Total salary: " + calculateTotalSalary());

        System.out.println();

    }

}
