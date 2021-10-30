package io.dataease.plugins.xpack.theme.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import io.dataease.plugins.common.service.PluginComponentService;
import io.dataease.plugins.xpack.theme.dto.ThemeDto;
import io.dataease.plugins.xpack.theme.dto.ThemeItem;
import io.dataease.plugins.xpack.theme.dto.ThemeRequest;

public abstract class ThemeXpackService extends PluginComponentService{

    public abstract List<ThemeDto> themes();

    public abstract void save(ThemeRequest request, MultipartFile file);

    public abstract List<ThemeItem> queryItems(int id);

    public abstract void deleteTheme(int id);
    
}
