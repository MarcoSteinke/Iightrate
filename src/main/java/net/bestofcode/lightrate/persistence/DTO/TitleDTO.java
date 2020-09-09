package net.bestofcode.lightrate.persistence.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldNameConstants;

@AllArgsConstructor
public class TitleDTO {

    @Getter
    private final String titleContent;

    @FieldNameConstants.Exclude
    private static final int MAX_LENGTH = 60;

}
