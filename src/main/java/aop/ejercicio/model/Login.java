package aop.ejercicio.model;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Aspect
public class Login {

    @Before("execution(@Log * *(..))")
    public void login(JoinPoint joinPoint){
        String registro = "";
        String valores = "";
        String metodo = joinPoint.getSignature().getName();
        String fechaStr = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

        Object[] parametros = joinPoint.getArgs();
        for (var p : parametros){
            if(!p.toString().isEmpty()){
                valores += p.toString() + "|";
            }
        }

        if(valores.isEmpty()){
            valores = "Sin parametros";
        }
        else{
            valores.substring(0, valores.length() - 1);
        }

        registro = '\"' + metodo + "\",\"" + valores + "\",\"" + fechaStr + "\"\n";

        try {
            Files.write(Paths.get("src/main/resources/logueo.txt"),
                    registro.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
