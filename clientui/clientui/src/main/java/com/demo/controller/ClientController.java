package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.beans.ProductBean;
import com.demo.proxies.MicroserviceProduitProxy;

@Controller
public class ClientController {
	
	@Autowired
    private MicroserviceProduitProxy ProduitsProxy;

    @RequestMapping("/")
    public String accueil(Model model){

        List<ProductBean> produits =  ProduitsProxy.listeDesProduits();

        model.addAttribute("produits", produits);

        return "Accueil";
    }

}
