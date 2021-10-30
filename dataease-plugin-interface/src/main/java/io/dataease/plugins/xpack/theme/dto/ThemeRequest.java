package io.dataease.plugins.xpack.theme.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;


@Data
public class ThemeRequest implements Serializable{

    private ThemeDto themeDto;

    private List<ThemeItem> themeItems;
}
