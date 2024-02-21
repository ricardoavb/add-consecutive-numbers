package com.example.addconsecutivenumbers.controllers;

import com.example.addconsecutivenumbers.pojo.ServiceResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.LongStream;

@RestController
public class AddConsecutiveNumbersController {

    // O(n)
    @GetMapping("api/v1/add-consecutive-numbers")
    public ServiceResponse addConsecutiveNumbersLinear(@RequestParam("target") long target) {
        long result = LongStream.rangeClosed(1, target)
                .reduce(0, Long::sum);
        return new ServiceResponse(result);
    }
}
