package io.dataease.plugins.view.service;

import io.dataease.plugins.common.service.PluginComponentService;
import io.dataease.plugins.view.entity.PluginViewType;


public abstract class ViewPluginService extends PluginComponentService {


    public abstract PluginViewType viewType();

    public abstract Object format(Object param);
}
