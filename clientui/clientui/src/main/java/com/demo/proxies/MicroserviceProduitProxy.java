package com.demo.proxies;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.demo.beans.ProductBean;

@FeignClient(name = "zuul-server")
@RibbonClient(name = "microservice-produits")
public interface MicroserviceProduitProxy {

@GetMapping(value = "/Produits")
List<ProductBean> listeDesProduits();

@GetMapping( value = "/Produits/{id}")
ProductBean recupererUnProduit(@PathVariable("id") int id);

}
