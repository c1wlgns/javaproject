package javabook_2_2;

	interface Queue{
		boolean isEmpty(int x);
		int Dequeue();
	}
	class MyQueue implements Queue{
		private int[] itemArray = new int[50];
		int front;
		int rear;
		private int count;
		public MyQueue() 
		{
			front = 0;
			rear = 0;
			count = 0;
		}
		public boolean isEmpty() {
			if (count <= 0)
				return true;
			return false;
		}
		public void Enqueue(int x) {
			if (count > 50) {
				System.out.println("queue full");
				return;
			}
			itemArray[rear] = x;
			rear = rear + 1;
			count++;
			System.out.println(x + "입력: 원소개수 "+ count);
		}
		public int Dequeue()
		{
			if (isEmpty()) {
				System.out.println("큐가 비었음");
				return count;
			}
			int out = itemArray[front];
			front = front + 1;
			count--;
			System.out.println(out + "출력: 원소개수"+ count);
			return out;
			
		}
		@Override
		public boolean isEmpty(int x) {
			// TODO Auto-generated method stub
			return false;
		}
	}

public class UsingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue mq = new MyQueue();
		for (int ii=0; ii < 10; ii++)
			mq.Enqueue(ii);
		for (int ii=0; ii <10; ii++)
			mq.Dequeue();
		mq.Dequeue();

	}

}
