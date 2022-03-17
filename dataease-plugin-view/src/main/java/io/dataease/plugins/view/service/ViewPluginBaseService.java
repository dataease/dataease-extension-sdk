package io.dataease.plugins.view.service;

import io.dataease.plugins.view.entity.*;

import java.util.List;

public interface ViewPluginBaseService {


    PluginSingleField buildField(String dsType, PluginViewField pluginViewField, PluginViewSQL tableObj, int index);

    String customWhere(String dsType, List<PluginChartFieldCustomFilter> filters, PluginViewSQL tableObj);

    String panelWhere(String dsType, List<PluginChartExtFilter> pluginChartExtFilters, PluginViewSQL tableObj);

    PluginViewSQL getTableObj(PluginViewSet pluginViewSet);
}