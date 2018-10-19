package cc.adcat.demo;

public class DatabaseException extends Exception {

    public DatabaseException(int transactionID, int queryID, String message){
        super(String.format("(t%d, q%d) %s", transactionID, queryID, message));
    }

}
