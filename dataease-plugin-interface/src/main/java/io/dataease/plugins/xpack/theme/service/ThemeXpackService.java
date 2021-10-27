package io.dataease.plugins.xpack.theme.service;

import java.util.List;

import io.dataease.plugins.common.service.PluginComponentService;
import io.dataease.plugins.xpack.theme.dto.ThemeDto;
import io.dataease.plugins.xpack.theme.dto.ThemeItem;
import io.dataease.plugins.xpack.theme.dto.ThemeRequest;

public abstract class ThemeXpackService extends PluginComponentService{

    public abstract List<ThemeDto> themes();

    public abstract void save(ThemeRequest request);

    public abstract List<ThemeItem> queryItems(int id);
    
}
