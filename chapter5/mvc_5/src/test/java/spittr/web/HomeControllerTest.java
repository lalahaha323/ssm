package spittr.web;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeControllerTest {
    @Test
    public void testHomePage() throws Exception {
        HomeController controller = new HomeController();
        assertEquals("home", controller.home());
    }
}
