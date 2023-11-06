package src;

public class BlockChain {
    
    
/*---------------------------
 * Fields |
 * --------------------------
 */

    //the previous block
    Block prev;

    //the next block
    Block next;

    //determines the size of the chain
    int size;


/*---------------------------
 * Constructor |
 * --------------------------
 */

    public BlockChain(int initial){

    }


 /*--------------------------
 * Methods |
 * --------------------------
 */

    /*
     * BlockMine()
     * mines a new candidate block to be added to the end of the chain. 
     * The returned Block should be valid to add onto this chain.
     */
    public BlockMine(int amount){
        //mine a block

        //check if its valid

        
    }//BlockMine

    /*
     * getSize()
     * returns the size of the blockchain. Note that number of the blocks provides 
     * a convenient method for quickly determining the size of the chain.
     */
    public int getSize(){
        return this.size;
    }//getSize

    /*
     * append()
     * adds this block to the list, throwing an IllegalArgumentException if this block 
     * cannot be added to the chain (because it is invalid wrt the rest of the blocks).
     */
    public void append(Block blk){
        //add block to list

        this.size++;
        //throw exception if it is invalid

    }//append

    /*
     * removeLast()
     * removes the last block from the chain, returning true. If the chain only contains 
     * a single block, then removeLast does nothing and returns false.
     */
    public boolean removeLast(){
        //if the chain is empty or has 1 block
        if(this.size <= 1){
            return false;
        }
        
        //remove block

        this.size--;
        return true;
    }//removeLast

    /*
     * getHash()
     * returns the hash of the last block in the chain
     */
    public Hash getHash(){
        
    }//getHash

    /*
     * isValidBlockChain()
     * walks the blockchain and ensures that its blocks 
     * are consistent and valid.
     */
    public boolean isValidBlockChain(){
        //might have to check each blocks hash and mmake sure theyre in order
    }//isValidBlockChain

    /*
     * printBalance()
     * prints Alexis’s and Blake’s respective balances
     */
    public void printBalance(){

    }//printBalance

    /*
     * toString()
     * returns a string representation of the BlockChain which is simply the
     * string representation of each of its blocks, earliest to latest, one per line.
     */
    public String toString(){

    }//toString

/*-----------------------
 * Inner class|
 * ----------------------
 */
/**
   * Nodes in the linked list.
   */
  class Node
  {
    // +--------+-----------------------------------------------------------
    // | Fields |
    // +--------+

    /**
     * The data stored in the node.
     */
    T data;

    /**
     * The next node in the list.  Set to null at the end of the list.
     */
    Node next;

    // +--------------+-----------------------------------------------------
    // | Constructors |
    // +--------------+

    /**
     * Create a new node with specified data and next.
     */
    public Node(T data, Node next)
    {
      this.data = data;
      this.next = next;
    } // Node(T, Node)
  } // class Node
}