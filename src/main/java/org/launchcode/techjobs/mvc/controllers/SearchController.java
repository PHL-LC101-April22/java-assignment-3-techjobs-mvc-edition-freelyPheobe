package org.launchcode.techjobs.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import static org.launchcode.techjobs.mvc.controllers.ListController.columnChoices;


/**
 * Created by LaunchCode
 */
@Controller
@RequestMapping("search")
public class SearchController {

    @GetMapping(value = "")
    public String search(Model model) {
        model.addAttribute("columns", columnChoices);
        return "search";
    }
//<form th:action="@{/search/results}" method = "post">
//1.The method should also take in two other parameters, specifying the type of search and the search term.
//   2. In order for these last two parameters to be properly passed in by Spring Boot,
//    you need to use the correct annotation. Also, you need to name them appropriately, based on the
//    corresponding form field names defined in search.html.
    @PostMapping
    public String displaySearchResults(Model model, @RequestParam String searchType, @RequestParam String searchTerm) {

    }
    // TODO #3 - Create a handler to process a search request and render the updated search view.

}
