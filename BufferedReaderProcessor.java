import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author: jianyang
 * @date: 2019/8/15
 */
@FunctionalInterface
public interface BufferedReaderProcessor {

    String process(BufferedReader b) throws IOException;
}
