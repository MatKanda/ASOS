package sk.stuba.asos.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sk.stuba.asos.exceptions.CustomException;

@RestController
@RequestMapping("/api/accommodations")
@RequiredArgsConstructor
public class AccommodationController {

    @GetMapping("/withoutLog")
    public void buyRoomWithReturnInCatch(@RequestParam String price) {
        try {
            Double.parseDouble(price);
        } catch (NumberFormatException e) {
        }
    }

    @GetMapping("/withLogException")
    public void buyRoomWithReturnException(@RequestParam String price) {
        try {
            Double.parseDouble(price);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @GetMapping("/withLogNumberFormatException")
    public void buyRoomReturnNumberFormatException(@RequestParam String price) {
        try {
            Double.parseDouble(price);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @GetMapping("/withCustomException")
    public Double buyRoomWithCustomException(@RequestParam String price) {
        try {
            return Double.parseDouble(price);
        } catch (NumberFormatException e) {
            throw new CustomException("This is my custom message", 404);
        }
    }


}
