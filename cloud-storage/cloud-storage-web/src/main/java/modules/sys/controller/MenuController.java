package modules.sys.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utils.R;

@RestController
@RequestMapping("/sys/meun")
public class MenuController {

    @RequestMapping("/list")
    private R getList(){

    }

}
