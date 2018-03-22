# Simple Blockchain in Java

This is a simple Blockchain app written in Java. A blockchain is series of transactions stored in blocks that are digitally signed. The digital signature is a hash of the transactions and the previous block's hash, making it very difficult to calculately inversely. In this app, we explore how the concept of blockchain works. 

# Block class
The Block class consists of the following properties:

- previous block's hash
- current block's hash
- transactions

The current block's transactions are hashed and stored along with the previous block's hash in the contents array. The contents array is hashed to create the current block's hash. Every block's hash is based on its content and the previous block's hash.

# Main class
The Main class houses the ArrayList of blocks, which constitute the blockchain. The String arrays represent transactions in a real blockchain. Each Block object is generated with the previous block's hash and its own transactions. This information is fed into each block, hashed and then returned. The block hashes are displayed using getters in the Block class. 

Try changing the value of the Bitcoin sent from one party to another and you will see that the hash value will have drastically changed, making it impossible to forge a digital signature and for a fraudulent blockchain to keep up with the original blockchain. 
