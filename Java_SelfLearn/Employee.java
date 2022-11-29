abstract class Employee {
    //Attributes
    private String id;
    private String name;
    private String salary;

    //static attributes
    static int minsalary = 12000;
    //Default constructor
    public Employee() {
        System.out.println("I am an Employee");
    }
    
    public Employee(String name, String salary) {        
        this.name = name;
        this.salary = salary;
        displayemployee();
    }
    
    //Methods Setters
    public void setid(String id){
        this.id = id;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setsalary(String salary){
        this.salary = salary;
    }
    
    //Methods Getters
    public void displayemployee(){
        System.out.println("Employee Name : " + this.name);
        System.out.println("Employee Salary : " + this.salary);
    }
    public String getname(){
        return this.name;
    }
    public String getsalary(){
        return this.salary;
    }
    public abstract void bonus();
}

