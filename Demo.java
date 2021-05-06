public class Demo {

    public static void main(String[] args) {

        Stack nums=new Stack();
        nums.push(10);
        nums.push(20);
        nums.push(30);
        nums.push(40);
        nums.push(50);
        System.out.println(nums.pop());
        nums.show();
    }
}
