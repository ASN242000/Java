public class Stack {
    int stck[]= new int[10];
    int top;
    Stack (){
        top= -1;
    }
    void push(int i){
        if (top== 9)
            System.out.println("Stack is full");
        else{
            stck[++top] =i;
            System.out.println("Pushed into stack: "+stck[top]);
        }
    }

    void pop(){
        if (top<0)
            System.out.println("Stack is empty");
        else{
            System.out.println(stck[top]+" is popped");
            top--;
        }
    }
}
