package io.dataease.plugins.xpack.email.dto.request;

import io.dataease.plugins.common.annotation.PluginResultMap;
import lombok.Data;

@PluginResultMap
@Data
public class XpackEmailTaskRequest extends XpackTaskCreateRequest {

    private Long id;

    private String title;

    private String panelId;

    private String recipients;

    private String pixel;

    private Long taskId;

    private byte[] content;

    private String viewIds;

    private String recisetting;

    private String conditions;
}
