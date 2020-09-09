package net.bestofcode.lightrate.persistence;

import lombok.AllArgsConstructor;
import lombok.experimental.FieldNameConstants;

@AllArgsConstructor
public class TitleDTO {

    private final String titleContent;
    @FieldNameConstants.Exclude
    private static final int MAX_LENGTH = 60;

}
