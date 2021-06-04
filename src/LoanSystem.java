import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoanSystem {
   private static Logger logger = LogManager.getLogger(LoanSystem.class);
    public static void main(String[] args) {


        logger.trace("Hej");
        logger.error("Problem");
        logger.info("HMMM");
    }
}
