import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArraysList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class main {

    ArrayList<Block> blockchain = new ArrayList<>();
    public static void main(String[] args){
        String[] genesisTransactions = {"Topzson sent ivan 10 BitJotaro","hal finney sent 10 bitJotaro to ivan"};
        Block genesisBlock = new Block( previousHash: 0,genesisTransactions);

        String[] block2Transactions = {"Topzson sent ivan 10 BitJotaro","hal finney sent 10 bitJotaro to ivan"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);

        String[] block3Transactions = {"Topzson sent ivan 10 BitJotaro","hal finney sent 10 bitJotaro to ivan"};
        Block block3 = new Block(block2.getBlockHash(), block3Transactions);

        System.out.println("Hash of genasis block:")
        System.out.println(genesisBlock.getBlockHash());
        
        System.out.println("Hash of block2 :")
        System.out.println(block2.getBlockHash());

        System.out.println("Hash of block3 :")
        System.out.println(block3.getBlockHash());

    }
}