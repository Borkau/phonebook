package subscribers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
 
@Controller
public class SubscriberController {
 
    @Autowired
    private SubscriberService subscriberService;
 
    @RequestMapping("/")
    public ModelAndView home() {
        List<Subscriber> listSubscriber = subscriberService.listAll();
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("listSubscriber", listSubscriber);
        return mav;
    }
    @RequestMapping("/new")
    public String newSubscriberForm(Map<String, Object> model) {
        Subscriber subscriber = new Subscriber();
        model.put("subscriber", subscriber);
        return "new_subscriber";
    }    
}
