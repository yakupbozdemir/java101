public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name,int salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    int tax(){
        if (salary<1000){
            return 0;
        } else{
            return ((salary * 3)/100);
        }
    }
    int bonus(){
        if (workHours>40){
            return (workHours - 40)*30;
        }else {
            return 0;
        }
    }
    int raiseSalary(){
        if ((2021-hireYear)>19){
            return ((salary * 15)/100);
        } else if (((2021-hireYear)<20) && ((2021-hireYear)>9)) {
            return ((salary * 10)/100);
        } else if ((2021-hireYear)<9) {
            return ((salary * 5)/100);
        }
        return 0;
    }
    public String toString(){
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı :" + this.salary);
        System.out.println("Çalışma Saati :" + this.workHours);
        System.out.println("Başlangıç Yılı : "+ this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " +(salary + (bonus()-tax())));
        System.out.println("Toplam Maaş : " + (this.salary + raiseSalary()));
        return null;
    }
}
