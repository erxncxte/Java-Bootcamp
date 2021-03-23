public class OverloadingExample {
    private int rollNum;

    OverloadingExample() {
        rollNum = 100;
        // You always need a default constructor
        // Java will create one if there isn't one UNLESS you have one that takes arguments
        // Creating more than one constructor is called overloading
    }

    OverloadingExample(int rnum) {
        this(); // Calls the default constructor
        rollNum = rollNum + rnum;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public static void main(String args[]) {
        OverloadingExample obj1 = new OverloadingExample();
        System.out.println(obj1.getRollNum());

    }

}
