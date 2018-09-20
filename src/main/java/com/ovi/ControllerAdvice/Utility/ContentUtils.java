package com.ovi.ControllerAdvice.Utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.validation.ObjectError;

public class ContentUtils {
    private static final List<String> NOT_ALLOWED_WORDS = Arrays.asList(
            "politics",
            "terrorism",
            "murder"
    );

    public static List<ObjectError> getContentErrorsFrom(String str) {
    	ArrayList<String> words = new ArrayList<String>(Arrays.asList(str.split("\\s")));
        return words.stream()
                .filter(NOT_ALLOWED_WORDS::contains)
                .map(notAllowedWord -> new ObjectError(notAllowedWord, "is not appropriate"))
                .collect(Collectors.toList());
    }
}
