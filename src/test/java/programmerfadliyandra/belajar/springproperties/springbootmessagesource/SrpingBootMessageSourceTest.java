package programmerfadliyandra.belajar.springproperties.springbootmessagesource;

import lombok.Setter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

import java.util.Locale;

@SpringBootTest(classes = SrpingBootMessageSourceTest.TestApplication.class)
public class SrpingBootMessageSourceTest {

    @Autowired
    private TestApplication.SampleSource sampleSource;

    @Test
    void testHelloFadli() {
        Assertions.assertEquals("Hello Fadli", sampleSource.helloEko(Locale.ENGLISH));
        Assertions.assertEquals("Hello Fadli",sampleSource.helloEko(new Locale("in_ID")));
    }

    @SpringBootApplication
    public static class TestApplication{

        @Component
        public static class SampleSource implements MessageSourceAware {

            @Setter
            private MessageSource messageSource;

            public String helloEko(Locale locale){
                return messageSource.getMessage("hello", new Object[]{"Fadli"}, locale);
            }


        }

    }
}
