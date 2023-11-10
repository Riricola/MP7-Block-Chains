import java.util.Scanner;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;

/*
 * Allows users to interact with our BlockChain
 *
 * @author Joyce Gill
 * @author Maria Rodriguez
 */

public class BlockChainDriver {
    public static void main(String[] args) throws NoSuchAlgorithmException {
      if (args.length > 1) {
        //if the user puts more args than just the dollar amount, give an error
        System.err.println("Error: Incorrect number of arguments");
      } else {
        int amount = Integer.valueOf(args[0]);
        Scanner scanner = new Scanner(System.in);
        PrintWriter pen = new PrintWriter(System.out, true);
  
        //creates a blockChain with the given amount as the starting balance
        BlockChain blockChain = new BlockChain(amount);
        pen.println(blockChain.toString());
  
        pen.println("\nCommand?");
        //read a user-inputted expression
        String userInput = scanner.nextLine();
        

        while (! userInput.equals("quit")) {
                    
          // keep reading lines
          switch (userInput) {
            case "mine": 
              pen.println("Amount transferred?");
              //pen.flush();
              amount = Integer.parseInt(scanner.nextLine());
              Block blk = blockChain.mine(amount);
              pen.println("amount = " + amount + ", nonce = " + blk.getNonce() + '\n');
              pen.flush();
              break;
            case "append": 
              pen.println("Amount transferred?");
              pen.flush();
              amount = Integer.parseInt(scanner.nextLine());
  
              pen.println("Nonce?");
              pen.flush();
              int nonce = Integer.parseInt(scanner.nextLine());
  
              Block blk2 = new Block(blockChain.getSize(), amount, blockChain.getHash(), nonce);
              /* Append the block */
              blockChain.append(blk2);
              pen.println('\n' + blockChain.toString());
              break;  
            case "remove": 
              blockChain.removeLast();
              break;
            case "check": 
              if (blockChain.isValidBlockChain()) {
                pen.println("Chain is valid!");
              }
              else {
                pen.println("Chain is invalid!");
              }
              break;
            case "report": 
              blockChain.printBalance();
              break;
            case "help": 
              pen.println(menu());
              break;
            case "quit":
              break;
            default:
              pen.println("Error: Invalid command. Type 'help' for valid commands.");
          } // switch

          pen.println('\n' + blockChain.toString());
          pen.println("Command?");
          userInput = scanner.nextLine();
        } // while
        scanner.close();
      } // if/else
      } // main
  
      public static String menu () {
        return "Valid commands: " + '\n' +
          "mine: discovers the nonce for a given transaction \n" +
          "append: appends a new block onto the end of the chain \n" +
          "remove: removes the last block from the end of the chain \n" +
          "check: checks that the block chain is valid \n" +
          "report: reports the balances of Alexis and Blake \n" +
          "help: prints this list of commands \n" +
          "quit: quits the program \n";
      } // menu ()
  } // class blockChainDriver 