package com.dt2.techbyte.Controller;

import com.dt2.techbyte.Entity.Produto_ti;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 public class controller{
    @GetMapping("api")
    public String intervalo(){
        return "O intervalo é 15:40 :(";
    }

    @GetMapping("oi")
    public String hello(){
        return "Ooooiiiiiiii";
    }

    @GetMapping("Produto")
    public Produto_ti show(){
        Produto_ti produto = new Produto_ti(123.12, "ele é bem legal", "Luz colorda");
        return produto;
    }

}