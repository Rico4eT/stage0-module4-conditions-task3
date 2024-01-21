package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary <= 0){
            System.out.println("wrong input!");
        } else if (salary <= 10000) {
            float tax = (float) 0.15;
            float salaryAfterTax = salary - salary * tax;
            System.out.println(salaryAfterTax);
        } else if (salary <= 20000) {
            float tax = (float) 0.18;
            float salaryAfterTax = salary - (salary * tax);
            System.out.println(salaryAfterTax);
        } else {
            float tax = (float) 0.20;
            float salaryAfterTax = salary - salary * tax;
            System.out.println(salaryAfterTax);
        }
    }
}
