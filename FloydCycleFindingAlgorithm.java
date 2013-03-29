class Node {
    Object data;
    Node next;
}
 
public class FloydCycleFindingAlgorithm {
 
    /**
     * Detects and removes a cycle in a linked list. Returns true if a cycle was
     * found and removed; or false otherwise.
     */
    public static boolean removeCycle( Node head ) {
 
        Node tortoise = head;
        Node hare = head.next;
 
        // Search for a cycle
        while( tortoise != hare && hare.next != null )
		{  // 2 condition: if not null then must be loop. this cond. can be removed also
            tortoise = tortoise.next;
		    System.out.println( "tortoise is = "+tortoise.data );

            hare = hare.next.next;	//hare.next=B,b.next=C
			System.out.println( "hare is = "+hare.data );

        }
 
        // Check if a cycle was found
        if( tortoise != hare ) {
            return false;
        }
		
		else 
		{
        // Find the node from which the cycle starts
       Node tort = head;  /// tort =B, hare=D
        while( hare.next != tort )  // D.next!=B ; increment both
		{
            tort = tort.next;
            hare = hare.next;
        }
  
        // Remove cycle 
        hare.next = null;
		}
        return true;
    }
 
    /**
     * Test Method
     */
    public static void main( String[ ] args ) {
 
        // Initialize the linked-list nodes
        //
        Node nodeA = new Node( );        
        Node nodeB = new Node( );
        Node nodeC = new Node( );
        Node nodeD = new Node( );
        Node nodeE = new Node( );
 
        nodeA.data = "A"; nodeA.next = nodeB;
        nodeB.data = "B"; nodeB.next = nodeC;
        nodeC.data = "C"; nodeC.next = nodeD;
 
        // Introduce a cycle in the linked-list
        
        nodeD.data = "D"; nodeD.next = nodeB;
  
        // Test for the presence of a cycle.
             
        if(removeCycle( nodeA ) ) {
            System.out.println( "Cycle detected and removed!" );
        } else {
            System.out.println( "No cycle detected." );
        }
 
        // Iterating through the linked list
        //
        for( Node cursor = nodeA; cursor != null; cursor = cursor.next ) {
            System.out.print( cursor.data  + ( cursor.next != null ? " -> " : "" ) ); 
			//-> will be applied till cursor.next != null i.e. values a b c d are there else(:) " "
        }
    }
}