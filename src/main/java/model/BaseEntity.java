package model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class BaseEntity {
    @Id
    private ObjectId _id_;
    private Boolean isDeleted;

}
