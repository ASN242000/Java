public class TestStack {
    public static void main(String[] args) {
        Stack s = new Stack();
        for (int i=0;i<10;i++){
            s.push(i);
        }
        for(int i=0;i<10;i++){
            s.pop();
        }
    }
}
