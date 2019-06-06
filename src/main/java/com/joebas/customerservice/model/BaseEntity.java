package com.joebas.customerservice.model;
import lombok.Data;
import org.springframework.data.annotation.*;

import java.io.Serializable;
import java.sql.Date;

@Data
public abstract class BaseEntity  implements Serializable{

        @Id
        private String id;

        @CreatedBy
        private String createdBy;

        @CreatedDate
        private Date createdDate;

        @LastModifiedBy
        private String updatedBy;

        @LastModifiedDate
        private Date updatedDate;

        @Version
        private Long version;



        private Boolean delete = Boolean.FALSE;


}
