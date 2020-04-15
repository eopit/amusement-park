package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
  private String name;
  private WorkerLevel Level;
  private double baseSalary;
  
  // Compositions
  private Departament departament;
  private List<HourContract> contracts = new ArrayList<>();
  
  public Worker() {
  
  }
  
  public Worker(String name, WorkerLevel level, double baseSalary, Departament departament) {
    this.name = name;
    Level = level;
    this.baseSalary = baseSalary;
    this.departament = departament;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public WorkerLevel getLevel() {
    return Level;
  }
  
  public void setLevel(WorkerLevel level) {
    Level = level;
  }
  
  public double getBaseSalary() {
    return baseSalary;
  }
  
  public void setBaseSalary(double baseSalary) {
    this.baseSalary = baseSalary;
  }
  
  public Departament getDepartament() {
    return departament;
  }
  
  public void setDepartament(Departament departament) {
    this.departament = departament;
  }
  
  public List<HourContract> getContracts() {
    return contracts;
  }
  
  public void addContract(HourContract contract) {
    contracts.add(contract);
  }
  
  public void removeContract(HourContract contract) {
    contracts.remove(contract);
  }
  
  public double income(int year, int month) {
    double salary = baseSalary;
    Calendar cal = Calendar.getInstance();
    for (HourContract contract :
        contracts) {
      cal.setTime(contract.getDate());
      int cal_year = cal.get(Calendar.YEAR);
      int cal_month = 1 + cal.get(Calendar.MONTH); // Calendar month starts with 0 (0 --> january)
      if (year == cal_year && month == cal_month) {
        salary += contract.totalValue();
      }
    }
    return salary;
  }
}
