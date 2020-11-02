package com.quelp.quelpbackend.models;

import com.vladmihalcea.hibernate.type.array.IntArrayType;
import com.vladmihalcea.hibernate.type.array.StringArrayType;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@TypeDefs({
        @TypeDef(
                name = "string-array",
                typeClass = StringArrayType.class
        ),
        @TypeDef(
                name = "int-array",
                typeClass = IntArrayType.class
        )
})
@MappedSuperclass
public class BaseEntity {
    @Id
    private Long id;
}
