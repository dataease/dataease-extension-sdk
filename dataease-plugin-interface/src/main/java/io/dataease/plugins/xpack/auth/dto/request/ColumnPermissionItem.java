package io.dataease.plugins.xpack.auth.dto.request;

import lombok.Data;

@Data
public class ColumnPermissionItem {
    private String id;
    private String name;
    private Boolean selected = false;
    private String opt;
}
