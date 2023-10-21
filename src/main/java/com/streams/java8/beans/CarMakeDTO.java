package com.streams.java8.beans;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CarMakeDTO {
    private String make;
    private Long count;
}
