package br.com.cruzeirodosul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class meuController {

@Autowired
 private Config config;


    @GetMapping("/")
    public String principal(){
        return "principal";
    }

    @GetMapping("/media/{var1}/{var2}")
    public String medi(@PathVariable Float var1, @PathVariable Float var2, Model model){
        Float resultado = config.calcMedia(var1, var2);
        model.addAttribute("resultado", resultado);
        return "media";
    }



    @GetMapping("/imc/{peso}/{altura}")
    public String pag(@PathVariable Double peso, @PathVariable Double altura, Model model){
        Double res = config.calcImc(peso,altura);
        model.addAttribute("res",res);
        return "imc";

    }
@GetMapping("/raiz/{var1}")
    public String ttte(@PathVariable Double var1, Model model){
         Double res = config.calcRaiz(var1);
         model.addAttribute("res",res);
         return "raiz";
 }

    @GetMapping("/teste/{nome}")
    public String raiz(@PathVariable String nome, Model model){
        model.addAttribute("nome", nome);
        return "teste";
    }
}

