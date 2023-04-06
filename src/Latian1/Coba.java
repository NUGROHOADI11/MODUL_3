package Latian1;

public class Coba {
    public static void main(String[] args) {
        Stack st = new Stack(10);
        st.push(9);
        st.push(10);
        st.push(10);
        st.push(100);
        while(!st.isEmpty()){
            long value = st .pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
