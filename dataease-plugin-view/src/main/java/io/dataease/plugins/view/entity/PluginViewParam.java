package io.dataease.plugins.view.entity;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class PluginViewParam {

    private PluginViewSet pluginViewSet;

    private List<PluginViewField> pluginViewFields;

    private List<PluginChartFieldCustomFilter> pluginChartFieldCustomFilters;

    private List<PluginChartExtFilter> pluginChartExtFilters;

    private PluginViewLimit pluginViewLimit;

    private Long userId;

    public List<PluginViewField> getFieldsByType(String type) {
        return pluginViewFields.stream().filter(field -> StringUtils.equals(field.getTypeField(), type)).collect(Collectors.toList());
    }
}
