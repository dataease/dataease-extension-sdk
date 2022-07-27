package io.dataease.plugins.common.dto;

import lombok.Data;

/**
 * Author: wangjiahao
 * Date: 2022/7/27
 * Description:
 */
@Data
public class DatasourceBaseType {
    private String type;

    private String name;

    public DatasourceBaseType() {
    }

    public DatasourceBaseType(String type, String name) {
        this.type = type;
        this.name = name;
    }
}
