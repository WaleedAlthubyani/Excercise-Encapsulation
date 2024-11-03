public class Employee {
    private String id;
    private String name;
    private int salary;

    Employee(String id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary<0)
            throw new ArithmeticException("You can't make people pay to work. you tried to make the salary:" + salary);

        this.salary = salary;
    }

    public int getAnnualSalary(){
        return getSalary()*12;
    }
    public int raisedSalary(int percent){
        if (percent<0){
            throw new ArithmeticException("You can't raise something by taking away from it");
        }

        int newSalary= (int) (getSalary()+(getSalary()*((double)percent/100)));//converted to double to get the correct result from calculating the percentage then returned to int to conform to data type
        setSalary(newSalary);
        return newSalary;
    }


    public String toString() {
        return  "id: " + id +
                "\nname: " + name +
                "\nsalary: " + salary;
    }
}
