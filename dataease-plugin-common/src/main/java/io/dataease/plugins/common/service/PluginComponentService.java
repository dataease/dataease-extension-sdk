package io.dataease.plugins.common.service;

import java.io.InputStream;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public abstract class PluginComponentService {

    public abstract List<String> components();

    protected abstract InputStream readContent(String name);

    public InputStream vueResource(String name) {
        if (StringUtils.isEmpty(name)) return null;
        if (!name.endsWith(".js")) name += ".js";

        return readContent(name);
    }
    
}
