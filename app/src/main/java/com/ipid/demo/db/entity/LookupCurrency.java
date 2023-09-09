package com.ipid.demo.db.entity;

import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "lookup_currency")
public class LookupCurrency {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "description")
    public String description;

    @ColumnInfo(name = "country")
    public String country;

    @ColumnInfo(name = "status")
    public boolean status;

    @ColumnInfo(name = "created_date")
    @Nullable
    public String createdDate;

    @ColumnInfo(name = "last_modified_date")
    @Nullable
    public String lastModifiedDate;
}
