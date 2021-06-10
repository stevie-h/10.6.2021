package com.example.calculator;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CalcCollector
{


    @GetMapping("/add")
    public String getAdd (@RequestParam(value = "a", defaultValue = "0") Integer a,
                          @RequestParam(value = "b", defaultValue = "0") Integer b)
    {
        Calc calc = new Calc();
        return String.format("{x: %d, y: %d, sum: %d}", a, b, calc.add(a,b));
    }


    @PostMapping("/mul")
    public String postMul(@RequestBody CalcDTO sent)
    {
        Calc calc = new Calc();
        return String.format("{x: %d, y: %d, mul: %d}", sent.getNum1(), sent.getNum2(),
                calc.mul(sent.getNum1(),sent.getNum2()));
    }



}
