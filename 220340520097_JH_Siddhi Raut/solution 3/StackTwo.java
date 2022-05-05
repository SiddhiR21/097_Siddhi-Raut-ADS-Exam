class StackTwo{
     int size;
	 int top1, top2;
	 int arr[];
	 
	 StackTwo(int n){
		 arr = new int[n];
		 size = n;
		 top1 = -1;
		 top2 = size;
	 }
		void push1(int x){
			if(top1<top2 -1){
				top1++;
				arr[top1]=x;
			}
			else{
				System.out.println("Overflow of stack");
				System.exit(1);
			}
		}
		
		void push2(int x){
			if(top1<top2 -1){
				top2--;
				arr[top2]=x;
			
			}
			else{
				System.out.println("Stack is overflow");
				System.exit(1);
			}
		}
		
		int pop1(){
			if(top1>=0){
				int x = arr[top1];
				top1--;
				return x;
			}
			else{
				System.out.println("Underflow of stack");
				System.exit(1);
			}
			return 0;
		}
		int pop2(){
			if(top1<size){
				int x = arr[top2];
				top2++;
				return x;
			}
			else{
				System.out.println("Underflow of stack");
				System.exit(1);
			}
			return 0;
		}
	 public static void main(String args[]){
		 StackTwo st = new StackTwo(5);
			st.push1(5);
			st.push2(10);
			st.push2(15);
			st.push1(11);
			st.push2(7);
			
			System.out.println("Popped element" + "from stack1 is "+st.pop1());
			
				st.push2(40);
				
			System.out.println("Popped element" + "from stack2 is "+st.pop2());
	 }
}