package io.dataease.plugins.view.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PluginChartExtFilter implements Serializable {

    private String componentId;
    private String fieldId;
    private String operator;
    private List<String> value;
    private List<String> viewIds;
    private PluginDatasetTableField datasetTableField;
}
