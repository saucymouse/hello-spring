package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

    // Handles request of the form /hello?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String language, String name) {
//        String output = createMessage(language, name);
        String output = language + " " + name;
        return output;
    }

    @GetMapping("form")
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action='/hello' method='post'>" + // submit a request to /hello
                "<input type='text' name='name'>" +
                "<select name='language'>" +
                "<option value='english'>English</option>" +
                "<option value='french'>French</option>" +
                "<option value='german'>German</option>" +
                "<option value='spanish'>Spanish</option>" +
                "<option value='esperanto'>Esperanto</option>" +
                "</select>" +
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    public static String createMessage(String language, String name) {
        String greeting = "";
        if (language == "english") {
            greeting = "Hello, ";
        }
        if (language == "french") {
            greeting = "Bonjour, ";
        }
        if (language == "german") {
            greeting = "Hallo, ";
        }
        if (language == "spanish") {
            greeting = "Hola, ";
        }
        if (language == "esperanto") {
            greeting = "Saluton, ";
        }
        return greeting + name;
    }


}
