package com.example.LedLuqi.control;

import com.example.LedLuqi.search.Search;
import com.example.LedLuqi.search.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller("/MainPage.html")
public class SearchController {

    @Autowired
    SearchService searchService;

    @GetMapping("/mainpage")
    String createSearch (Model model){
        model.addAttribute("search",new Search());
        System.out.println("create");
        return "MainPage.html";
    }

    @PostMapping("/mainpage")
    String getProducts(Search search, Model model){
        model.addAttribute("products",searchService.products(search));
        System.out.println("show");
        return "MainPage";
    }



}
