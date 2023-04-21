package org.launchcode.skillstracer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsControllers {

    @GetMapping
    @ResponseBody
    public String studioCreateControllersOne() {

        return "<h1>Skills Tracker</h1>" +
                "<h2>Languages</h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "</ol>";
    }



    @PostMapping ("form")
    @ResponseBody
    public String returnInformationFromControllers(@RequestParam String name, @RequestParam String language, @RequestParam String language2, @RequestParam String language3) {

        return "<html>" +
                "<body>" +
                "<h1>" + name +"</h1>" +
                "<ol>" +
                "<li>" + language + "</li>" +
                "<li>" + language2 + "</li>" +
                "<li>" + language3 + "</li>" +
                "</ol" +
                "</body>" +
                "</html>";

    }


    @GetMapping("form")
    @ResponseBody
    public String studioCreateControllersTwo() {
        return "<html>" +
                "<body>" +
                "<br>" +
                "<form action='/form' method='post'>" +
                    "<h3>Name:</h3>" +
                    "<input type = 'text' name = 'name' />" +
                    "<h4>My favorite language:</h4>" +
                    "<select name='language'>" +
                        "<option value=''>Language</option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='Python'>Python</option>" +
                    "</select>" +


                    "<h4>My second favorite language:</h4>" +
                    "<select name='language2'>" +
                        "<option value=''>Language</option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='Python'>Python</option>" +
                    "</select>" +
//
                    "<h4>My third favorite language:</h4>" +
                    "<select name='language3'>" +
                        "<option value=''>Language</option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='Python'>Python</option>" +
                    "</select>" +
                "<br>" +
                "<input type='submit' value='Submit' />" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
