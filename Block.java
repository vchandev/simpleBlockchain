import java.lang.*;
import java.util.*;

/**
 * Block class
 */
public class Block {

    private int previousHash;           //previous block's hash
    private String[] transactions;       //array of transactions

    private int blockHash;              //current block's hash

    public Block(int previousHash, String[] transactions) {
        this.previousHash = previousHash;
        this.transactions = transactions;

        Object[] contents = {Arrays.hashCode(transactions), previousHash};       //calculate the hash of transactions and the previous block's hash
        this.blockHash = Arrays.hashCode(contents);                              //this block's hash by calculating the hash of both transactions and previous block's hash
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public String[] getTransaction() {
        return transactions;
    }

    public int getBlockHash() {
        return blockHash;
    }
}
