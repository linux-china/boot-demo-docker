package org.mvnsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * portal controller
 *
 * @author linux_china
 */
@Controller
public class PortalController {

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Hello World!!!";
    }
}
