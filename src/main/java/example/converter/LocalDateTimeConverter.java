package example.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.logging.Logger;

/**
 * Created by stefanlundberg on 15-03-25.
 */
@Converter(autoApply = false)
public class LocalDateTimeConverter implements AttributeConverter<LocalDateTime, Timestamp> {

    private final static Logger logger = Logger.getLogger(LocalDateTimeConverter.class.getName());

    @Override
    public java.sql.Timestamp convertToDatabaseColumn(LocalDateTime entityValue) {
        logger.info("converting to java.sql.Timestamp");
        return Timestamp.valueOf(entityValue);
    }

    @Override
    public LocalDateTime convertToEntityAttribute(java.sql.Timestamp databaseValue) {
        logger.info("converting to java.time.LocalDateTime");
        return databaseValue.toLocalDateTime();
    }
}
