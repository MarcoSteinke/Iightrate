package net.bestofcode.lightrate.persistence;

import lombok.AllArgsConstructor;
import lombok.experimental.FieldNameConstants;

@AllArgsConstructor
public class DescriptionDTO {

    private final String descriptionContent;

    @FieldNameConstants.Exclude
    private static final int MAX_LENGTH = 200;

}
