package Coba;

public class Coba {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push("Aku");
        stack.push("Anak");
        stack.push("Indonesia");
        System.out.println("next: " + stack.peek());
        stack.push("Raya");
        while(!stack.isEmpty()){
            String value = stack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
