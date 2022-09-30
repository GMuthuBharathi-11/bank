public class stackQ3
{
    public static void main(String[] args)
    {
        MyStack s = new MyStack();
        s.push(8);
        s.push(7);
        s.getMin();
        s.push(6);

        s.push(5);
        s.getMin();
        s.pop();
        s.getMin();
        s.pop();
        s.peek();
    }
}
