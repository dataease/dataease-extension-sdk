package io.dataease.plugins.view.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class PluginViewType implements Serializable {
    private static final long serialVersionUID = -2715025716608100657L;

    private String render;

    private String category;

    private String value;
}
