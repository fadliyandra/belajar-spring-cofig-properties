package programmerfadliyandra.belajar.springproperties.environment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

public class EnvironmentTest {

    private Environment environment;

    @Test
    void testEnvironment(){
        String java_home = environment.getProperty("JAVA_HOME");
    }

    @SpringBootApplication
    public  static class TestApplication{

    }
}
