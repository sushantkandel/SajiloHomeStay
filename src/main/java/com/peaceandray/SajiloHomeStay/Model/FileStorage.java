package com.peaceandray.SajiloHomeStay.Model;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.persistence.Entity;

@Entity
@Data
@ConfigurationProperties(prefix = "file")
public class FileStorage {

    private String uploadDir;

    public String getUploadDir() {
        return uploadDir;

        }

    public void setUploadDir(String uploadDir) {
        this.uploadDir = uploadDir;
    }
}
