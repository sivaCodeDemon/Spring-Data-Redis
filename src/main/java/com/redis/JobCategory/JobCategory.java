package com.redis.JobCategory;

import lombok.Data;

import java.io.Serializable;

@Data
public class JobCategory implements Serializable {
    private long id;
    private String job_Category;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getJob_Category() {
        return job_Category;
    }

    public void setJob_Category(String job_Category) {
        this.job_Category = job_Category;
    }
}
