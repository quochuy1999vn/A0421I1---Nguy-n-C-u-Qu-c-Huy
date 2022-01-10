package com.music_validation.entity;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "music")
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Pattern(regexp = "^[a-zA-Z!@#\\$%\\^\\&*\\)\\(+=._-]{2,}$", message = "Tên không chứa ký tự đặc biệt")
    @Size(max = 800)
    private String name;

    @NotEmpty
    @Pattern(regexp = "^[a-zA-Z!@#\\$%\\^\\&*\\)\\(+=._-]{2,}$", message = "Tên không chứa ký tự đặc biệt")
    @Size(max = 300)
    private String nameArtist;

    @NotEmpty
    @Pattern(regexp = "^[a-zA-Z!@#\\$%\\^\\&*\\)\\(+=._-]{2,}$", message = "Tên không chứa ký tự đặc biệt, chỉ chấp nhập ','")
    @Size(max = 1000, message = "Dưới 1000 ký tự")
    private String type;

    public Music() {
    }

    public Music(Long id, String name, String nameArtist, String type) {
        this.id = id;
        this.name = name;
        this.nameArtist = nameArtist;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameArtist() {
        return nameArtist;
    }

    public void setNameArtist(String nameArtist) {
        this.nameArtist = nameArtist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
