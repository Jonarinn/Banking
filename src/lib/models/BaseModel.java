package lib.models;

import jakarta.persistence.*;

@MappedSuperclass
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recordId;

    public Long getRecordId()
    {
        return recordId;
    }
}
