package az.atlacademy.localnews.dto;

import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class NewsDto {

    String title;
    String newsContent;
    LocalDateTime dateTime;

}
