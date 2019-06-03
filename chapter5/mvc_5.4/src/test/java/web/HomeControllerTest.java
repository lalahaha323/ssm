package web;


import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import spittr.Spittle;
import spittr.data.SpittleRepository;
import spittr.web.SpitterController;
import spittr.web.SpittleController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class HomeControllerTest {
   @Test
   public void shouldShowRegisteration() throws Exception {
       SpitterController controller = new SpitterController();
       MockMvc mockMvc = standaloneSetup(controller).build();
       mockMvc.perform(get("/spitter/register"))
               .andExpect(view().name("registerForm"));
   }
    private List<Spittle> createSpittleList(int count) {
        List<Spittle> spittles = new ArrayList<Spittle>();
        for(int i = 0; i < count; i++) {
            spittles.add(new Spittle("Spittle " + i, new Date()));
        }
        return spittles;
    }

}
