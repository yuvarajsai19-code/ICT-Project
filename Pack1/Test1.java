package Pack1;

public class Test1 {
    protected static int data = 97;

    
    // protected int data1=100;
    public static void main(String[] args) {
        Test1 ts=new Test1();
        // System.out.println("static:" +ts.data1);
        System.out.println("static:" + data);

        Test2 ts1 = new Test2();
        System.out.println("privateData is not possible");
        System.out.println("publicData :" + ts1.publicData);
        System.out.println("defaultData :" + ts1.defaultData);
         System.out.println("protectedData :" + ts1.protectData);

      
        

    }
}
