package com.hcltech.course_Academy_Service.responsestructure;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ResponseStructure<T> {
    private int status;
    private String message;
    private T body;
}
