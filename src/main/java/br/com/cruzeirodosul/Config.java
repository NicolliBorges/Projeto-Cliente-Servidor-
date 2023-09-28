package br.com.cruzeirodosul;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config {


    public Float calcMedia(Float var1, Float var2) {
        Float resultado = (var1 + var2) / 2;
        return resultado;
        }

     public Double calcImc(Double peso, Double altura){
        Double res = peso/ (altura * altura);
        return res;
     }

     public static Double calcRaiz(Double var1){
        Double res = Math.sqrt(var1);
        return res;

     }
}

