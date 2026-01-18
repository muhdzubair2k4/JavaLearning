package JavaLearning.Stream;

import java.util.ArrayList;
import java.util.List;

class SalaryRecord {
    String employeeName;
    int salary;
    int bonus;

    public SalaryRecord(String employeeName, int salary, int bonus) {
        this.employeeName = employeeName;
        this.salary = salary;
        this.bonus = bonus;
    }
}
public class QuestionSalarySummary {

    public List<String> getSummary(List<SalaryRecord> records) {
        List<String> result = new ArrayList<>();

        for (SalaryRecord record : records) {
            if (record.salary > 50_000) {
                int totalEarnings = record.salary + record.bonus;
                result.add(record.employeeName  + " " + totalEarnings);
            }
        }

        return result;
    }
}

class Demo {
    public static void main(String[] args) {

        List<SalaryRecord> records = new ArrayList<>();
        records.add(new SalaryRecord("Ali Raza", 60000, 10000));
        records.add(new SalaryRecord("Muhammad Zubair", 45000, 5000));
        records.add(new SalaryRecord("Karan Kumar", 75000, 15000));


        QuestionSalarySummary summary = new QuestionSalarySummary();
        List<String> output = summary.getSummary(records);


        for (String result : output) {
            System.out.println(result);
        }
    }
}


