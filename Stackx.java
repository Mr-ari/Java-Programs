public class Stackx{

	int st[] = new int [10];
	int top;

	Stackx(){
		top = -1;
	}
	void push(int val){
		st[++top] = val;
	}
	int pop(){
		if(top == -1) return top;
		int temp = st[top];
		top--;
		return temp;
	}
	void print(){
		if(top != -1)
			for(int i=0;i<=top;i++){
				System.out.print(st[i]+" ");
			}
		System.out.println();	
	}
}