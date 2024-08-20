package com.reto.retonttdata.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.reto.retonttdata.entities.Usuario;
import com.reto.retonttdata.service.ApiService;

@Controller
public class ApiController {

    private final ApiService apiService;

   
    public ApiController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping("/miapi")
    public String getApiData(@RequestParam(defaultValue = "10") int results, Model model) {
        String endpoint = "/api/?results=" + results;
        List<Usuario> usuarios = apiService.getDataFromApi(endpoint);
        model.addAttribute("usuarios", usuarios);
        return "verusuarios";
    }


}
