import java.lang.*;
import java.util.*;

/**
    Each block contains:
        List of transactions
        Previous Hash
        Current Hash
 */
public class Main {


    ArrayList<Block> blockchain = new ArrayList<>();


    public static void main(String[] args) {

        String[] genesisTransactions = {"Satoshi sent 100 Bitcoin to Victor"};
        Block genesisBlock = new Block(0, genesisTransactions);

        String[] block2Transactions = {"Victor sent 30 Bitcoin to Satoshi", "Victor sent 5 Bitcoin to Starbucks"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);

        String[] block3Transactions = {"Amazon sent 20 Bitcoin to Victor"};
        Block block3 = new Block(block2.getBlockHash(), block2Transactions);

        System.out.println("Genesis Block Hash: " + genesisBlock.getBlockHash());
        for(int i = 0; i < genesisTransactions.length; i ++) {
            System.out.println(genesisTransactions[i]);
        }
        System.out.println();

        System.out.println("2nd Block Hash: " + block2.getBlockHash());
        for(int i = 0; i < block2Transactions.length; i ++) {
            System.out.println(block2Transactions[i]);
        }
        System.out.println();

        System.out.println("3rd Block Hash: " + block3.getBlockHash());
        for(int i = 0; i < block3Transactions.length; i ++) {
            System.out.println(block3Transactions[i]);
        }
        System.out.println();

    }

}
