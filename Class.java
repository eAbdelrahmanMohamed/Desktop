public class Class {
    private int size;
    private int numofgers;
    public void spin(){
        System.out.println("spinning");
    }




    public Class(int n, int m){
        size=n;
        numofgers=m;
    }

    public static void main(String[] args) {
    Class c1=new Class(2,3);
c1.spin();

    }}
