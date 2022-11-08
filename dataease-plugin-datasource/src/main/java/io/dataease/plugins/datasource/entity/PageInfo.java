package io.dataease.plugins.datasource.entity;

import lombok.Data;

@Data
public class PageInfo {
    private long goPage;
    private long pageSize;
    private String dsVersion;
}
