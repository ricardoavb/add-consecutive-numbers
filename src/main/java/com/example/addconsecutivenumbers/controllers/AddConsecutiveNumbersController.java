package com.example.addconsecutivenumbers.controllers;

import com.example.addconsecutivenumbers.pojo.ServiceResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.LongStream;

@RestController
public class AddConsecutiveNumbersController {

    @GetMapping("api/v2/add-consecutive-numbers")
    public ServiceResponse addConsecutiveNumbers(@RequestParam("target") long target) {
        long result = target * (target + 1) / 2;
        return new ServiceResponse(result);
    }
}
