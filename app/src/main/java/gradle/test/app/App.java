/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradle.test.app;

import gradle.test.list.LinkedList;

import static gradle.test.utilities.StringUtils.join;
import static gradle.test.utilities.StringUtils.split;
import static gradle.test.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}
