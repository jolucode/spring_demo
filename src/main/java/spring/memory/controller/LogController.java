package spring.memory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.memory.model.Log;
import spring.memory.service.LogServiceMongo;

import java.util.List;

@RestController
@RequestMapping("/log")
public class LogController {

    @Autowired
    LogServiceMongo logServiceMongo;

    @GetMapping("/data")
    public List<Log> getLogs(@RequestParam("N") int N) {
        return logServiceMongo.getData(N);
    }
}
