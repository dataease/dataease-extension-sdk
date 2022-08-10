package io.dataease.plugins.xpack.theme.service;

import java.util.List;

import io.dataease.plugins.xpack.theme.dto.*;
import org.springframework.web.multipart.MultipartFile;

import io.dataease.plugins.common.service.PluginComponentService;

public abstract class ThemeXpackService extends PluginComponentService{

    public abstract List<ThemeDto> themes();

    public abstract void save(ThemeRequest request, MultipartFile file);

    public abstract void addTheme(ThemeCreateRequest request);

    public abstract void renameTheme(ThemeRenameRequest request);

    public abstract List<ThemeItem> queryItems(int id);

    public abstract void deleteTheme(int id);
    
}
