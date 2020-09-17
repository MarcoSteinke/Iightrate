package net.bestofcode.lightrate.persistence.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import net.bestofcode.lightrate.domain.model.RatingID;
import net.bestofcode.lightrate.web.security.IP;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@Getter
@ToString
public class RatingDTO {

    private final TitleDTO title;
    private final DescriptionDTO description;

    @Getter
    private final RatingID ratingID;
    private Integer count;
    private Double rating;
    private Integer sum;
    private final List<IP> listOfUsers;

    private final LocalDateTime dateOfCreation;
}
