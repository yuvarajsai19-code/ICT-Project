package Constructor;

public class Chainingconstructor{
    String name;
    String dept;
    Double salary;
    public Chainingconstructor(String name){
        this(name,"CSE");
    }
     public Chainingconstructor(String name,String dept){
        this(name, dept,50000.50);
    }
      public Chainingconstructor(String name,String dept,Double salary){
        this.name=name;
        this.dept=dept;
        this.salary=salary;

    }
    void display(){
        System.out.println("concerned person: "+name+" "+dept+ " "+salary);
    }
    public static void main(String[] args) {
        
        Chainingconstructor cc=new Chainingconstructor("Roshni");
        cc.display();
        Chainingconstructor cc1=new Chainingconstructor("Jeeva","bcom");
        cc1.display();
        Chainingconstructor cc2=new Chainingconstructor("Shirley","cse",40000.50);
        cc2.display();
    }
}
