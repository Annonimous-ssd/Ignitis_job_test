package com.example.ignitis_job_test.API;

import com.example.ignitis_job_test.DTO.UserDto;
import com.example.ignitis_job_test.Services.StatisticService;
import com.example.ignitis_job_test.Services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/admin"})
public class AdminController {
    private final UserService userService;
    private final StatisticService statisticService;

    public AdminController(final UserService userService, final StatisticService statisticService) {
        this.userService = userService;
        this.statisticService = statisticService;
    }

    @PostMapping({"/register"})
    public ResponseEntity<Object> registerUser(@RequestBody UserDto userDto) {
        return new ResponseEntity<>(this.userService.addUser(userDto), HttpStatus.OK);
    }

    @DeleteMapping({"/delete"})
    public ResponseEntity<Object> deleteUser(@RequestParam String userName) {
        try {
            return new ResponseEntity<>(this.userService.deleteUser(userName), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.GATEWAY_TIMEOUT);
        }
    }

    @GetMapping({"/getStatistics"})
    public ResponseEntity<Object> getStatistics(@RequestParam String userName) {
        return new ResponseEntity<>(this.statisticService.getStatistic(userName), HttpStatus.OK);
    }
}

