
public class ArrayDS {
	
	// Topic: Stacks, Queues and List abstractions
	
	
	public static void main(String[] args) {
		
		ArrayStack a = new ArrayStack(10);
		
		System.out.println("Current size "+a.size());
		
		for(int i=0;i<5;i++) {
			
			a.push(i);
			System.out.println("Current size is "+a.size());
			System.out.println("Current capacity is "+a.capacity());
			
		}
		
		System.out.println();
		
		a.showStack();
		
		System.out.println();
		
		a.pop();
		
		System.out.println("Size: "+a.size());
		System.out.println("Current capacity is "+a.capacity());
		
		a.pop();
		
		System.out.println("Size: "+a.size());
		System.out.println("Current capacity is "+a.capacity());
		
		a.pop();
		
		System.out.println("Size: "+a.size());
		System.out.println("Current capacity is "+a.capacity());
		
		a.pop();
		
		System.out.println("Size: "+a.size());
		System.out.println("Current capacity is "+a.capacity());
		
		System.out.println();
		
		System.out.println("=====================================================");
		
		System.out.println();
		
		ArrayQueue a1 = new ArrayQueue(10);
		
		System.out.println("Starting size "+a.size());
		
		for(int i=0;i<5;i++) {
			
			a1.enqueue(i);
			System.out.println("Current size is "+a1.size());
			System.out.println("Current capacity is "+a1.capacity());
			
		}
		
		System.out.println();
		
		a1.showQueue();
		
		System.out.println();
		System.out.println();
		
		a1.dequeue();
		
		System.out.println("Size: "+a1.size());
		System.out.println("Current capacity is "+a1.capacity());
		
		a1.dequeue();
		
		System.out.println("Size: "+a1.size());
		System.out.println("Current capacity is "+a1.capacity());
		
		a1.dequeue();
		
		System.out.println("Size: "+a1.size());
		System.out.println("Current capacity is "+a1.capacity());
		
		a1.dequeue();
		
		System.out.println("Size: "+a1.size());
		System.out.println("Current capacity is "+a1.capacity());
		
		
	}
	
	

}

class ArrayStack {
	
	private int[] array;
	private int size;
	private int capacity;
	
	public ArrayStack(int capacity) {
		
		this.capacity = capacity;
		array = new int[capacity];
		size = 0;
		
	}
	
	public int size() {
		return size;
	}
	
	public int capacity() {
		return capacity;
	}
	
	public void push(int ele) {
		
		if(size >= capacity/2) {
			
			capacity = capacity*2;
			
			int[] nArr = new int[capacity];
			
			for(int i=0;i<size;i++)
				nArr[i] = array[i];
			
			array = nArr;
			
		}
		
		array[size] = ele;
		size++;
		
	}
	
	public void pop() {
	
		System.out.println(array[size-1] + " popped");
		
		size--;
		
		if(size <= capacity/3) {
			
			capacity = capacity/2;
			
			int[] nArr = new int[capacity];
			
			for(int i=0;i<size;i++)
				nArr[i] = array[i];
			
			array = nArr;
			
		}
		
	}
	
	public void showStack() {
		
		for(int i=size-1;i>=0;i--)
			System.out.println("| "+array[i]+" |");
		
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}
	
}

class ArrayQueue {
	
	private int[] arr;
	private int size;
	private int capacity;
	private int popped = 0;
	
	public ArrayQueue(int capacity) {
		
		this.capacity = capacity;
		size = 0;
		arr = new int[capacity];
	}
	
	public int size() {
		return size;
	}
	
	public int capacity() {
		return capacity;
	}
	
	public void enqueue(int ele) {
		
		if(size >= capacity/2) {
			
			capacity = capacity*2;
			
			int[] nArr = new int[capacity];
			
			for(int i=0;i<size;i++)
				nArr[i] = arr[i];
			
			arr = nArr;
			
		}
		
		arr[size] = ele;
		size++;
		
	}
	
	public void dequeue() {

        size--;

        System.out.println(arr[popped] + " removed");

        if (size <= capacity / 3) {

            capacity = capacity / 2;

            int[] nArr = new int[capacity];

            for (int i = 0; i < size; i++)
                nArr[i] = arr[i];

            arr = nArr;

        }

        int[] nArr = new int[capacity];

        for (int i = popped + 1; i < size; i++)
            nArr[i - 1] = arr[i];

        arr = nArr;

    } 
	
	public boolean isEmpty() {
		return (size == 0);
	}
	
	public void showQueue() {
		
		for(int i=0;i<size;i++)
			System.out.print("| "+arr[i]+" ");
		
	}
}
