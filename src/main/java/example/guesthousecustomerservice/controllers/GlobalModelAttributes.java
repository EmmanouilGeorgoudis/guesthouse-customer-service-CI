package example.guesthousecustomerservice.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class GlobalModelAttributes {

    private final String bookingServiceBaseUrl;

    public GlobalModelAttributes(@Value("${booking-service.base-url}") String bookingServiceBaseUrl) {
        this.bookingServiceBaseUrl = bookingServiceBaseUrl;
    }

    @ModelAttribute("bookingServiceBaseUrl")
    public String bookingServiceBaseUrl() {
        return bookingServiceBaseUrl;
    }
}