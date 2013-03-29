class Node  {
 
	Object data;
	Node next;
 
	public Node( Object data, Node next ) {
		this.data = data;
		this.next = next;
	}
}
 
public class LinkedListUtil {
 
	 Node head;
 
	public void addFirst( Object data ) {
		head = new Node( data, head );
	}
 
	public Node getMiddleNode(Node node)
	{
		Node prev = head;
		Node curr = head;
 		
		while(curr !=null && curr.next!=null)
		{
		curr=curr.next.next;
		prev=prev.next;	
		}
	System.out.println("\n mid is " + prev.data);
		return prev;	
	}
	
	
		
	public void display(Node head)
	{
	for(Node node = head;node!=null;node=node.next)
	{
	System.out.print(node.data+" ");
	}
	}
	
	public void forward(Node head, Node mid)
	{

	for(Node node =head;node!=mid.next ;node=node.next)
	{
	System.out.print(node.data+" ");
	}
				
	}
	
	
	
	 
	
	public void reverse( Node node ) {
        if( node != null ) {
             reverse(node.next);
            System.out.print( node.data + " " );
        }
    }
	
	
	
	
	public static void main( String[ ] args ) {
 
		 
		LinkedListUtil list = new LinkedListUtil( );
		for( int i = 1; i <= 4; i++ ) {
			list.addFirst( i );
		}
		list.addFirst( 3 );list.addFirst( 2 );list.addFirst( 1 );
		// Returns 3 as the middle node.
		
				list.display(list.head);

		//
		Node middleNode = list.getMiddleNode( list.head );
		System.out.println( middleNode.data );
		
		System.out.println("\n Forward List");
		
		list.forward(list.head,middleNode);
		
		
		System.out.println(" reverse list :");
		
		list.reverse(middleNode);
 
		
	}
}

