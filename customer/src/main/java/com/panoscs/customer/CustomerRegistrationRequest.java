package com.panoscs.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
