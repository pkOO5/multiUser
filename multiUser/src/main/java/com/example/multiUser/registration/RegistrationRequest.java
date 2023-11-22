package com.example.multiUser.registration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@Setter
@ToString
public class RegistrationRequest {
private final String firstName;
private final String lastName;
private final String email;
private final String password;


}
