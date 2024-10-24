package com.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dto {

    private Long teacherId;
    private String firstName;
    private String lastName;
    private String department;
    private String email;

}
