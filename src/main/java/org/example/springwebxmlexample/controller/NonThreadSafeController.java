package org.example.springwebxmlexample.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
@Controller
@RequestMapping("/nonThreadSafe")
public class NonThreadSafeController {
    private int count;
    AtomicInteger atomicCount = new AtomicInteger(0);
    @GetMapping
    public String nonThreadSafe(final Model model) {
        int countPlus = ++count;
        int atomicCountPlus = atomicCount.incrementAndGet();
        log.info("Count: [{}], AtomicCount: [{}]",countPlus, atomicCountPlus);
        model.addAttribute("count", countPlus);
        model.addAttribute("atomicCount", atomicCountPlus);

        return "nonThreadSafe";
    }

}
