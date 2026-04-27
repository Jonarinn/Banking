package lib.models;

import jakarta.persistence.*;

import java.time.Instant;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recordId;
    public Long getRecordId()
    {
        return recordId;
    }

    @Column(name = "created_at", updatable = false)
    private Instant createdAt = Instant.now();
    public Instant getCreatedAt()
    {
        return createdAt;
    }

    @Column(name = "changed_at")
    private Instant changedAt = Instant.now();
    public Instant getChangedAt()
    {
        return changedAt;
    }
    public void setChangedAt(Instant changedAt)
    {
        this.changedAt = changedAt;
    }

    @Column(name = "changed_by")
    private String changedBy;
    public String getChangedBy()
    {
        return changedBy;
    }
}
